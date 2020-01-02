package com.vk.quasys.dto;

public class Node<E> {
	
	E element;
	Node previous;
	Node next;
	
	public Node(E element, Node previous, Node next) {
		super();
		this.element = element;
		this.previous = previous;
		this.next = next;
	}
	
}
