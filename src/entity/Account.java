package entity;

import Iinterface.IAccount;

import java.util.Scanner;

public class Account implements IAccount {
    //tên tài khoản
    private String name;
    // email chứa tài khoản
    private String email;
    // số tài khoản
    private double accountNumber;
    // số dư tài khoản
    private double accountBalance;



    public Account(String name, String email, double accountNumber, double accountBalance) {
        this.name = name;
        this.email = email;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    // Nạp tiền
    public void recharge(double amount) {
         this.accountBalance+=amount ;

    }

    @Override
    //đổi email
    public void changeEmail(String email) {
       this.email=email;

    }

    @Override
    // in ra
    public void displayInfo() {
        System.out.println(this);

    }

    @Override
    // Hiển thị
    public String toString() {
        return "Account{" +
                " Tên: " + name + '\'' +
                ", Địa chỉ email: " + email + '\'' +
                ", Số tài khoản: " + accountNumber +
                ", Số dư tài khoản: " + accountBalance +
                '}';
    }
}
