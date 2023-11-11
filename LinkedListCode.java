//import java.util.LinkedList;

public class LinkedListCode {

	public static void main(String[] args) {
		
		Linkedlist nums = new Linkedlist();
	
		nums.add(5);
		nums.add(9);
		
		nums.add(6);
		
//		nums.addFirst(6);
//		System.out.println(nums.get(2));
//		nums.peek();
		
//		System.out.println(nums);
		
		
		nums.addFirst(7);
		
		nums.delete(9);
		
		nums.printValues();
		
	}

}


class nNode
{
	int data;
	nNode next;
	
	public nNode(int data)
	{
		this.data = data;
		next = null;
	}
}


class Linkedlist
{
	nNode head = null;
	
	public void add(int data)
	{
		nNode newNode = new nNode(data);
		
		nNode current = head;
		if(head == null)
			head = newNode;
		else {
			while(current.next != null)
				current = current.next;
			current.next = newNode;
		}	
	}
	
	public void printValues() 
	{
		nNode current = head;
		
		while(current != null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public void addFirst(int data)
	{
		nNode newNode = new nNode(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void delete(int data) 
	{
		nNode current = head;
		while(current.next != null && current.next.data != data) {
			current = current.next;
		}
		
		if(current.next != null)
		{
			current.next = current.next.next;
		}
	}
	
}
