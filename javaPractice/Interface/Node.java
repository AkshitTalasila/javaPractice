package edu.umass;

public class Node extends ListItem{

	public Node(Object value){

		super(value);
	}	

	@Override
	public ListItem next(){
		
		return super.rightLink;
	}

	@Override
	public ListItem setNext(ListItem rightLink){

		super.rightLink = rightLink;
		return super.rightLink;
	}

	@Override
	public ListItem previous(){
	
		return super.leftLink;
	}

	@Override
	public ListItem setPrevious(ListItem leftLink){

		super.leftLink = leftLink;
		return super.leftLink;	
	}

	@Override 
	public int compareTo(ListItem item){
	
		return ((Comparable) this.getValue()).compareTo(item.getValue());	
	}
}
