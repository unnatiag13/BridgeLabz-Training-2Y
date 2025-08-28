import java.util.Scanner;
public class checkInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double sum = 0.0;
        int i=0;
        while(true){
            arr[i] = sc.nextDouble();
            if(arr[i]<=0) break;
            i+=1;
            if(i>=10) break;
        }
        for(i=0;i<10;i++){
            sum+=arr[i];
        }
        System.out.println("Sum is: "+sum);
    }
}
