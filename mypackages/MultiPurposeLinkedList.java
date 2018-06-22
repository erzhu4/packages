package mypackages;

import myutils.*;

public class MultiPurposeLinkedList {

	private class Node {

		public int data;
		public Node next;
		public Node prev;

		public Node(int input){
			this.data = input;
			this.next = null;
			this.prev = null;
		}
	}

	private Node head = null;
	private Node tail = null;
	private int size = 0;
	private MyUtils utils = new MyUtils();

	public Node getHead(){
		return this.head;
	}

	private int[] makeArrFromNode(Node node){
		int[] result = new int[]{node.data};
		if (node.next != null){
			result = this.utils.concatArrays(result, makeArrFromNode(node.next));
		}
		return result;
	}

	public int[] toArr(){
		return this.makeArrFromNode(this.head);
	}

	public void append(int data){
		Node newNode = new Node(data);
		if (this.head == null && this.tail == null){
			this.head = newNode;
			this.tail = newNode;
			this.size++;
		} else {
			this.tail.next = newNode;
			newNode.prev = this.tail;
			this.tail = newNode;
			this.size++;
		}
	}

	public void prepend(int data){
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
		this.size++;
	}

	public int pop(){
		if (this.tail == null){
			return -1;
		}

		int data = this.tail.data;
		this.tail = this.tail.prev;
		this.tail.next = null;
		size--;
		return data;
	}

	public int takeFirst(){
		if (this.head == null){
			return -1;
		}
		int data = this.head.data;
		this.head = this.head.next;
		this.head.prev = null;
		size--;
		return data;
	}

}