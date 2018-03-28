
public class NVHD extends Nhanvien {
	protected int hsLuong;
	protected int soNamCT;
	public NVHD(String ten,String tenPhong,int luong,int soNam) {
		super(ten,tenPhong);
		hsLuong = luong;
		soNamCT = soNam;
	}
	
	public String loaiNV() {
		return "NVHD";
	}
	
	public int layLuong() {
		return hsLuong;
	}
	
	
}
