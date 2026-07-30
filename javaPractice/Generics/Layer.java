package edu.umass;
import java.util.*;

public class Layer<T extends Mappable>{
	
	private	ArrayList<T> list = new ArrayList<>();

	public Layer(T[] element){

		for(T item : element){

			list.add(item);
		}			
	}	


	public void addElement(T element){

		list.add(element);
	}


	public void renderLayer(){

		for(int i=0;i<list.size();i++){

			list.get(i).render();
		}
	}

}
