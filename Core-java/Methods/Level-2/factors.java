import java.util.Scanner;
public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factors are: ");
        int[] arr=fact(num);
        for(int p:arr){
            System.out.print(p+" ");
        }
        System.out.println("\nTheir sum: "+sum(arr));
        System.out.println("Their product: "+product(arr));
        System.out.println("Their sum of squares : "+sumOfSquare(arr));
        

    }

    public static int[] fact(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if (n%i==0) count++;
        }
        int[] arr= new int[count];
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                arr[index] = i;
                index++;
            }
        }
        return arr;
    }

    public static int sum(int[] arr){
        int s=0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        return s;
    }
    public static int product(int[] arr){
        int m=1;
        for(int i=0;i<arr.length;i++){
            m*=arr[i];
        }
        return m;
    }
    public static int sumOfSquare(int[] arr){
        int ss=0;
        for(int i=0;i<arr.length;i++){
           ss+=Math.pow(arr[i],2);
        }
        return ss;
    }
}
