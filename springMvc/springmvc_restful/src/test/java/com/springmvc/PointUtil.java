package com.springmvc;

import org.junit.Test;

import java.text.NumberFormat;

public class PointUtil {
    /**
     * 存库 补够7位 去小数点
     * @param point
     * @return
     */

    public static String savePoint(String point) {
        int i = point.indexOf(".");

        if (i == -1 || i == point.length() - 1) {
            //没有小数点
            return point;
        }
        int index = -1;
        for (int j = point.length() - 1; j >= 0; j--) {
            System.out.println("  j  " + j);
            if (point.charAt(j) != '0') {
                index = j;
                break;
            }
        }

        if (index != -1) {
            return point.substring(0, index + 1);
        }
        return point;
    }

    @Test
    public void test() {
        String a = "0.030001";

        a = savePoint(a);

        System.out.println(a);

    }


}
