package quanLyCanBo;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
	private static ArrayList<CongNhan> listCongNhan = new ArrayList<CongNhan>();
	private static ArrayList<KySu> listKySu = new ArrayList<KySu>();
	private static ArrayList<NhanVien> listNhanVien = new ArrayList<NhanVien>();
	//nhap cong nhan
	//neu nhap nguoi cuoi cung thi stt = 0
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
					CongNhan congNhan = new CongNhan();
					for(int i = 0; i < listCongNhan.size(); i++)
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
					KySu kySu = new KySu();
					for(int i = 0; i < listKySu.size(); i++)
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
					NhanVien nhanVien = new NhanVien();
					for(int i = 0; i < listNhanVien.size(); i++)
					{
						if(nhanVien.getHoTen() == name)
							System.out.printf("%-15s %-15s %-10s %-15s %-15s \n",nhanVien.getHoTen(),nhanVien.getNamSinh(),nhanVien.getDiachi(),nhanVien.isGioTinh(),nhanVien.getCongViec());
					}
				}
			}
}
