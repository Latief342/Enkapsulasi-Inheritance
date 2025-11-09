/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class Latihan2 {

    static class Account {
        String accNo;
        double balance;

        public Account(String accNo, double balance) {
            this.accNo = accNo;
            this.balance = balance;
        }

        public String getAccNo() { return accNo; }
        public double getBalance() { return balance; }
        
        @Override
        public String toString() {
            return "Account " + accNo + " (Balance: $" + String.format("%.2f", balance) + ")";
        }
    }

    static class SavingsAccount extends Account {
        double interestRate;

        public SavingsAccount(String accNo, double balance, double interestRate) {
            super(accNo, balance);
            this.interestRate = interestRate;
        }

        void addInterest() {
            double interest = this.balance * this.interestRate;
            this.balance += interest;
            System.out.println("   [INFO] Bunga ditambahkan: $" + String.format("%.2f", interest));
        }
        
        @Override
        public String toString() {
            return "Savings " + accNo + " (Balance: $" + String.format("%.2f", balance) + ", Rate: " + (interestRate * 100) + "%)";
        }
    }

    static class CheckingAccount extends Account {
        double overdraftLimit;

        public CheckingAccount(String accNo, double balance, double overdraftLimit) {
            super(accNo, balance);
            this.overdraftLimit = overdraftLimit;
        }
        
        @Override
        public String toString() {
            return "Checking " + accNo + " (Balance: $" + String.format("%.2f", balance) + ", Limit: $" + String.format("%.2f", overdraftLimit) + ")";
        }
    }

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        
        accounts.add(new SavingsAccount("S001", 1000.00, 0.03));
        accounts.add(new CheckingAccount("C001", 500.00, 200.00));
        accounts.add(new SavingsAccount("S002", 2500.00, 0.05));
        accounts.add(new CheckingAccount("C002", 150.00, 100.00));

        System.out.println("--- Status Akun Sebelum Penambahan Bunga ---");
        for (Account acc : accounts) {
            System.out.println(acc);
        }

        System.out.println("\n--- Proses Iterasi dan Penambahan Bunga ---");
        
        for (Account acc : accounts) {
     
            if (acc instanceof SavingsAccount) {
           
                SavingsAccount sa = (SavingsAccount) acc;
                
                System.out.println("Memproses: " + sa.getAccNo() + " (sebelum: $" + String.format("%.2f", sa.getBalance()) + ")");
                
                sa.addInterest();
                
                System.out.println("   [HASIL] Setelah bunga: $" + String.format("%.2f", sa.getBalance()));
            } else {
                System.out.println("Melewatkan: " + acc.getAccNo() + " (bukan Savings Account)");
            }
        }
        
        System.out.println("\n--- Status Akun Akhir ---");
        for (Account acc : accounts) {
            System.out.println(acc);
        }
    }
}