package quanLyCanBo;

import java.util.Scanner;

public class KySu extends CanBo{
	private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	public KySu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KySu(String hoTen, String namSinh, boolean gioTinh, String diachi, String nganhDaoTao) {
		super(hoTen, namSinh, gioTinh, diachi);
		this.nganhDaoTao = nganhDaoTao;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void input() {
		super.input();
		System.out.println("Nhap nganh dao tao:");
		Scanner input = new Scanner(System.in);
		String _nganhDaoTao = input.nextLine();
		setNganhDaoTao(_nganhDaoTao);
	}
	
	@Override
	public String toString()
	{
		return super.toString() + getNganhDaoTao();
	}
}
