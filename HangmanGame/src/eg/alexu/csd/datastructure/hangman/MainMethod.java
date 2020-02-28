package eg.alexu.csd.datastructure.hangman;
import java.util.Scanner;
public class MainMethod {
	public static char [] underscore;
	public static String secretword,guess;
	public static int max=5;
	public static void main(String[] args) throws Exception {
		Hangman hg=new Hangman();int l;
		secretword=hg.selectRandomSecretWord();
		underscore=new char[secretword.length()];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter word:");
		for(l=0;l<secretword.length();l++) {
		    underscore[l]='-';
			System.out.printf("%c",underscore[l]);
		}
		char c=input.nextLine().charAt(0);
		guess=hg.guess(c);
		System.out.println(guess);
     while(guess.compareTo(secretword)!=0) {
			c=input.nextLine().charAt(0);
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
}
