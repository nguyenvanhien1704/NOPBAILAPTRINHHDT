package Bai2;

public class TestSV {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(11111,"Nguyễn Thanh An ", 6.50, 8.50);
		SinhVien sv2 = new SinhVien(22222, "Nguyễn Thị Bông", 7.50, 8.00);
		SinhVien sv3 = new SinhVien(33333, "Nguyễn Hoàng Anh", 5.00, 9.00);
		System.out.println(String.format("|%10s|%30s|%10s|%10s|%10s|", "Mã Sinh viên", "Họ Tên ","Điểm Lý Thuyết", "Điểm Thực Hành", "Điểm trung Bình"));
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}

}
