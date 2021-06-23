package quanlydatdat;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Giao Dich Nha Dat");
            System.out.println("1. Them giao dich");
            System.out.println("2. Tinh tong so luong");
            System.out.println("3. Xoa giao dich");
            System.out.println("4. Tinh tien giao dich");
            System.out.println("5. Tim giao dich theo ma");
            System.out.println("6. Sap xep giao dich");
            System.out.println("7. Hien thi");
            System.out.println("8. Thoat ra");
            System.out.println("Moi ban chon: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Giao dich Dat");
                    System.out.println("2. Giao dich Nha");
                    int choice3 = Integer.parseInt(sc.nextLine());
                    QuanLyGiaoDich.themGiaoDich(choice3);
                    break;
                case 2:
                    System.out.println("1. Giao dich Dat");
                    System.out.println("2. Giao dich Nha");
                    int choice2 = Integer.parseInt(sc.nextLine());
                    QuanLyGiaoDich.tongSoluong(choice2);
                    break;
                case 3:
                    QuanLyGiaoDich.xoaGiaoDichTheoNgay();
                    break;
                case 4:
                case 5:
                    QuanLyGiaoDich.timGiaoDich();
                    break;
                case 6:
                    QuanLyGiaoDich.sapXep();
                    break;
                case 7:
                    QuanLyGiaoDich.showGiaoDich();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
