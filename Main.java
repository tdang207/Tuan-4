package tuan_4;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CDList ql = new CDList();
        int luaChon = -1;

        do {
            System.out.println("\n================ MENU QUẢN LÝ CD ================");
            System.out.println("|  1. Thêm CD (tự mở rộng mảng khi đầy)         |");
            System.out.println("|  2. Xóa CD theo mã                            |");
            System.out.println("|  3. Sửa / Cập nhật CD theo mã                 |");
            System.out.println("|  4. Tìm kiếm theo mã                          |");
            System.out.println("|  5. Tìm theo tựa - TIỀN TỐ (bên trái)         |");
            System.out.println("|  6. Tìm theo tựa - HẬU TỐ (bên phải)          |");
            System.out.println("|  7. Tìm theo tựa - GẦN GIỐNG (chứa)           |");
            System.out.println("|  8. Hiển thị danh sách                        |");
            System.out.println("|  9. Thống kê                                  |");
            System.out.println("| 10. Sắp xếp giảm dần theo giá thành           |");
            System.out.println("| 11. Sắp xếp tăng dần theo tựa CD              |");
            System.out.println("|  0. Thoát                                     |");
            System.out.println("=================================================");
            System.out.print("Chọn chức năng: ");

            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
                continue;
            }

            switch (luaChon) {
                case 1:
                    themCD(ql);
                    break;
                case 2:
                    xoaCD(ql);
                    break;
                case 3:
                    capNhatCD(ql);
                    break;
                case 4:
                    timTheoMa(ql);
                    break;
                case 5:
