package multiinheritance;

public class city extends state{
	private String cityname;
	private float area;
	
	
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "city [cityname=" + cityname + ", area=" + area + ", getStatename()=" + getStatename()
				+ ", getLanguage()=" + getLanguage() + ", getCountryname()=" + getCountryname() + ", getCapital()="
				+ getCapital() + "]";
	}
	
	
}
