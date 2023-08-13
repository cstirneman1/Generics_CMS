package main;
import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		GenericLinkedList myList=new GenericLinkedList();
		
		GenericNode aNode=new GenericNode();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new GenericNode();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		GenericNode tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);

		
		//Linked List(Strings)
		GenericLinkedList <String> stringList = new GenericLinkedList <String>();
		
		GenericNode <String> stringNode = new GenericNode <String>();
		stringNode.setData("First String");
		stringList.addNode(stringNode);
		
		GenericNode <String> stringNode2 = new GenericNode <String>();
		stringNode2.setData("Second String");
		stringList.addNode(stringNode2);
		
		
		//print data from stringList
		GenericNode<String> stringTempNode = stringList.getList();
		while (stringTempNode != null) {
			System.out.println(stringTempNode.getData());
			stringTempNode = stringTempNode.getNextNode();
		}


		//Linked List integers
		GenericLinkedList <Integer> intList = new GenericLinkedList <Integer>();
		
		GenericNode <Integer> intNode = new GenericNode <Integer>();
		intNode.setData(12);
		intList.addNode(intNode);
		
		GenericNode <Integer> intNode2 = new GenericNode <Integer>();
		intNode2.setData(5);
		intList.addNode(intNode2);
		
		
		//print data from intList
		GenericNode<Integer> intTempNode = intList.getList();
		while (intTempNode != null) {
			System.out.println(intTempNode.getData());
			intTempNode = intTempNode.getNextNode();
		}
		
		
		//linked list doubles
		GenericLinkedList <Double> doubleList = new GenericLinkedList <Double>();
		
		GenericNode <Double> doubleNode = new GenericNode <Double>();
		doubleNode.setData(34.56);
		doubleList.addNode(doubleNode);
		
		GenericNode <Double> doubleNode2 = new GenericNode <Double>();
		doubleNode2.setData(27.48);
		doubleList.addNode(doubleNode2);
		
		
		//print data from doubleList
		GenericNode<Double> doubleTempNode = doubleList.getList();
		while (doubleTempNode != null) {
			System.out.println(doubleTempNode.getData());
			doubleTempNode = doubleTempNode.getNextNode();
		}
		
	}//end main

}//end class
