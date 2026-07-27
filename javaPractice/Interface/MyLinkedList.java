package edu.umass;

public class MyLinkedList implements NodeList{

	private ListItem root;
	
	public MyLinkedList(ListItem root){
	
		this.root = root;
	}

	public ListItem getRoot(){
		
		return this.root;
	}
	
	public boolean addItem(ListItem item){

		if(root == null){

			root = item;
			return true;
		}

		ListItem current = root;
		ListItem previous = null;

		while(current != null){

			int result = current.compareTo(item);

			if(result == 0){

				return false;

			}else if(result > 0){

				// item belongs before current
				item.setNext(current);
				item.setPrevious(previous);

				if(previous == null){

					root = item;

				}else{

					previous.setNext(item);
				}

				current.setPrevious(item);
				return true;

			}else{

				previous = current;
				current = current.next();
			}
		}

		// reached the end of the list, item belongs after the last node
		previous.setNext(item);
		item.setPrevious(previous);
		return true;
	}

	
}
