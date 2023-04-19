package handle;

import entity.Account;
import show.Show;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuHandle {
    public void Menu(Scanner sc) {
        ArrayList<Account> accounts = new ArrayList<>();
        AccountHandle accountHandle = new AccountHandle();
        Account account = accountHandle.inputAccount(sc);
        accounts.add(account);
        Show show = new Show();
        do {
            // Hiển thị màn hình chọn
            show.showMenu();
            int chosse = 0;
            // Bắt lỗi người dùng nhập sai
            try {
                chosse = Integer.parseInt(sc.nextLine());
                while (chosse < 0 || chosse > 4) {
                    System.out.println("Số bạn chọn không phù hợp hay chọn lại!!!");
                    chosse = Integer.parseInt(sc.nextLine());
                }


            } catch (Exception a) {
                System.out.println("Sai định dạng mời chọn đúng 1 trong 4 mục trên !!!");
                chosse = Integer.parseInt(sc.nextLine());
            }
            // Thoát
            if (chosse == 5) break;


            if (chosse == 1) {
                //  hàm hiển thị
                account.displayInfo();

            } else if (chosse == 2) {
                System.out.println("Mời bạn nhập số tiền nạp vào");
                double amount = 0;
                try {
                    amount = Double.parseDouble(sc.nextLine());
                } catch (Exception q) {
                    System.out.println("Sai định dạng mời nhập kiểu số ");
                    amount = Double.parseDouble(sc.nextLine());
                }
                //hàm nạp tiền
                account.recharge(amount);

            } else if (chosse == 3) {
                System.out.println("Mời bạn nhập số tiền rút ra");
                double amount = 0;
                try {
                    amount = Double.parseDouble(sc.nextLine());
                } catch (Exception q) {
                    System.out.println("Sai định dạng mời nhập kiểu số ");
                    amount = Double.parseDouble(sc.nextLine());
                }
                //hàm Rút tiền
                account.recharge(-amount);

            } else if (chosse == 4) {
                System.out.println("Mời bạn nhập Email mới: ");
                String email = sc.nextLine();
                // Đổi email
                account.changeEmail(email);

            }

        } while (true);
    }
}
