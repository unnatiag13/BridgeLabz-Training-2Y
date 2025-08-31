import java.util.Scanner;
public class ArrayCopy2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int columns = sc.nextInt();

        int[][] arr2D = new int[rows][columns];
        for(int i=0;i<arr2D.length;i++){
            for(int j=0;j<arr2D[i].length;j++){
                arr2D[i][j] = sc.nextInt();
            }
        }

        int[] arr = new int[rows*columns];
        int index=0;
        for(int i=0;i<arr2D.length;i++){
            for(int j=0;j<arr2D[i].length;j++){
                arr[index++] = arr2D[i][j]; 
            }
        }
        for(int i=0;i<arr.length;i++){
             System.out.print(arr[i] + " ");
        }
       
    }
}
