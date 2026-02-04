import java.util.*;
public class sumOf2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] arr2 = new int[4][4];
        int[][] sum = new int[4][4];

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                arr2[i][j]= sc.nextInt();
                sum[i][j] = arr1[i][j] + arr2[i][j];
                }
        }


        for(int i=0;i<sum[0].length;i++){
        System.out.println(Arrays.toString(sum[i]));
        }
        sc.close();
    }
}
