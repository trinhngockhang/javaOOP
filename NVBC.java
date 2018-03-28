
public class NVBC extends Nhanvien {
	protected int hsLuong;
	protected int soNamCT;
	public NVBC(String ten,String tenPhong,int luong,int soNam) {
		super(ten,tenPhong);
		hsLuong = luong;
		soNamCT = soNam;
	}
	
	public String loaiNV() {
		return "NVBC";
	}
	
	public int layLuong() {
		return hsLuong;
	}
}
