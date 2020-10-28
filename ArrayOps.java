public class ArrayOps {
    public static int sum(int[] arr) {
       int Sum=0;
       for (int i=0; i<arr.length;i++) {
           Sum+= arr[i];
       }
       return Sum;
    }
    public static int largest(int[] arr) {
      //returns largest on non-zero array
      int Max = arr[0];
      for (int i=0; i<arr.length;i++) {
        Max = Math.max(Max, arr[i]);
      }
      return Max;
    }
    public static int[] sumRows(int[][] matrix) {
      int[] arr = new int[matrix.length];
      for (int i = 0; i<matrix.length;i++) {
        arr[i] = sum(matrix[i]);
      }
      return arr;
    }
    public static int[] largestInRows (int[][] matrix) {
      int[] arr = new int[matrix.length];
      for (int i = 0; i<matrix.length;i++) {
        arr[i] = largest(matrix[i]);
      }
      return arr;
    }
    public static  int sum(int[][] arr) {
      return sum(sumRows(arr));
    }
    public static int[] sumCols(int[][] matrix) {
      int[] arr = new int[matrix[0].length];
      int Added = 0;
      for (int i=0; i<arr.length;i++) {
        Added = 0;
        for (int j=0; j<matrix.length;j++) {
          Added += matrix[j][i];
        }
        arr[i] = Added;
      }
      return arr;
    }
    public static boolean isRowMagic(int[][] matrix) {
      for (int i=0; i<matrix.length-1;i++) {
        if(sum(matrix[i]) != sum(matrix[i+1])) {
          return false;
        }
      }
      return true;
    }
    public static boolean isColMagic(int[][] matrix) {
      int[] arr= sumCols(matrix);
      for (int i=0; i<arr.length-1;i++) {
        if (arr[i] != arr[i+1]) {
          return false;
        }
      }
      return true;
    }
    public static boolean isLocationMagic(int[][] matrix, int row, int col) {
      int[] RowSum = sumRows(matrix);
      int[] ColSum = sumCols(matrix);
      return RowSum[row]  == ColSum[col];
    }

}
