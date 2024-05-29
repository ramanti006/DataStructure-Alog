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
	
	public void delete(int data)
	{
		if (head == null) {
            System.out.println("Empty list!!!");
            return;
        }

        Box temp = head;

       
        if (temp != null && temp.data == data) {
            head = temp.proPointer; 
            if (head != null) {
                head.prePointer = null; 
            }
            System.out.println(data + " deleted");
            return;
        }

       
        while (temp != null && temp.data != data) {
            temp = temp.proPointer;
        }

        
        if (temp == null) {
            System.out.println(data + " value is not present");
            return;
        }

        
        if (temp.proPointer != null) {
            temp.proPointer.prePointer = temp.prePointer;
        }

        if (temp.prePointer != null) {
            temp.prePointer.proPointer = temp.proPointer;
        }

        System.out.println(data + " deleted");
    }
		
	
	
}
public class DoublyLinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList li = new DoublyLinkedList();
		li.insert(10);
		li.insert(20);
		li.insert(30);
		li.insert(30);
		
		li.retrieve();
		
		System.out.println("After removing");
		li.delete(20);
		li.retrieve();
		

	}

}
