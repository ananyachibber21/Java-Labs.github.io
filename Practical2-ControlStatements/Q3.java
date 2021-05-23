import java.util.*;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch;
		System.out.print("Enter an alphabet: ");
		ch = sc.next().charAt(0);
        
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Vowel");
		}
		
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("Consonant");
		}
		
		else 
		{
			System.out.println("Error");
		}
	}

}
