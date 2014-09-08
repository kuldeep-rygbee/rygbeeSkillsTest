import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Given a string remove the consecutive dulicate characters from it keeping the original order.
 * 
 * @author Kuldeep
 *
 */
public class Question2
{
	public static void main(String args[])
	{
		String ans="";						
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char nowChar;		// nowChar contain a current scanned character
		int lastChar=-1;	// lastChar contain a last scanned character
		try{
			nowChar=(char)(br.read());
			ans+=nowChar;				// first character is added to ans String
			lastChar=nowChar;			
			while(nowChar!='\n' && nowChar!=-1)		// scan until a new line is not found
			{
				if(nowChar!=lastChar)		// if now Char is not the same as last scanned character 
				{							// than add last character to ans
					lastChar=nowChar;		// and last char is Replaced with nowCha
					ans+=nowChar;
				}
				nowChar=(char)(br.read());
			}
		}catch(Exception e)
		{
			System.err.println("Given character is not an ASCII character");
		}
		
		System.out.println(ans);
		
	}
}
