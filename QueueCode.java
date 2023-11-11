
public class QueueCode {

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(5);
		queue.enqueue(99);
		
		System.out.println(queue.dequeue());
//		queue.enqueue(12);
		
		queue.show();

	}
}


class MyQueue{
	
	private int front = 0;
	private int rear = -1;
	private int size = 0;
	private int[] arr = new int[4];
	
	public void enqueue(int data)
	{
		rear++;
		arr[rear] = data;
		size++;
	}
	
	public int dequeue()
	{
		int data = arr[front]++;
		front++;
		return data;
	}
	
	public void show()
	{
		for(int i=front; i<size; i++)
		{
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
}
