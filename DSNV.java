
public class DSNV {
	private Nhanvien[] ds;
	private int soNV;

	public DSNV(int n) {
		ds = new Nhanvien[n];
		soNV = 0;
	}

	public void them(Nhanvien s) {
		if (soNV < ds.length) {
			ds[soNV++] = s;
		}
	}

	public void lietKe() {
		for (int i = 0; i < soNV; i++)
			ds[i].hienThi();
	}

	public void lietKe(String loai) {
		for(int i=0;i<soNV;i++)      
			if (ds[i].loaiNV().equals(loai))   
				ds[i].hienThi(); 
	}
	
	public int tongLuong() {
		int tong = 0;
		for(int i=0;i<soNV;i++) {
			tong += ds[i].layLuong();
		}
		return tong;
	}
}
