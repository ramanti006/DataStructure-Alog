 class Stack
{
	
	 int maxSize = 6 ;
	 int top = -1 ;
	 int[] arr = new int[maxSize];
	
	
	public void insert(int data)
	{
		
		
		if(top >= maxSize)
		{
			System.out.println("Sorry !!! Square is full");
		}
		else
		{
			top = top +1;
			arr[top] = data;
		}
		
	}
	
	public void retrieve()
	{
		for(int i = 0 ; i <= top ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public void delete()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");	
		}
		else
		{
			int ele = arr[top];
			System.out.println(ele+" deleted");
			top = top -1;
		}
	}
	
	
}
public class StackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack st = new Stack();
		
		st.delete();
		st.insert(12);
		st.insert(13);
		st.insert(14);
		st.insert(12);
	;
		st.delete();
		
		st.retrieve();

	}

}
