package com.victer.September19th;

import java.util.ArrayList;
import java.util.Arrays;

public class mainTest {
    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }
    public static int integerBreak(int n) {
        if(n == 2){
            return 1;
        }
        int [] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] =2;
        int begin = 3 , fin = n , tem = 0 ;
        for(;begin <= fin; begin++){
            for(int i = 1 ; i <= begin / 2 ; i++){
                tem = tem > (arr[i] * arr[begin - i])? tem : (arr[i] * arr[begin - i]);
            }
            arr[begin] = tem;
        }
+
        return arr[n];
    }
}
