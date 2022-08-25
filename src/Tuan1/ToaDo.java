package Tuan1;

public class ToaDo {
	private double x ;
	private double y ;
	private String name ;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ToaDo() {
		
	}
	public ToaDo(double x, double y, String name) {
		super();
		this.x = x;
		this.y = y;
		this.name = name;
	}
	@Override
	public String toString() {
		String s = "";
		s+= s.format("%-3s(%-3s;%-3s)",getName(),getX() ,getY());
		return s;
	}
	
}
