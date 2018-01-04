package com.example.paraga.myjavaapplication;

import android.util.Log;
import android.widget.Toast;

/**
 * Created by parag.a on 14-12-2017.
 */

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
             this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposite(double depositAmount){
        this.balance += depositAmount;
        System.out.print("balance" +balance );

    }

    public void withdraw(double withdrawAmount){
        this.balance= withdrawAmount;
        if(withdrawAmount>this.balance){
            System.out.print("balance" +balance + "too low");
        }
        else{
            balance -= withdrawAmount;
            System.out.print("balance" +balance );
        }
    }

    CertificatePinner certPinner = new CertificatePinner.Builder()
            .add("appmattus.com",
                    "sha256/4hw5tz+scE+TW+mlai5YipDfFWn1dqvfLG+nU7tq1V8=")
            .build();

    OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .certificatePinner(certPinner)
            .build();
}
