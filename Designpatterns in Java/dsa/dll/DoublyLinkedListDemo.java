package com.cts.dsa.dll;

class Node {
	int data;
	Node prev;
	Node next;

	public Node(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

class DoublyLinkedList {
	private Node head;
	private Node tail;

	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	// Add a node to the end of the list
	public void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
			return;
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}

	// Insert a node at the beginning
	public void prepend(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
			return;
		}
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
	}

	// Delete a node with a given value
	public void deleteNodeByValue(int data) {
		Node currentNode = head;

		while (currentNode != null) {
			if (currentNode.data == data) {
				// Handle head and tail cases
				if (currentNode.prev != null) {
					currentNode.prev.next = currentNode.next;
				} else {
					head = currentNode.next;
				}
				if (currentNode.next != null) {
					currentNode.next.prev = currentNode.prev;
				} else {
					tail = currentNode.prev;
				}
				return;
			}
			currentNode = currentNode.next;
		}
	}

	// Print the list
	public void printList() {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " <-> ");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}
}

public class DoublyLinkedListDemo {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();

		dll.append(10);
		dll.append(20);
		dll.append(30);
		dll.prepend(5);

		dll.printList(); // 5 <-> 10 <-> 20 <-> 30 <-> null

		dll.deleteNodeByValue(20);
		dll.printList(); // 5 <-> 10 <-> 30 <-> null
	}
}
