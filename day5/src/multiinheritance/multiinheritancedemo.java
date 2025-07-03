package multiinheritance;

public class multiinheritancedemo {
	public static void main(String[] args) {
		city c=new city();
		c.setArea(23000.5f);
		c.setCapital("delhi");
		c.setCityname("pune");
		c.setCountryname("india");
		c.setLanguage("marathi");
		c.setStatename("maharashtra");
		
		System.out.println(c);
	}

}
