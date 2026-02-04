import java.util.*;
public class productOf2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] arr2 = new int[4][4];
        int[][] prod = new int[4][4];

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                arr2[i][j]= sc.nextInt();
                }
        }

        int n=arr2.length;
        int m=arr2[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<m;k++){
                    prod[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }

        for(int i=0;i<prod[0].length;i++){
        System.out.println(Arrays.toString(prod[i]));
        }
        sc.close();
    }
}
