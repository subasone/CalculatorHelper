/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculatorhelper.util;

/**
 *
 * @author onesoft
 */
public class calculationHelper {
    
    
    public double add(double fnumber,double snumber){
        return fnumber + snumber;
    }
    
    public double substract(double fnumber,double snumber){
        return fnumber - snumber;
    }
    public double multiply(double fnumber,double snumber){
        return fnumber * snumber;
    }
    public double division(double fnumber, double snumber){
        return fnumber / snumber;
    }
    public double power(double fnumber,double snumber){
        double result = 1;
        for(double i = 1; i <= snumber; i++ ){
            result = result * fnumber;
        } 
        return result;
    }
    public double maxValue(double fnumber,double snumber){
        if(fnumber > snumber)
            return fnumber;
        else
            return snumber;
    }
    public double minValue(double fnumber, double snumber){
        if(fnumber > snumber)
            return snumber;
        else
            return fnumber;
    }
}
