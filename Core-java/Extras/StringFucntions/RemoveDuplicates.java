import java.util.Scanner;
public class RemoveDuplicates{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = sc.nextLine();
		String s2="";
		for(char c : s.toCharArray()){
			if(s2.indexOf(c)== -1){
				s2+=c;
			}
		}
		System.out.println("String without duplicates: "+s2);
	}
}
