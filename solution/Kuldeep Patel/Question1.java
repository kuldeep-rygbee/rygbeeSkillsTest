import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *	Given a string remove the duplicate characters from it keeping the original order.
 * 
 * @author Kuldeep
 *
 */
public class Question1
{
	public static void main(String args[])
	{
		boolean[] isPresent=new boolean[256];		// this array will contains that a given character had already come
		String ans="";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			int ch=br.read();
			while(ch!='\n' && ch!=-1)	// scan until a new line is found
			{
				if(!isPresent[ch])		// if given character had not come ,than add the input character
				{
					isPresent[ch]=true;
					ans+=(char)ch;
				}
				ch=br.read();
			}
		}catch(Exception e)
		{
			System.err.println("Valid given character is not an ASCII character");
		}
		
		System.out.println(ans);
		
	}
}
