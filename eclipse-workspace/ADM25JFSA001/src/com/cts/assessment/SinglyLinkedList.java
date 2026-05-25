package com.cts.assessment;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class SinglyLinkedList {

	Node head;

	public void append(int data) {
		// Step 1 : create a new node for this data
		// Step 2 : Check if head is null. If yes assign new node to head
		// Else traverse the list till the last element. Set the next of the last
		// element
		// to new node

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}

		current.next = newNode;
	}

	public void reverse() {
		// Write the code to reverse the list
		// If the list contains the elements as
		// 1->2->3->4->NULL
		// This method should change the list as
		// 4->3->2->1->NULL
		Node prev = null;
		Node current = head;
		Node next;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;

	}

	void display() {
		// Iterate the list using head and display the elements in the list
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SinglyLinkedList list = new SinglyLinkedList();

		// Use the append method in SinglyLinkedList and add elements to the listObj
		// Display the elements in the listObj using the display method
		// Use the reverse method to reverse the listObj
		// Use the display method and display the reversed listObj
		do {
			System.out.println("Enter the value:");
			int value = scanner.nextInt();
			list.append(value);

			System.out.println("Do you want to add another node? Type Yes/No");
		} while (scanner.next().equalsIgnoreCase("Yes"));

		System.out.print("The elements in the linked list are: ");
		list.display();

		list.reverse();
		System.out.print("The elements in the reversed linked list are: ");
		list.display();

	}
}