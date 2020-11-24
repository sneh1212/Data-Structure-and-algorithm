package string;
import java.util.*;
public class queue {
	
	static int Queue[] = new int[10];
	static int front=0,rear=0;
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
         while(true)
         {
        	 System.out.println("1.enqueue 2. dequeue 3.display 4.exit enter in number 1 2 3 4 ");
        	 int in=s.nextInt();
        	 if(in==1)
        	 {
        		 System.out.println("enter value");
        		 int val=s.nextInt();
        		 enqueu(val);
        	 }
        	 else if(in==2)
        	 {
        		 dequeu();
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
	static void enqueu(int val)
	{
		
		if(rear<10)
			Queue[rear++]=val;
	}
	static void dequeu()
	{
		if(front<10)
			front++;
	}
	static void display()
	{
		for(int i=front;i<rear;i++)
			System.out.print(Queue[i]+" ");
		System.out.println();
	}

}
