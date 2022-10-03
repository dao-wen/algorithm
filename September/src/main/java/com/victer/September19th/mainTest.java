package com.victer.September19th;

import java.util.ArrayList;
import java.util.Arrays;

public class mainTest {
    private static int test ;
    public static void main(String[] args) {
//        System.out.println(integerBreak1(10));
//        test += fun(1);
//        System.out.println(test);

        System.out.println();
    }
    public static int fun(int num){
        test += num;
        System.out.println(test);
        return num;
    }
    public static void fun1(){
        test += 1;
        System.out.println(test);
    }
    public static void fun2(){
        test += 1;
        System.out.println(test);
    }

    public static int integerBreak(int n) {
        if(n == 2){
            return 1;
        }
        int [] arr = new int[n + 1];
        arr[1] = 1;
        int begin = 2 , fin = n , tem = 0 , firstFigure = 0 , secondFigure = 0;
        for(;begin <= fin; begin++){
            for(int i = 1 ; i <= begin / 2 ; i++){
                firstFigure = i > arr[i] ? i: arr[i];
                secondFigure = (begin - i) > arr[begin - i] ? (begin - i) : arr[begin - i];
                tem = tem > firstFigure * secondFigure? tem : firstFigure* secondFigure;
            }
            arr[begin] = tem;
        }

        return arr[n];
    }
    public static int integerBreak1(int n) {
        if(n < 3){
            return n - 1;
        }
        int [] dp = new int[n + 1];
        dp[2] = 1;
        for(int i = 3 ; i <= n ; i++){
            dp[i] = Math.max(Math.max(2 * (i - 2) , 2 * dp[i - 2] ) , Math.max(3 * (i - 3) , 3 * dp[i - 3] ));
        }
        return dp[n];
    }
    public static int integerBreak2(int n){
        if(n <= 3){
            return n - 1;
        }
        int quotient = n / 3;

        return 0;
    }
}
