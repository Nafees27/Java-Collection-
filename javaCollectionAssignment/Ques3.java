package javaCollectionAssignment;

public class Ques3 
{
	public static void main(String[] args) throws Exception 
	{
		stack st = new stack();
		
		System.out.println(st.isEmpty());
		
//		st.pop();   will give exception
		
		st.push(5);
		st.push(20);
		st.push(11);
		st.push(3);
		st.push(6);
		st.push(8);
		st.push(10);
		st.push(1);
		st.push(0);
		st.push(12);
		
//		st.push(7);			will give exception
		
		System.out.println(st.isFull());
		System.out.println(st.getMin());
		
		st.pop();
		
		System.out.println(st.getMin());
		
		st.pop();
		st.pop();
		st.pop();
		
		System.out.println(st.getMin());

	}

}

class stack 
{
	protected int[] data;
	protected int tos;
	
	protected int min = 0;
	
	public stack()
	{
		data = new int[10];
		tos = -1;
	}
	
	public stack(int capacity) 
	{
		data = new int[capacity];
		tos = -1;
	}
	
	// Add item to stack 
	void push(int item) throws Exception
	{
		if(isFull()) 
		{
			throw new Exception("Stack is Full");
		}
		else if(isEmpty()) 
		{
			min = item;
			tos++;
			data[tos] = item;
		}
		else 
		{
			tos++;
			int x = item;
			if(item < min) 
			{
				x = 2*item - min;
				min = item;
			}
			data[tos] = x;
		}
		
	}
	
	// Remove item from stack
	void pop() throws Exception
	{
		if(isEmpty())
			throw new Exception(" Stack is Empty");
		/* 
	 		if current minimum is less than the peak(top) element 
	 		then update minimum element of stack	
		 */
		
		int peak = data[tos];
		if(peak >= min) 
		{
			data[tos] = 0;
			tos--;
			
		}
		else 
		{
			int y = 2*min - peak;
			data[tos] = 0;
			tos--;
			min = y;
			
		}

	}
	
	// to know the number of element present in stack
	int size() 
	{
		return tos+1;
	}
	
	// Check whether the stack have item or not
	boolean isEmpty()
	{
		return size() == 0;
	}
	
	// check whether the stack is full or not
	boolean isFull()
	{
		return size() == data.length;
	}
	
	// To get the minimum element of stack
	int getMin() 
	{
		return min;
	}
	
	
}
