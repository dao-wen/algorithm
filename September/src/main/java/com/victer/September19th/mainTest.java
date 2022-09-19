package com.victer.September19th;

import java.util.ArrayList;
import java.util.Arrays;

public class mainTest {
    public static void main(String[] args) {
        System.out.println(integerBreak(3));
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
}
