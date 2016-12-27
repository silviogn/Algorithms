/*
    Problem:
    https://www.hackerrank.com/challenges/sherlock-and-array

*/

package br.hackerrank.sherlockarray;

import java.util.Scanner;

public class SherlockArray {

    static final String NO = "NO";
    static final String YES = "YES";

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int totalTests = Integer.valueOf(scan.nextLine());
        String sData;

        try {
            if (totalTests < 1 || totalTests > 10) {
                throw new Exception();
            }

            for (int i = 0; i < totalTests; i++) {
                int size = Integer.valueOf(scan.nextLine());

                if (size < 1 || size > 10E5) {
                    throw new Exception();
                }

                sData = scan.nextLine();
                System.out.println(exists(converToIntArray(sData, size)));
            }

        } finally {
            scan.close();
        }
    }

    public static int[] converToIntArray(String sData, int size) {
        String[] dataArray = sData.split(" ");
        int[] data = new int[dataArray.length];
        for (int i = 0; i < size; i++) {
            data[i] = Integer.parseInt(dataArray[i]);
        }
        return data;
    }

    public static String exists(int[] data) {

        if (data == null || data.length == 0) {
            return NO;
        }

        if (data.length == 1) {
            return YES;
        }

        if (data.length == 2) {
            if (data[0] == 0 || data[1] == 0) {
                return YES;
            } else {
                return NO;
            }
        }

        int middle = (int) (data.length) / 2;
        int size = data.length;
        int l = 0;
        int r = size - 1;

        int ll = 0;
        int lr = 0;
        int rr = 0;
        int rl = 0;

        while (true) {

            if (l < r) {
                if (l < middle) {
                    ll += l == 0 ? 0 : data[l - 1];
                    l++;
                }
                if (r > middle) {
                    rr += r == (size - 1) ? 0 : data[r + 1];
                    r--;

                }
            } else if (l > r) {

                if (ll == lr || rr == rl) {
                    return YES;
                }

                if (r >= 0) {
                    rr += data[r + 1];
                    rl -= r == 0 ? 0 : data[r];
                    if (r > 0) {
                        r--;
                    }
                }
                
                if (l <= (size - 1)) {
                    ll += data[l - 1];
                    lr -= l == (size - 1) ? 0 : data[l];

                    if (l < (size - 1)) {
                        l++;
                    }
                }

            } else if (l == r) {

                ll += l == 0 ? 0 : data[l - 1];
                rr += r == (size - 1) ? 0 : data[r + 1];

                rl = ll;
                lr = rr;

                if (ll == lr || rr == rl) {
                    return YES;
                }

                r--;
                l++;
            }

            if (r == 0 && l == (size - 1)) {
                break;
            }
        }
        return NO;
    }

    public static String existsSimple(int[] data) {

        if (data == null || data.length == 0) {
            return NO;
        }

        int sumRight = 0;
        int sumLeft = 0;

        for (int i = 0; i < data.length; i++) {
            sumRight += data[i];
        }

        for (int i = 0; i < data.length; i++) {
            sumRight -= data[i];

            if (sumLeft == sumRight) {
                return YES;
            }

            sumLeft += data[i];
        }

        return NO;
    }

}
