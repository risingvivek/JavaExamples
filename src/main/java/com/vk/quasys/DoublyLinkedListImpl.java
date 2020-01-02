package com.vk.quasys;

import com.vk.quasys.dto.Node;

public class DoublyLinkedListImpl <E>{
	
	private Node head;
	private Node tail;
	private int size;
	
	public DoublyLinkedListImpl() {
		size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	public void addFirst(E element) {
		
		Node first = new Node(element, head, null);
		//Add the node as the first one if linked list is empty.
		if (isEmpty()) {
			head = first;
		} else {
			//traverse till the first node and add the node at the beginning.
			
		}
		
	}
}
