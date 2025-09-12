import java.util.Scanner;
public class LongestWord{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = sc.nextLine();
		int length=0;
		String[] words = s.split(" ");
		for(int i=0;i<words.length;i++){
			if(words[i].length()>length) length=i;
		}
		System.out.println("Longest Word in sentence: "+words[length]);
	}
}
