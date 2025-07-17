let gameData = {
    players: ['', '', '', ''],
    currentPlayer: 0,
    currentRound: 1,
    totalRounds: 3,
    scores: [0, 0, 0, 0],
    diceRolled: [false, false, false, false],
    lastRolledNumbers: [0, 0, 0, 0],
    gameStarted: false
};

function startGame() {
    // Get player names
    gameData.players[0] = document.getElementById('player1Name').value || 'Player 1';
    gameData.players[1] = document.getElementById('player2Name').value || 'Player 2';
    gameData.players[2] = document.getElementById('player3Name').value || 'Player 3';
    gameData.players[3] = document.getElementById('player4Name').value || 'Player 4';
    
    // Get number of rounds
    gameData.totalRounds = parseInt(document.getElementById('rounds').value) || 3;
    
    // Update display
    document.getElementById('player1Display').textContent = gameData.players[0];
    document.getElementById('player2Display').textContent = gameData.players[1];
    document.getElementById('player3Display').textContent = gameData.players[2];
    document.getElementById('player4Display').textContent = gameData.players[3];
    
    // Hide modal and show game
    document.getElementById('setupModal').classList.add('hidden');
    document.getElementById('gameContainer').classList.remove('hidden');
    
    gameData.gameStarted = true;
    updateGameUI();
}

function updateGameUI() {
    // Update current turn display
    document.getElementById('currentTurn').textContent = `Current Turn: ${gameData.players[gameData.currentPlayer]}`;
    document.getElementById('currentRound').textContent = `Round: ${gameData.currentRound}`;
    
    // Update dice states
    for (let i = 0; i < 4; i++) {
        const dice = document.getElementById(`dice${i + 1}`);
        dice.classList.remove('active', 'inactive', 'turn-indicator');
        
        if (i === gameData.currentPlayer && !gameData.diceRolled[i]) {
            dice.classList.add('active', 'turn-indicator');
        } else {
            dice.classList.add('inactive');
        }
    }
    
    // Update scores
    for (let i = 0; i < 4; i++) {
        document.getElementById(`player${i + 1}Score`).textContent = gameData.scores[i];
    }
}

function rollDice(playerNumber) {
    const playerIndex = playerNumber - 1;
    
    // Check if it's the player's turn and they haven't rolled yet
    if (playerIndex !== gameData.currentPlayer || gameData.diceRolled[playerIndex]) {
        return;
    }
    
    const dice = document.getElementById(`dice${playerNumber}`);
    dice.classList.add('rolling');
    
    // Generate random number (different from previous roll)
    let newNumber;
    do {
        newNumber = Math.floor(Math.random() * 6) + 1;
    } while (newNumber === gameData.lastRolledNumbers[playerIndex] && gameData.lastRolledNumbers[playerIndex] !== 0);
    
    gameData.lastRolledNumbers[playerIndex] = newNumber;
    gameData.scores[playerIndex] += newNumber;
    gameData.diceRolled[playerIndex] = true;
    
    // Animation duration
    setTimeout(() => {
        dice.classList.remove('rolling');
        updateDiceFace(dice, newNumber);
        
        // Auto next turn after 1 second
        setTimeout(() => {
            nextTurn();
        }, 1000);
    }, 1000);
}

function updateDiceFace(dice, number) {
    const diceFace = dice.querySelector('.dice-face');
    diceFace.innerHTML = '';
    
    // Create dots based on number
    const dotPositions = {
        1: ['center'],
        2: ['top-left', 'bottom-right'],
        3: ['top-left', 'center', 'bottom-right'],
        4: ['top-left', 'top-right', 'bottom-left', 'bottom-right'],
        5: ['top-left', 'top-right', 'center', 'bottom-left', 'bottom-right'],
        6: ['top-left', 'top-right', 'middle-left', 'middle-right', 'bottom-left', 'bottom-right']
    };
    
    const positions = dotPositions[number];
    positions.forEach(position => {
        const dot = document.createElement('div');
        dot.className = `dot ${position}`;
        diceFace.appendChild(dot);
    });
}

function nextTurn() {
    // Move to next player
    gameData.currentPlayer = (gameData.currentPlayer + 1) % 4;
    
    // Check if all players have rolled in this round
    if (gameData.diceRolled.every(rolled => rolled)) {
        // Reset dice rolled status
        gameData.diceRolled = [false, false, false, false];
        
        // Move to next round
        gameData.currentRound++;
        
        // Check if game is over
        if (gameData.currentRound > gameData.totalRounds) {
            endGame();
            return;
        }
    }
    
    updateGameUI();
}

function endGame() {
    // Find winner (highest score)
    let maxScore = Math.max(...gameData.scores);
    let winnerIndex = gameData.scores.indexOf(maxScore);
    
    // Check for ties
    let winners = [];
    for (let i = 0; i < 4; i++) {
        if (gameData.scores[i] === maxScore) {
            winners.push(gameData.players[i]);
        }
    }
    
    let winnerText;
    if (winners.length === 1) {
        winnerText = `🎉 ${winners[0]} wins with ${maxScore} points! 🎉`;
    } else {
        winnerText = `🎉 Tie between: ${winners.join(', ')} with ${maxScore} points! 🎉`;
    }
    
    // Show final scores
    let scoresText = '<h3>Final Scores:</h3>';
    for (let i = 0; i < 4; i++) {
        scoresText += `<p>${gameData.players[i]}: ${gameData.scores[i]} points</p>`;
    }
    
    document.getElementById('winnerInfo').innerHTML = winnerText + scoresText;
    document.getElementById('winnerModal').classList.remove('hidden');
}

function resetGame() {
    gameData = {
        players: ['', '', '', ''],
        currentPlayer: 0,
        currentRound: 1,
        totalRounds: 3,
        scores: [0, 0, 0, 0],
        diceRolled: [false, false, false, false],
        lastRolledNumbers: [0, 0, 0, 0],
        gameStarted: false
    };
    
    // Reset UI
    document.getElementById('winnerModal').classList.add('hidden');
    document.getElementById('gameContainer').classList.add('hidden');
    document.getElementById('setupModal').classList.remove('hidden');
    
    // Reset form
    document.getElementById('player1Name').value = '';
    document.getElementById('player2Name').value = '';
    document.getElementById('player3Name').value = '';
    document.getElementById('player4Name').value = '';
    document.getElementById('rounds').value = 3;
    
    // Reset dice faces
    for (let i = 1; i <= 4; i++) {
        const dice = document.getElementById(`dice${i}`);
        dice.classList.remove('active', 'inactive', 'rolling', 'turn-indicator');
        const diceFace = dice.querySelector('.dice-face');
        diceFace.innerHTML = '<div class="dot"></div>';
    }
}

// Initialize the game
window.onload = function() {
    updateGameUI();
};