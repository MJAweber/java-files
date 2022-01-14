package string;
import java.io.*;
public class string_buffer {
public static void main(String[] args) throws IOException
{
// stringBuffer is synchronous(one at a time)=> only used to take input
// stringBuilder is Asynchronous (multi at a time):read string character
	//by character=> used to take input and give output
	//bufferedreader take more space than scanner 
		// stringBuffer and stringBuilder is used to create mutable string.
	//mutable: changeable, modificable
	StringBuffer sb=new StringBuffer();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String sur=br.readLine();
	String first=br.readLine();
	String mid=br.readLine();
	sb.append(sur);
	System.out.println(sb);
	sb.append(first);
	System.out.println(sb);
	int n=sur.length();
	sb.insert(n, mid);
	System.out.println(sb);
}
}

