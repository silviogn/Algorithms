package br.hackerrank.sherlockarray.test;

import br.hackerrank.sherlockarray.SherlockArray;
import org.junit.Assert;
import org.junit.Test;

public class SherlockArrayTest {

    @Test
    public void arrayNull() {
        Assert.assertEquals("NO", SherlockArray.exists(null));
    }

    @Test
    public void arrayEmpty() {
        Assert.assertEquals("NO", SherlockArray.exists(new int[0]));
    }

    @Test
    public void arraySizeOne() {
        int[] data = {1};
        Assert.assertEquals("YES", SherlockArray.exists(data));
    }

    @Test
    public void withSum() {
        int[] data = {0,1,2,3,3,0};
        Assert.assertEquals("YES", SherlockArray.exists(data));
    }

    @Test
    public void withNoSum() {
        int[] data = {10, 10, 30, 58, 77, 889, 63, 25, 2225, 8874, 78, 889, 500};
        Assert.assertEquals("NO", SherlockArray.exists(data));
    }
    

    @Test
    public void hackerRankNoTest() {
        int[] data = {75, 26, 45, 72, 81, 47, 29, 97, 2, 75, 25, 82, 84, 17, 56, 32, 2,
            28, 37, 57, 39, 18, 11, 79, 6, 40, 68, 68, 16, 40, 63, 93, 49, 91, 10, 55, 68, 31, 80, 57,
            18, 34, 28, 76, 55, 21, 80, 22, 45, 11, 67, 67, 74, 91, 4, 35, 34, 65, 80, 21, 95, 1, 52,
            25, 31, 2, 53, 96, 22, 89, 99, 7, 66, 32, 2, 68, 33, 75, 92, 84, 10, 94, 28, 54, 12, 9,
            80, 43, 21, 51, 92, 20, 97, 7, 25, 67, 17, 38, 100, 86};
        Assert.assertEquals("NO", SherlockArray.exists(data));
    }

    @Test
    public void hackerRankYes() {
        int[] data = {1, 2, 3, 3};
        Assert.assertEquals("YES", SherlockArray.exists(data));
    }
    
    @Test
    public void hackerRankYes2() {
        int[] data = {1, 2, 3};
        Assert.assertEquals("NO", SherlockArray.exists(data));
    }

    @Test
    public void hackerRankYes3() {
        int[] data = {20000};
        Assert.assertEquals("YES", SherlockArray.exists(data));
    }
    
    @Test
    public void hackerRankYes4() {
        int[] data = {1, 4, 1};
        Assert.assertEquals("YES", SherlockArray.exists(data));
    }


    @Test
    public void hackerRankNo4() {
        int[] data = {1, 2 };
        Assert.assertEquals("NO", SherlockArray.exists(data));
    }    
    
}
