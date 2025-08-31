import java.util.Arrays;
import java.util.Scanner;
public class oddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<=0) {
            System.err.println("Not a natural number");
            return;
        }

        int[] even = new int[number/2 + 1];
        int[] odd = new int[number/2 + 1];
        int i=0,j=0;
        for(int k=1;k<=number;k++){
            if(k%2==0){
                even[i]=k;
                i++;
            }
            else{
                odd[j]=k;
                j++;
            }
        }

        System.out.println("Even array: "+ Arrays.toString(even));
        System.out.println("Odd array: "+Arrays.toString(odd));


        sc.close();
    }
}
