package handle;

import entity.Account;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AccountHandle {
    public Account inputAccount(Scanner sc) {
        System.out.println("Mời bạn nhập Họ và Tên: ");
        String name = sc.nextLine();

        System.out.println("Mời bạn nhập email: ");
        String email = sc.nextLine();
        emailRegex(sc, email);

        System.out.println("Mời bạn nhập Số tài khoản mong muốn");
        double accountNumber=0;
        try {
             accountNumber = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Lỗi sai định dạng, Hãy nhập số .");
            accountNumber=Double.parseDouble(sc.nextLine());
        }


        System.out.println("Số dư tài khoản hiện tại của bạn là ");
        double accountBalance = 0;
        try {
            accountBalance = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Lỗi sai định dạng, Hãy nhập số .");
            accountBalance=Double.parseDouble(sc.nextLine());
        }
        return new Account(name,email,accountNumber,accountBalance);
    }

    public void emailRegex(Scanner sc, String email) {

        String regexPattern = "^(?=.{1,30}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        while (!Pattern.compile(regexPattern)
                .matcher(email)
                .matches()) {
            System.out.println("Mời bạn nhập đúng theo định dạng của email:" +
                    "(example@gmail.com)");
            email = sc.nextLine();
        }
    }

}
