package string;



class Queue1 {

	
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
	 void enq(int val)
		{
			if(head==null)
			{
				head=new Node(val);
				tail=head;
				
			}
			else
			{
				
				tail.next=new Node(val);
				tail=tail.next;
			}
		}
	
	 void deq()
	 {
		 if(head!=null)
		 {
			 head=head.next;
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

public class main {

	
	
	
	public static void main(String[] args) {
		Queue1 st = new Queue1();
		st.enq(1);
		st.enq(2);
		
		st.deq();
		
		st.enq(3);
		
		st.deq();
		st.display();
		
		
		

	}
	

}
