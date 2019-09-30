package quanLyCanBo;

import java.util.ArrayList;
import java.util.Scanner;


public class MainProgram {
	
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
				QuanLyCanBo.InputCongnhan();
				break;

			case 2:
				System.out.println("\t1.2.Nhap danh sach ky su");
				QuanLyCanBo.InputKySu();
				break;
			case 3:
				System.out.println("\t1.3.Nhap danh sach nhan vien");
				QuanLyCanBo.InputNhanVien();
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
				QuanLyCanBo.showCongNhan();
				break;

			case 2:
				System.out.println("\t2.2.In danh sach ky su");
				System.out.printf("%-15s %-15s %-10s %-15s %-15s \n","Ho ten","Nam sinh","Dia chi", "Gioi tinh","Nganh dao tao");
				QuanLyCanBo.showKySu();
				break;
			case 3:
				System.out.println("\t2.3.In danh sach nhan vien");
				System.out.printf("%-15s %-15s %-10s %-15s %-15s \n","Ho ten","Nam sinh","Dia chi", "Gioi tinh","Cong viec");
				QuanLyCanBo.showNhanVien();
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
				QuanLyCanBo.timKiemCN();
				break;
			case 2:
				System.out.println("3.2.Tim kiem danh sach ky su");
				QuanLyCanBo.timKiemKS();
				break;
			case 3:
				System.out.println("3.3.Tim kiem danh sach nhan vien");
				QuanLyCanBo.timKiemNV();
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
	
	
	
	
}
