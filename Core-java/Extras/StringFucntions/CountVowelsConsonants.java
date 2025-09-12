import java.util.Scanner;
public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants =0;
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if("aeiou".indexOf(c[i])!=-1){
                vowels+=1;
            }
            else consonants+=1;
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants : "+consonants);

    }
}
