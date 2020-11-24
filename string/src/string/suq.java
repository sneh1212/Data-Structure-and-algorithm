//  Stack using two queues
import java.util.*;
class suq
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	    // Your code here
	    if(q2.isEmpty())
	    return -1;
	    return q2.poll();
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    // Your code here
	    q1.add(a);
	     while(!q2.isEmpty())
	    {
	        q1.add(q2.poll());
	    }
	    
	    while(!q1.isEmpty())
	    {
	        q2.add(q1.poll());
	    }
    }
}