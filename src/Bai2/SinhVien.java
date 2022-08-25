package Bai2;

public class SinhVien {
	private int maSV ; 
	private String hoTen;
	private double diemLT ;
	private double diemTH;
	public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(double diemLT) {
		this.diemLT = diemLT;
	}
	public double getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(double diemTH) {
		this.diemTH = diemTH;
	}
	public double tinhDTB() {
		return (diemLT + diemTH)/2;
	}
	@Override
	public String toString() {
		return "maSV=" + maSV + ", " + hoTen + ", diemLT=" + diemLT + ", diemTH=" + diemTH
				+ ", getDiemLT()=" + getDiemLT() + ", getDiemTH()=" + getDiemTH() + ", tinhDTB()=" + tinhDTB() + "]";
	}

	

}
