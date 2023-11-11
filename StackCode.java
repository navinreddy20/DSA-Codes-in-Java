public class StackCode {

	public static void main(String[] args) {	
		
		Stack nums = new Stack();
		
		nums.pop();
		
//		nums.push(10);
//		nums.push(30);
//		System.out.println(nums.pop());
//		nums.push(70);
//		nums.push(20);
//		System.out.println(nums.peek());
//		nums.push(50);
//		nums.push(90);
		
		nums.printStack();	
	}
}


class Stack{
	
	private int[] arr = new int[5];
	int top;
	int size;
	
	public Stack()
	{
		size = arr.length;
		top = -1;
	}
	
	
	public void push(int data)
	{
//		top++;
		if(top < size)
			arr[++top] = data;
		else
			System.out.println("Stack Overflow");
	}
	
	
	public int pop()
	{
		if(top > -1)
			return arr[top--];
		else {
			System.out.println("Stack Underflow");
		}
		return 0;
	}
	
	
	public int peek()
	{
		return arr[top];
	}
	
	
	public void printStack()
	{
		for(int n: arr)
		{
			System.out.print(n +" ");
		}
		System.out.println();
	}
	
}
