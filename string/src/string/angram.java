package string;
import java.util.*;
public class angram {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String input1=s.next();
		String input2=s.next();
		
		char c1[]=input1.toCharArray();
		char c2[]=input2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		input1=new String(c1);
		input2=new String(c2);
		if(input1.equals(input2))
			System.out.println(true);
		else
			System.out.println(false);
		
		

	}

}
