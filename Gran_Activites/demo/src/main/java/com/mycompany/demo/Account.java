/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo;

/**
 *
 * @author Russel
 */
public class Account {
    private double currentBalance;
    private double availableBalance;
    private String accountName;
    private int accountNumber;
    
    public boolean deposit(double amount){
        if (amount > 0) {
            currentBalance += amount;
            System.out.println("Deposited Amount: P:" + amount);
        } else {
            System.out.println("Deposited amount must be positive.");
        }
        
        return true;
    }
    
    public boolean withdraw(double amount) {
        if (availableBalance > amount && amount != 0) {
            availableBalance -= amount;
            availableBalance -= 10; //withdrawal fee
            System.out.println("Current Balance After Deposit: P" + availableBalance);
        } else {
            System.out.println("Insufficient funds.");
        }
        
        return true;
    }
    
    public double checkBalance(double amount) {
       currentBalance = availableBalance;
       return currentBalance;
    }

    public boolean transfer(Account newAccount, double amount) {
      if (availableBalance > 10 && availableBalance >= amount) {
          availableBalance -= amount;
          newAccount.availableBalance += amount;
          
          System.out.println("Transfer Successful. Current Balance: P" + availableBalance);
          return true;
      } else {
          System.out.println("Insufficient funds to transfer. Current Balance: P" + currentBalance);
          return false;
      }
      
    }
    
    @Override
    public String toString() {
        return "Account Information: \n" +
               "Account Name: " + accountName + "\n" +
               "Account Number: " + accountNumber + "\n" +
               "Current Balance: P" + currentBalance + "\n" +
               "Available Balance: P" + availableBalance;
    }

    
    public static void main(String[] args) {
        
        Account account2 = new Account();
        account2.currentBalance = 10000;
        account2.accountName = "Gran Sabandal";
        
        System.out.printf("Account ID: %x %n", account2.accountNumber);
        System.out.printf("Account Name: %s %n", account2.accountName);
        System.out.printf("Current Balance: %f %n", account2.currentBalance);
        System.out.printf("Available Balance: %f %n", account2.availableBalance);
      
        
    }
}