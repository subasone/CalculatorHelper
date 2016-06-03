/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculatorhelper;

import com.leapfrog.calculatorhelper.util.calculationHelper;
import java.util.Scanner;

/**
 *
 * @author onesoft
 */
public class Progarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter First Number: ");
       double fnumber = scanner.nextDouble();
       System.out.println("Enter Second Number: ");
       double snumber = scanner.nextDouble();
       
       calculationHelper calchelp = new calculationHelper();
       
       System.out.println("The sum of two number is : " + calchelp.add(fnumber, snumber));
       System.out.println("The result of substraction of two nos is : " + calchelp.substract(fnumber, snumber));
       System.out.println("The result of division of two nos is : " + calchelp.division(fnumber, snumber));
       System.out.println("The result of multiplication of two nos is : " + calchelp.multiply(fnumber, snumber));
       System.out.println("The power of first number to second number is :  " + calchelp.power(fnumber, snumber));
       System.out.println("The max value between two nos is : " + calchelp.maxValue(fnumber, snumber));
       System.out.println("The min value between two nos is : " + calchelp.minValue(fnumber, snumber));
    }
    
}
