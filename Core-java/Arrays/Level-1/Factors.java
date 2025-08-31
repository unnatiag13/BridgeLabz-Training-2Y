import java.util.Arrays;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxFactor=10;
        int[] factors = new int[maxFactor];
        int n=sc.nextInt();
        int j=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(j == maxFactor){
                    maxFactor*=2;
                    int[] temp = new int[maxFactor];
                    for(int k=0;k<factors.length;k++){
                        temp[k]= factors[k];
                    }
                    factors=temp;
                }
                factors[j++] = i; 
                
            }
        }
       for (int i = 0; i < j; i++) {
    System.out.print(factors[i] + " ");
}

        sc.close();
    }
}
