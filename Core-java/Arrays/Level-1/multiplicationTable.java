import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] multi = new int[10];
        for(int i=1;i<=10;i++){
            multi[i-1] = n*i;
        }
        for(int i=1;i<=10;i++){
            System.out.println(n+" * " + i + " = "+multi[i-1]);
        }
    }
}
