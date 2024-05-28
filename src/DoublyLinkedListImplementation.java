class Box
{
	int data;
	Box prePointer;
	Box proPointer;
	
	Box(int data)
	{
		this.data = data;
        this.prePointer = null;
        this.proPointer = null;
	}
}

class DoublyLinkedList
{
	Box head = null;
	
	public void insert(int data)
	{
		Box b = new Box(data);
		if(head == null)
		{
			head = b;
		}
		else
		{
			Box temp = head;
			while(temp.proPointer != null)
			{
				temp = temp.proPointer;
			}
			temp.proPointer = b;
			b.prePointer = temp;
			
		}
	}
	
	public void retrieve()
	{
		if(head == null)
		{
			System.out.println("Empty list!!!");
		}
		else
		{
			Box temp = head;
			while(temp != null)
			{
				System.out.println(temp.data);
				temp = temp.proPointer;
			}
		}
	}
	
}
public class DoublyLinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList li = new DoublyLinkedList();
		li.insert(10);
		li.insert(20);
		li.insert(30);
		
		li.retrieve();

	}

}
