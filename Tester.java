import java.io.*;
import java.util.*;
public class Tester {
    public static void main (String[] args) {
        int[] SumTester1 = {1,2,3,4};
        int[] SumTester2 = {};
        int[] SumTester3 = {5,6,7};
        System.out.println (ArrayOps.sum(SumTester1)); //10
        System.out.println (ArrayOps.sum(SumTester2)); //0
        System.out.println (ArrayOps.sum(SumTester3)); //18
        System.out.println();
        System.out.println(ArrayOps.largest(SumTester1)); //4
        System.out.println(ArrayOps.largest(SumTester3)); //7
        System.out.println();
        int[][] sumRowsTester1 = {{1,2,3},{4,5,6}};
        int[][] sumRowsTester2 = {{3,-1,-6}, {4,5,7},{50,-20,10}};
        System.out.println(Arrays.toString(ArrayOps.sumRows(sumRowsTester1))); // {6,15}
        System.out.println(Arrays.toString(ArrayOps.sumRows(sumRowsTester2))); // {-4,16,40})
        System.out.println();
        System.out.println(Arrays.toString(ArrayOps.largestInRows(sumRowsTester1))); // {3,6}
        System.out.println();
        System.out.println(ArrayOps.sum(sumRowsTester1)); //21
        System.out.println(ArrayOps.sum(sumRowsTester2)); //52
        System.out.println();
        System.out.println(Arrays.toString(ArrayOps.sumCols(sumRowsTester1)));
        System.out.println();
        int[][] A = {{1,2,3,4},{2,3,4,1},{3,4,1,2}};
        int[][] B = {{1,3,3},{1,5,5},{1,7,7}};
        int[][] C = {{5,5,5},{5,5,5}};
        System.out.println(ArrayOps.isRowMagic(A)); //true
        System.out.println(ArrayOps.isRowMagic(B)); //false
        System.out.println(ArrayOps.isRowMagic(C)); //true
        System.out.println();
        System.out.println(ArrayOps.isColMagic(A)); //false
        System.out.println(ArrayOps.isColMagic(B)); //false
        System.out.println(ArrayOps.isColMagic(C)); //true
        System.out.println();
        int [][] E = {{2,4,2},{2,2,2}};
        System.out.println(ArrayOps.isLocationMagic(E,0,1)); //false
        System.out.println(ArrayOps.isLocationMagic(E,1,1)); //true
      }
}
