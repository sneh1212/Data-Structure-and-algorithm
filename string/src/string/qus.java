package string;

public class qus {
	
	Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    /* The method insert to push element
       into the queue */
    void Push(int x)
    {
	   // Your code here
	   s1.push(x);
	 
	  
	  
	   
	   
    }
	
    
    /* The method remove which return the
      element popped out of the queue*/
    int Pop()
    {
	   // Your code here
	     while(!s1.isEmpty())
	   {
	       s2.push(s1.pop());
	   }
	   if(s2.isEmpty())
	   
	   return -1;
	   int top=s2.pop();
	       while(!s2.isEmpty())
	   {
	       s1.push(s2.pop());
	   }
	   return top;
    }

}
