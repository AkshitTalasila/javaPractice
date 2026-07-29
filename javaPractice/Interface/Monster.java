package edu.umass;
import java.util.*;

public class Monster implements ISaveable{

	private String name;
	private int hitPoints;
	private int strength;

	public Monster(String name, int hitPoints, int strength){
	
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	public String getName(){
		
		return this.name;
	}
	
	public int getHitPoints(){

		return this.hitPoints;
	}

	public int getStrength(){
		
		return this.strength;
	}

	@Override
	public List<String> write(){
		
		List<String> list = new ArrayList<>();

		list.add(getName());
		list.add("" +getHitPoints());
		list.add("" +getStrength());
		return list;
	}

	@Override
	public void read(List<String> list){
		
		if((list != null) && (list.size()>0)){
			
			this.name = list.get(0);
			this.hitPoints = Integer.parseInt(list.get(1));
			this.strength = Integer.parseInt(list.get(2));
		}	
	}

	public String toString(){
		
		String fullText = "Monster{name='%s', hitPoints='%s', strength='%s'}".formatted(this.name, this.hitPoints, this.strength);
		return fullText;
	}
}
