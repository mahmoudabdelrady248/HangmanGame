package eg.alexu.csd.datastructure.hangman;
import java.util.Random;


public class Hangman {
	public void setDictionary(String[]words) {
		try {
			ReadFile rf=new ReadFile();
			words=rf.ReadFile();
		} catch (Exception e) {
			System.out.println("Error!!");
		}
	}
	public String selectRandomSecretWord() {
		try {
			ReadFile rf=new ReadFile();
			String[] secretwordstr=rf.ReadFile();
			Random random=new Random();
			int randomnumber=random.nextInt(secretwordstr.length);
			MainMethod.secretword=secretwordstr[randomnumber];
			if((MainMethod.secretword!=null)&&(MainMethod.secretword.matches("^[a-zA-Z]*$"))&&MainMethod.secretword.equals(""))
				throw new Exception("Buggy word");
			return MainMethod.secretword;
		} catch (Exception e) {
			System.out.println("Error!!");
		}
		return null;
	}
	public String guess(char c) throws Exception {
	   char []display=new char [MainMethod.secretword.length()];
		int k=0;boolean found=false,newline=false;
		for(int i=0;i<MainMethod.secretword.length();i++)
			display[i]=MainMethod.secretword.charAt(i);
		while(MainMethod.l<MainMethod.secretword.length()) {
		    MainMethod.underscore[MainMethod.l]='-';
			System.out.printf("%c",MainMethod.underscore[MainMethod.l]);
			newline=true;MainMethod.l++;
		}
		if(newline==true)
		System.out.printf("\n");
		while(k<MainMethod.secretword.length()) {
			if(Character.toLowerCase(c)==Character.toLowerCase(display[k])) {
				MainMethod.underscore[k]=c;
				k++;found=true;
			}
			else k++;
		}
			if(found==false) {
				setMaxWrongGuesses(MainMethod.max);
				if(MainMethod.max==0) return null;
				
			}
		
		String string=new String(MainMethod.underscore);
		return string.toLowerCase();
	}
	public void setMaxWrongGuesses(int max)  {
	  MainMethod.max--;	
	}
}
