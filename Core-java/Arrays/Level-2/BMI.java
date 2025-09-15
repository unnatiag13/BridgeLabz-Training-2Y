import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of persons: ");
        int n = sc.nextInt();
        int[] weight = new int[n];
        double[] height = new double[n];
        String[] weightstatus = new String[n];
        double[] bmi = new double[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter weight of person "+(i+1));
            weight[i]=sc.nextInt();
            System.out.println("Enter height(in meters) of person "+(i+1));
            height[i]=sc.nextDouble();

            bmi[i] = weight[i]/(height[i]*height[i]);
            if(bmi[i]>=40.0) weightstatus[i] = "Obese";
            else if(bmi[i]>=25.0) weightstatus[i] = "Overweight";
            else if(bmi[i]>=18.5) weightstatus[i] = "Normal";
            else weightstatus[i] = "Underweight";

            System.out.println("Person 1- Height: "+height[i]+"\n        Weight: "+weight[i]+"\n" + //
                                "        BMI: "+ bmi[i]+ "\n        Weight Status: "+weightstatus[i] );
        }


    }
}
