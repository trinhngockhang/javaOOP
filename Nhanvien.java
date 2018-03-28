
public class Nhanvien {
	protected String hoTen;
	protected String phong;
	
	
	public Nhanvien(String ten,String tenPhong) {
		hoTen = ten;
		phong = tenPhong;
	}
	
	public void hienThi() {
		System.out.println("Ten nhan vien: " + hoTen + " phong: " + phong);
	}
	public String loaiNV() {
		return " " ;
	}
	public boolean laNVHDDH() {
		return true;
	}
	public int layLuong() {
		return 2;
	}
	
	public static void main(String args[]) {
		Nhanvien nv1,nv2;
		DSNV k1 = new DSNV(40);
		nv1 = new NVBC("VU DUc Hieu","phong nhat rac",3000,3);
		nv2 = new NVHD("TRan van luong","phong lao dong",2000,3);
//		nv1.hienThi();
//		nv2.hienThi();
		k1.them(nv1);
		k1.them(nv2);
		System.out.println("Tat ca nhan vien: ");
		k1.lietKe();
		System.out.println("nhan vien NVBC: ");
		k1.lietKe("NVBC");
		System.out.println("nhan vien NVHD: ");
		k1.lietKe("NVHD");
		System.out.println("tong Luong: " + k1.tongLuong());
	}
}
