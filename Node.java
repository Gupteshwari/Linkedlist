package demo;

public class Node {

	public Integer data;
	public Node next;
	
	// First Node 
	public Node(Integer data)
	{
		this.data = data;
		next = null;
	}
	
	//CASE 1: empty linked list prepend method
	
/**	-----|----
	|    |    | <--- n
	-----|----
	*/
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.prepend(2);
		list.prepend(4);
		list.prepend(1);
		list.prepend(5);
		System.out.println("prepend    "+list);
		list.append(67);
		list.append(0);
		System.out.println("append     "+ list);
		list.removeFirst();
		list.removeFirst();
		System.out.println("removeFirst"+list);
		list.removeLast();
		list.removeLast();
		System.out.println("removeLast "+list);
		
		list.prepend(34);
		list.prepend(23);
		list.removeAt(3);
		System.out.println("removeAt "+list);
	}

}
