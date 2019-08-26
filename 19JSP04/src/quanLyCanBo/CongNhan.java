package quanLyCanBo;

import java.util.Scanner;

public class CongNhan extends CanBo{
	private String bacCongNhan;

	public String getBacCongNhan() {
		return bacCongNhan;
	}

	public void setBacCongNhan(String bacCongNhan) {
		this.bacCongNhan = bacCongNhan;
	}

	public CongNhan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CongNhan(String hoTen, String namSinh, boolean gioTinh, String diachi, String bacCongNhan) {
		super(hoTen, namSinh, gioTinh, diachi);
		this.bacCongNhan = bacCongNhan;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void input() {
		super.input();
		System.out.println("Nhap bac cong nhan:");
		Scanner input = new Scanner(System.in);
		String _bacCongNhan = input.nextLine();
		setBacCongNhan(_bacCongNhan);
	}
	
	@Override
	public String toString()
	{
		return super.toString() +"\t"+ getBacCongNhan();
	}
}
