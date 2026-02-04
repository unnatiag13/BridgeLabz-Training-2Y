import java.util.*;
public class magicSquare {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int sumOfRows=0,sumOfColumns=0 , sumOfDiag1 =0, sumOfDiag2 =0;
        for(int i=0;i<n;i++){
            sumOfDiag1+=arr[i][i];
            sumOfDiag2+=arr[i][n-i-1];
        }
    }
}
