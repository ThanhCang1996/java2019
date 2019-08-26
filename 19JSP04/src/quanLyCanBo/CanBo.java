package quanLyCanBo;

import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private String namSinh;
	private boolean gioTinh;
	private String diachi;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}
	public boolean isGioTinh() {
		return gioTinh;
	}
	public void setGioTinh(boolean gioTinh) {
		this.gioTinh = gioTinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
	public CanBo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CanBo(String hoTen, String namSinh, boolean gioTinh, String diachi) {
		super();
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioTinh = gioTinh;
		this.diachi = diachi;
	}
	public void input()
	{
		Scanner inputHT = new Scanner(System.in);
		System.out.println("nhap ho ten:");
		String _hoTen = inputHT.nextLine();
		setHoTen(_hoTen);
		Scanner inputNS = new Scanner(System.in);
		System.out.println("Nhap nam sinh:");
		String _namSinh = inputNS.nextLine();
		setNamSinh(_namSinh);
		Scanner inputGT = new Scanner(System.in);
		System.out.println("Nhap gioi tinh:");
		boolean _gioiTinh = inputGT.hasNext();
		setGioTinh(_gioiTinh);
		if(isGioTinh())
		{
			String gioiTinh = "Nam";
		}
		else 
		{
			String gioiTinh = "Nu";
		}
		Scanner inputDC = new Scanner(System.in);
		System.out.println("Nhap dia chi:");
		String _diaChi = inputDC.nextLine();
		setDiachi(_diaChi);
	}
	
	@Override
	public String toString()
	{
		return getHoTen()+"\t" + getNamSinh() +"\t" +isGioTinh() +"\t"+ getDiachi();
	}
}
