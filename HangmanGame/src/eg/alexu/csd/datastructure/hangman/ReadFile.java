package eg.alexu.csd.datastructure.hangman;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public String[] ReadFile() throws IOException {
		BufferedReader br1=new BufferedReader(new FileReader("C:\\Users\\M.Abdelrady\\git\\HangmanGame\\HangmanGame\\dictionary.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("C:\\Users\\M.Abdelrady\\git\\HangmanGame\\HangmanGame\\dictionary.txt"));
		int count=0,i;
		while(br1.readLine()!=null)
			count++;
		String []words=new String[count];
		for(i=0;i<count;i++)
			words[i]=br2.readLine();
		br1.close();br2.close();
		return words;
	}
}
