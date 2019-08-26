package quanLyCanBo;

import java.util.ArrayList;
import java.util.Scanner;


public class MainProgram {
	
	private static ArrayList<CongNhan> listCongNhan = new ArrayList<CongNhan>();
	private static ArrayList<KySu> listKySu = new ArrayList<KySu>();
	private static ArrayList<NhanVien> listNhanVien = new ArrayList<NhanVien>();
	
	public static void main(String[] args) {

	//Menu chuong trinh
	Scanner input = new Scanner(System.in);
	System.out.println("1.Nhap can bo");
	System.out.println("2.In danh sach can bo");
	System.out.println("3.Tim kiem danh sach can bo");
	System.out.println("----------------------------------------------");
	
	//Thuc hien chuong trinh
	int inputNumber = 0;
	do {
		System.out.println("Vui long chon chuc nang ban muon thuc hien");
		inputNumber = input.nextInt();
		switch (inputNumber) {
		case 1:
			System.out.println("1.Nhap can bo");
			System.out.println("\t1.1.Nhap Danh sach cong nhan");
			System.out.println("\t1.2.Nhap danh sach ky su");
			System.out.println("\t1.3.Nhap danh sach nhan vien");
			System.out.println("--------------");
			System.out.println("Moi ban chon:");
			Scanner inputNhap = new Scanner(System.in);
			int input1 = inputNhap.nextInt();
			switch (input1) {
			case 1:
				System.out.println("\t1.1.Nhap Danh sach cong nhan");
				InputCongnhan();
				break;

			case 2:
				System.out.println("\t1.2.Nhap danh sach ky su");
				InputKySu();
				break;
			case 3:
				System.out.println("\t1.3.Nhap danh sach nhan vien");
				InputNhanVien();
				break;
			default:
				break;
			}
			break;

		case 2:
			System.out.println("2.In danh sach can bo");
			System.out.println("\t2.1.In danh sach cong nhan");
			System.out.println("\t2.2.In danh sach ky su");
			System.out.println("\t2.3.In danh sach nhan vien");
			System.out.println("\t2.1.In danh sach toan bo can bo");
			System.out.println("-----------------");
			System.out.println("Moi ban chon:");
			Scanner inputIn = new Scanner(System.in);
			int input2 = inputIn.nextInt();
			switch (input2) {
			case 1:
				System.out.println("\t2.1.In danh sach cong nhan");
				System.out.printf("%-15s %-15s %-10s %-15s %-15s \n","Ho ten","Nam sinh","Dia chi", "Gioi tinh","Bac cong nhan");
				showCongNhan();
				break;

			case 2:
				System.out.println("\t2.2.In danh sach ky su");
				System.out.printf("%-15s %-15s %-10s %-15s %-15s \n","Ho ten","Nam sinh","Dia chi", "Gioi tinh","Nganh dao tao");
				showKySu();
				break;
			case 3:
				System.out.println("\t2.3.In danh sach nhan vien");
				System.out.printf("%-15s %-15s %-10s %-15s %-15s \n","Ho ten","Nam sinh","Dia chi", "Gioi tinh","Cong viec");
				showNhanVien();
				break;
			default:
				break;
			}
			break;
		case 3:
			System.out.println("3.Tim kiem danh sach can bo");
			System.out.println("3.1.Tim kiem danh sach cong nhan");
			System.out.println("3.2.Tim kiem danh sach ky su");
			System.out.println("3.3.Tim kiem danh sach nhan vien");
			System.out.println("-----------------------");
			Scanner inputk = new Scanner(System.in);
			int input3 = inputk.nextInt();
			switch (input3) {
			case 1:
				System.out.println("3.1.Tim kiem danh sach cong nhan");
				timKiemCN();
				break;
			case 2:
				System.out.println("3.2.Tim kiem danh sach ky su");
				timKiemKS();
				break;
			case 3:
				System.out.println("3.3.Tim kiem danh sach nhan vien");
				timKiemNV();
				break;
			default:
				break;
			}
	break;
		}
	}
	while(inputNumber != 0);
	System.out.println("ket thuc chuong trinh!");
	}
	
	//nhap cong nhan
	public static void InputCongnhan()
	{
		int stt = 0;
		do
		{
			System.out.println("STT cong nhan:");
			Scanner inputStt = new Scanner(System.in);
			stt = inputStt.nextInt();
			CongNhan cn = new CongNhan();
			cn.input();
			listCongNhan.add(cn);		
		}
		while(stt != 0);
	}
	
	//in cong nhan
	public static void showCongNhan()
	{
		if(listCongNhan.size() == 0)
			System.out.println("Chua co du lieu!");
		else {	
		for(CongNhan congNhan : listCongNhan)
			System.out.printf("%-15s %-15s %-10s %-15s %-15s \n",congNhan.getHoTen(),congNhan.getNamSinh(),congNhan.getDiachi(),congNhan.isGioTinh(),congNhan.getBacCongNhan());
		}
		}
	//nhap ky su
		public static void InputKySu()
		{
			int stt = 0;
			do {
				System.out.println("STT ky su:");
				Scanner inputStt = new Scanner(System.in);
				stt = inputStt.nextInt();
				KySu ks = new KySu();
				ks.input();
				listKySu.add(ks);		
			}
			while(stt != 0);
		}
		
		//in ky su
		public static void showKySu()
		{
			if(listKySu.size() == 0)
				System.out.println("Chua co du lieu");
			else {
			for(KySu kySu : listKySu)
				System.out.printf("%-15s %-15s %-10s %-15s %-15s \n",kySu.getHoTen(),kySu.getNamSinh(),kySu.getDiachi(),kySu.isGioTinh(),kySu.getNganhDaoTao());
			}
		}
		//nhap nhan vien
		public static void InputNhanVien()
		{
			int stt = 0;
			do {
				System.out.println("STT cong nhan:");
				Scanner inputStt = new Scanner(System.in);
				stt = inputStt.nextInt();
				NhanVien nv = new NhanVien();
				nv.input();
				listNhanVien.add(nv);		
			}
			while(stt != 0);
		}
		
		//in nhan vien
		public static void showNhanVien()
		{
			if(listNhanVien.size() == 0)
				System.out.println("chua co du lieu!");
			else {
			for(NhanVien nhanVien : listNhanVien)
				System.out.printf("%-15s %-15s %-10s %-15s %-15s \n",nhanVien.getHoTen(),nhanVien.getNamSinh(),nhanVien.getDiachi(),nhanVien.isGioTinh(),nhanVien.getCongViec());
			}
		}	
		
		//tim kiem theo ten cong nhan
		public static void timKiemCN()
		{
			if(listCongNhan.size() == 0)
				System.out.println("Chua co du lieu de tiem kiem!");
			else {
				System.out.println("Nhap ten can tiem kiem");
				Scanner inputName = new Scanner(System.in);
				String name = inputName.nextLine();
				for(CongNhan congNhan : listCongNhan)
				{
					if(congNhan.getHoTen() == name)
						System.out.printf("%-15s %-15s %-10s %-15s %-15s \n",congNhan.getHoTen(),congNhan.getNamSinh(),congNhan.getDiachi(),congNhan.isGioTinh(),congNhan.getBacCongNhan());
				}
			}
		}
		
		//tim kiem theo ten ky su
		public static void timKiemKS()
		{
			if(listKySu.size() == 0)
				System.out.println("Chua co du lieu");
			else {
			System.out.println("Nhap ten can tiem kiem");
				Scanner inputName = new Scanner(System.in);
				String name = inputName.nextLine();
				for(KySu kySu : listKySu)
				{
					if(kySu.getHoTen() == name)
						System.out.printf("%-15s %-15s %-10s %-15s %-15s \n",kySu.getHoTen(),kySu.getNamSinh(),kySu.getDiachi(),kySu.isGioTinh(),kySu.getNganhDaoTao());
				}
			}
		}
		
		//tim kiem theo ten nhan vien
		public static void timKiemNV()
		{
			if(listNhanVien.size() == 0)
				System.out.println("chua co du lieu!");
			else {
				System.out.println("Nhap ten can tiem kiem");
				Scanner inputName = new Scanner(System.in);
				String name = inputName.nextLine();
				for(NhanVien nhanVien : listNhanVien)
				{
					if(nhanVien.getHoTen() == name)
						System.out.printf("%-15s %-15s %-10s %-15s %-15s \n",nhanVien.getHoTen(),nhanVien.getNamSinh(),nhanVien.getDiachi(),nhanVien.isGioTinh(),nhanVien.getCongViec());
				}
			}
		}
}
