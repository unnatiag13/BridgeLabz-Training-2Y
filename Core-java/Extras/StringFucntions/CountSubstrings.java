import java.util.Scanner;
public class CountSubstring{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		System.out.println("Enter Substring: ");
		String sb = sc.next();
		
		String[] parts = s.split(sb);
		System.out.println("Count of substrings: "+ (parts.length-1));
	}
}
