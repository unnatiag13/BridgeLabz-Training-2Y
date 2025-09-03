import java.util.Scanner;
public class TriangularParkRun {
    public static int calculateRounds(int a, int b, int c) {
        int perimeter = a + b + c;
        int distance = 5000; 
        return distance / perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc.nextInt();
        System.out.print("Enter side 2: ");
        int b = sc.nextInt();
        System.out.print("Enter side 3: ");
        int c = sc.nextInt();

        int rounds = calculateRounds(a, b, c);
        System.out.println("The athlete must complete " + rounds + " rounds.");
    }
}
