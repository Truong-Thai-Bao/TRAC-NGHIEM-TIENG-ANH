package com.ttb.baitap;


import com.ttb.baitap.CauHinh;
import com.ttb.baitap.CauHinh;
import java.io.FileNotFoundException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author USER
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int choice;

        do {
            System.out.println("MENU");
            System.out.println("1. Quan ly nguoi hoc");
            System.out.println("2. Quan ly cau hoi");
            System.out.println("3. Luyen tap");
            System.out.println("4. Thong ke ket qua hoc tap cua hoc vien theo thang");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban (0 de thoat): ");
            choice = CauHinh.SC.nextInt();

            switch (choice) {
                case 1 -> {
                    QLNguoiDung qlND = new QLNguoiDung();
                    int choice1;
                    do {
                        System.out.println("    1. Xem danh sach nguoi hoc");
                        System.out.println("    2. Tra cuu nguoi hoc");
                        System.out.println("    3. Them nguoi hoc");
                        System.out.println("    4. Cap nhat thong tin hoc vien");
                        System.out.println("    5. Xoa thong tin hoc vien");
                        System.out.println("    0. Thoat quan ly nguoi hoc");
                        System.out.print("Nhap lua chon cua ban (0 de thoat): ");
                        choice1 = CauHinh.SC.nextInt();
                        switch (choice1) {
                            case 1 -> {
                                System.out.println("=========DANH SACH NGUOI DUNG=========");
                                qlND.DsNguoiHoc();
                                qlND.hienThiDSNguoiDung();
                                break;
                            }
                            case 2 -> {
                                int choice12;
                                do {
                                    System.out.println("        1. Theo ho ten");
                                    System.out.println("        2. Theo gioi tinh");
                                    System.out.println("        3. Theo ngay sinh");
                                    System.out.println("        4. Theo que quan");
                                    System.out.println("        0. Thoat tra cuu nguoi hoc");
                                    System.out.print("Nhap lua chon cua ban (0 de thoat): ");
                                    choice12 = CauHinh.SC.nextInt();
                                    switch (choice12) {
                                        case 1 -> {
                                        }
                                        case 2 -> {
                                        }
                                        case 3 -> {
                                        }
                                        case 4 -> {
                                        }
                                        case 0 ->
                                            System.out.println("Ket thuc tra cuu nguoi hoc.");
                                        default ->
                                            System.out.println("Lua chon khong hop le. Vui long chon lai.");
                                    }
                                } while (choice12 != 0);
                            }
                            case 3 -> {
                            }
                            case 4 -> {
                            }
                            case 5 -> {
                            }
                            case 0 ->
                                System.out.println("Ket thuc quan ly nguoi hoc.");
                            default ->
                                System.out.println("Lua chon khong hop le. Vui long chon lai.");

                        }
                    } while (choice1 != 0);
                    // Goi cac phuong thuc quan ly nguoi hoc
                }
                case 2 -> {
                    int choice2;
                    do {
                        System.out.println("    1. Xem danh sach cau hoi");
                        System.out.println("    2. Tim cau hoi");
                        System.out.println("    0. Thoat quan ly cau hoi");
                        System.out.print("Nhap lua chon cua ban (0 de thoat): ");
                        choice2 = CauHinh.SC.nextInt();
                        switch (choice2) {
                            case 1 -> {
                            }
                            case 2 -> {
                                int choice22;
                                do {
                                    System.out.println("        1. Theo noi dung cau hoi");
                                    System.out.println("        2. Theo danh muc");
                                    System.out.println("        3. Muc do cau hoi");
                                    System.out.println("        0. Thoat tim cau hoi");
                                    System.out.print("Nhap lua chon cua ban (0 de thoat): ");
                                    choice22 = CauHinh.SC.nextInt();
                                    switch (choice22) {
                                        case 1 -> {
                                        }
                                        case 2 -> {
                                        }
                                        case 3 -> {
                                        }
                                        case 4 -> {
                                        }
                                        case 0 ->
                                            System.out.println("Ket thuc tim cau hoi.");
                                        default ->
                                            System.out.println("Lua chon khong hop le. Vui long chon lai.");
                                    }
                                } while (choice22 != 0);
                            }
                            case 0 ->
                                System.out.println("Ket thuc quan ly cau hoi.");
                            default ->
                                System.out.println("Lua chon khong hop le. Vui long chon lai.");

                        }
                    } while (choice2 != 0);
                    // Goi cac phuong thuc quan ly cau hoi
                }
                case 3 -> {
                    int choice3;
                    do {
                        System.out.println("    Nguoi dung chon dang cau hoi");
                        System.out.println("    1. Multiple Choice");
                        System.out.println("    2. Incomple va Conversation");
                        System.out.println("    0. Thoat luyen tap");
                        System.out.print("Nhap lua chon cua ban (0 de thoat): ");
                        choice3 = CauHinh.SC.nextInt();
                        switch (choice3) {
                            case 1 -> {
                            }
                            case 2 -> {

                            }
                            case 0 ->
                                System.out.println("Ket thuc luyen tap.");
                            default ->
                                System.out.println("Lua chon khong hop le. Vui long chon lai.");

                        }
                    } while (choice3 != 0);
                    // Goi cac phuong thuc luyen tap
                }
                case 4 -> {
                    System.out.println("    Thong ke ket qua hoc tap cua hoc vien");
                    // Goi cac phuong thuc thong ke
                }
                case 0 ->
                    System.out.println("Ket thuc chuong trinh.");
                default ->
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }

        } while (choice != 0);

    }
}
