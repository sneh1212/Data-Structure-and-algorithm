package string;
import java.util.*;
public class stack {
	
	static int stack[] = new int[10];
	static int top=0;
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
         while(true)
         {
        	 System.out.println("1.push 2. pop 3.display 4.exit enter in number 1 2 3 4 ");
        	 int in=s.nextInt();
        	 if(in==1)
        	 {
        		 System.out.println("enter value");
        		 int val=s.nextInt();
        		 push(val);
        	 }
        	 else if(in==2)
        	 {
        		 pop();
        	 }
        	 else if(in==3)
        	 {
        		 display();
        		 
        	 }
        	 else
        	 {
        		 break;
        	 }
        		 
        	 
         }
		
	}
	static void push(int val)
	{
		
		if(top<10)
			stack[top++]=val;
	}
	static void pop()
	{
		if(top!=0)
			top--;
	}
	static void display()
	{
		for(int i=0;i<top;i++)
			System.out.print(stack[i]+" ");
		System.out.println();
	}

}
