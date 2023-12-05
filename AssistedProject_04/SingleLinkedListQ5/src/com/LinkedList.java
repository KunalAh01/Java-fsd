package com;

public class LinkedList {  
	Node head;  
	     class Node{ 
	        		int data; 
	        		Node next; 
	        		Node(int d) 
	        		{ 
	            			data = d; 
	            			next = null; 
	        		} 
	    	} 
	    	void deletNode(int key) {
	    		Node temp=head,prev=null;
	    		if(temp!=null && temp.data==key) {
	    			head=temp.next;
	    			return;
	    		}
	    		while(temp!=null &&temp.data!=key) {
	    			prev=temp;
	    			temp=temp.next;
	    		}
	    		if(temp==null) {
	    			return;
	    		}
	    		prev.next=temp.next;
	    	}
	    	public void push(int newData) {
	    		Node newNode=new Node(newData);
	    		newNode.next=head;
	    		head=newNode;
	  }
	    	public void printList() {
	    		Node tnode=head;
	    		while(tnode!=null) {
	    			System.out.println(tnode.data + " ");
	    			tnode=tnode.next;
	    		}
	    	}
		    	public static void main(String[] args) 
		    	{ 
		        	LinkedList list = new LinkedList();
		        		list.push(7); 
		        		list.push(5); 
		        		list.push(4);
		        		list.push(7); 
		        		list.push(1); 
		        		list.push(9); 
		        		
		        		System.out.println("Linked List ");
		        		list.printList();
		        		list.deletNode(7);
		        		System.out.println("Linked List after deletion ");
		        		list.printList();
		    	} 
		} 


