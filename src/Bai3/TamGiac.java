package Bai3;

import java.util.Objects;

public class TamGiac {
	private double ma;
	private double mb;
	private double mc;
	public TamGiac(double ma, double mb, double mc) {
		super();
		this.ma = ma;
		this.mb = mb;
		this.mc = mc;
		
	}
	public double getMa() {
		return ma;
	}
	public void setMa(double ma) {
		this.ma = ma;
	}
	public double getMb() {
		return mb;
	}
	public void setMb(double mb) {
		this.mb = mb;
	}
	public double getMc() {
		return mc;
	}
	public void setMc(double mc) {
		this.mc = mc;
	}
////	public void kieuTamGiac() {
////		if (ma + mb > mc && mb +mc> ma && mc + ma >mc ) {
////			System.out.println("Đây là tam giác thường ");
////		}
////		else  {
////			System.out.println("Đây không phải tam giác ");
////		}
////		return ;
//	}
	public double chuVi() {
		return (ma + mb + mc);		
	}
	public double dienTich()
	{
		
		return (ma +mb +mc)/2;
	}
	public String toString() {
		return "TamGiac [ma=" + ma + ", mb=" + mb + ", mc=" + mc + ", chuVi()=" + chuVi() + ", dienTich()=" + dienTich()
				+ "]";
	}
	

}
