package demo;

public class DNode {

	public Integer data;
	public DNode next;
	public DNode previousNode;

	// First Node
	public DNode(Integer data) {
		this.data = data;
		next = null;
	}

	// CASE 1: empty linked list prepend method

	/**
	 * -----|---- | | | <--- n -----|----
	 */

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.prepend(2);
		list.prepend(4);
		list.prepend(1);
		list.prepend(5);
		System.out.println("prepend    " + list);
		list.append(67);
		list.append(0);
		System.out.println("append     " + list);
		list.removeFirst();
		System.out.println("removeFirst" + list);
		list.removeLast();
		System.out.println("removeLast " + list);
		list.insertAt(1, 80);
		list.insertAt(3, 1670);
		list.insertAt(6, 170);
		System.out.println("InsertAt " + list);
		 list.prepend(34);
		 list.prepend(23);
		 list.removeAt(3);
		 System.out.println("removeAt "+list);
		 System.out.println(list.printReverse());
	}

}
