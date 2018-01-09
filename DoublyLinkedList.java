package demo;

public class DoublyLinkedList {
	private DNode header;
	private DNode lastNode;
	private int size;

	// Linked List constructor where first it is empty
	public DoublyLinkedList() {
		header = new DNode(null);
		lastNode = header;
	}

	// CASE 1: empty linked list prepend method
	// CASE 2: non -empty linked list prepend method
	public void prepend(Integer data) {
		DNode n = new DNode(data);
		if (size == 0) {
			header.next = n;
			lastNode = n;
			n.previousNode = header;
			size++;
		} else {
			n.next = header.next;
			n.previousNode = header;
			header.next = n;
			n.next.previousNode = n;
			size++;
		}
	}

	public int getSize() {
		return size;
	}

	public String toString() {
		DNode n = header.next;
		String temp = "";
		while (n != null) {
			temp = temp + " <--" + n.data;
			n = n.next;
		}
		return temp;
	}

	// append new DNode at start
	// if it is in between 2 DNode
	public void append(Integer data) {
		DNode n = new DNode(data);
		if (size == 0) {
			header.next = n;
			lastNode = n;
			n.previousNode = header;
			size++;
		} else {
			lastNode.next = n;
			n.previousNode = lastNode;
			lastNode = n;
			size++;
		}
	}

	// Remove the First DNode
	public void removeFirst() {
		if (size != 0) {
			header.next.next.previousNode = header;
			header.next = header.next.next;
			size--;
		} else
			System.out.println("List is empty.");
	}

	public void removeLast() {
		if (size == 1) {
			header.next = null;
			lastNode = header;
			size--;
		} else if (size != 0) {
			lastNode=lastNode.previousNode;
			lastNode.next=null;
			size--;
		}
	}

	public void insertAt(int index, Integer data) {
		if (index <= 0 || index > size)
			return;
		else if (index == 1)
			prepend(data);
		else if (index == size)
			append(data);
		else
		{
			DNode n = new DNode(data);
			DNode x = header.next;
			int count = 1;
			while (count != index) {
				x = x.next;
				count++;
			}
			n.next=x;
			n.previousNode = x.previousNode;
			x.previousNode.next= n;
			x.previousNode=n;
			size++;
		}

	}

	public void removeAt(int index) {
		if (index <= 0 || index > size)
			return;
		else if (index == 1)
			removeFirst();
		else if (index == size)
			removeLast();
		else {
			DNode n = header.next;
			int count = 1;
			while (count != index) {
				n = n.next;
				count++;
			}
			n.previousNode.next= n.next;
			n.next.previousNode= n.previousNode;
			size--;

		}
	}
	
	public String printReverse(){
		DNode n = lastNode;
		String temp = "";
		int tempsize = size;
		while (tempsize != 0) {
			temp = temp + " -->" + n.data;
			n = n.previousNode;
			tempsize--;
		}
		return temp;
	}
}
