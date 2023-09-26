/*
Given a double-precision number, payment, denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French currency formats. Then print the formatted value as follows:
US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment

Sample Input
12324.134

Sample Output
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €

*/

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();
        
        // Write your code here.
        String us,india,china,france;
        us = NumberFormat.getCurrencyInstance(new Locale("en","US")).format(payment);
        india = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
        china = NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment);
        france = NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}