import java.util.Scanner;
public class Handshakes {
    public static int handshakes(int n) {
        int handshake = (n * (n - 1)) / 2;
        return handshake;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of students: ");
        int students = sc.nextInt();
        System.out.println("No. of possible handshakes: "+ handshakes(students));
    }
}
