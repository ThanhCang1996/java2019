package quanLyCanBo;

import java.util.Scanner;

public class NhanVien extends CanBo{
	private String congViec;

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String hoTen, String namSinh, boolean gioTinh, String diachi, String congViec) {
		super(hoTen, namSinh, gioTinh, diachi);
		this.congViec = congViec;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void input() {
		super.input();
		System.out.println("Nhap cong viec:");
		Scanner input = new Scanner(System.in);
		String _congViec = input.nextLine();
		setCongViec(_congViec);
	}
	
	@Override
	public String toString()
	{
		return super.toString() + getCongViec();
	}
	
}
