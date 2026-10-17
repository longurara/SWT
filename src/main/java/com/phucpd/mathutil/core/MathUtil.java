package com.phucpd.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {
        //thuat toan tinh n! = 1.2.3...n

        if (n < 0 || n > 20){
            throw new IllegalArgumentException("invalid param, n>0 and n<21");

        }

        if ( n == 0 ){
            return 1;
        }

        //sure n tu 1..20
        long result = 1; // init giai thua bang 1, nhan don
                            // code co tinh tao bug giai thua duoc nhan them 10

        for (int i = 1; i <= n; i++) {
            result *=i;
        }
        return result;
    }
}
