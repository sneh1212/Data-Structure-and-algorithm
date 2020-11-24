package string;

 class stack1 {

	
	class Node
	{
		int val;
		Node next=null;
		Node(int data)
		{
			this.val=data;
		}
		
	}
	Node head,tail,prev;
	 void push(int val)
		{
			if(head==null)
			{
				head=new Node(val);
				tail=head;
				
			}
			else
			{
				prev=tail;
				tail.next=new Node(val);
				tail=tail.next;
			}
		}
	 void peek()
	 {
		 if(head!=null)
			 System.out.print(tail.val+" ");
		 
	 }
	 void pop()
	 {
		 if(prev!=null)
		 {   tail=prev;
		     prev.next=null;
		 }
			 
	 }
	 void display()
	 {
		 Node head1=head;
		 while(head1!=null)
		 {
			 System.out.print(head1.val+" ");
			 head1=head1.next;
			 
		 }
	 }
}

public class stack {

	
	
	
	public static void main(String[] args) {
		stack1 st = new stack1();
		st.push(1);
		st.push(2);
		
		st.pop();
		
		st.push(3);
		st.peek();
		st.pop();
		st.display();
		
		
		

	}
	

}
