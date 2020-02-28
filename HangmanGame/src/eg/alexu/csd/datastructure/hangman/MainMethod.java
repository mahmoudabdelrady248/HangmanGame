package eg.alexu.csd.datastructure.hangman;
import java.util.Scanner;
public class MainMethod {
	public static char [] underscore;
	public static String secretword,guess=" ";
	public static int max=20,l;
	public static void main(String[] args) throws Exception {
		Hangman hg=new Hangman();
		try {
		secretword=hg.selectRandomSecretWord();
		underscore=new char[secretword.length()];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter word:");
		char[]a=new char[secretword.length()];
		for(int i=0;i<secretword.length();i++) {
		    a[i]='-';
			System.out.print(a[i]);
		}
		System.out.printf("\n");
	
	while(guess.compareTo(secretword)!=0) {
			char c=input.next().charAt(0);
			guess=hg.guess(c);
			System.out.println(guess);
			if(guess==null)
				break;
			
		}
		if(guess!=null&&guess.compareTo(secretword)==0) {
		 String s=null;
		 System.out.println("Congratulation!!you are winner");
		 System.out.println(s);
		}
		else {
			System.out.println("Sorry!!you lose play again");
			System.out.printf("The word is %s",secretword);
		}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
		
	}

