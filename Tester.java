import java.io.*;
import java.util.*;
public class Tester {
    public static void main (String[] args) {
        int[] SumTester1 = {1,2,3,4};
        int[] SumTester2 = {};
        int[] SumTester3 = {5,6,7};
        System.out.println (ArrayOpps.sum(SumTester1)); //10
        System.out.println (ArrayOpps.sum(SumTester2)); //0
        System.out.println (ArrayOpps.sum(SumTester3)); //18
        System.out.println();
        System.out.println(ArrayOpps.largest(SumTester1)); //4
        System.out.println(ArrayOpps.largest(SumTester3)); //7
        System.out.println();
        int[][] sumRowsTester1 = {{1,2,3},{4,5,6}};
        int[][] sumRowsTester2 = {{3,-1,-6}, {4,5,7},{50,-20,10}};
        System.out.println(Arrays.toString(ArrayOpps.sumRows(sumRowsTester1))); // {6,15}
        System.out.println(Arrays.toString(ArrayOpps.sumRows(sumRowsTester2))); // {-4,16,40})
    }
}
