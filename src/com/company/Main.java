package com.company;

import java.util.Scanner;

public class Main {
    public static int reverse(int a){
        int temp=0,du;
        while(a!=0){
            du = a%10;
            temp = (temp+du)*10;
            a= a/10;
        }
        return temp/10;
    }
    public static boolean isPalindrome(int a){
        if(reverse(a)!=a)
            return false;
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.print("nhap vao gia tri can kiem tra:");
        x = scanner.nextInt();
        System.out.println("dao nguoc cua " + x +" la:"+reverse(x));
        if(isPalindrome(x))System.out.print(x+" la so doi xung!");
        else System.out.print(x+" khong la so doi xung!");

    }
}
