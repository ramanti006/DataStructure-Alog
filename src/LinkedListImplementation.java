class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class LinkedList
{
	Node head = null;
	
	public void insert(int data)
	{
		Node n= new Node(data);
		if(head == null)
		{
			head = n ;
			n.next = null;
		}
		else
		{
			Node temp = head;
			while( temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = n;
			n.next = null;
			
		}
	}
	public void retrieve()
	{
		
		
		if(head ==  null)
		{
			System.out.println("List is empty");
		}
		else
		{
		Node temp = head;
		while( temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		//System.out.println(temp.data);
		}
	}
	
	public void remove(int data)
	{
		
		if(head ==  null)
		{
			System.out.println("List is empty");
		}
		else
		{
			if(head.data == data)
			{
				head = head.next;
			}
			else
			{
				Node t = head;
				while(t.next != null )
				{
					if(t.next.data == data)
					{
						t.next = t.next.next;
					}
					else
					{
						t = t.next;
					}
				}
			}
		}
		
	}
	
	
	
}
public class LinkedListImplementation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList li = new LinkedList();
		
		li.insert(1);
		li.insert(2);
		li.insert(3);
		li.insert(4);
		li.insert(5);
		li.retrieve();
		
		System.out.println("After remove");
		li.remove(3);
		//li.retrieve();
		li.remove(1);
		li.remove(5);
		li.retrieve();
		
	}

}
