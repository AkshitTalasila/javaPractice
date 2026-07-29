package edu.umass;
import java.util.*;

public class Player implements ISaveable{

	private String name;
	private String weapon;
	private int hitPoints;
	private int strength;
	
	public Player(String name, int hitPoints, int strength){

		this.name = name;
		this.weapon = "Sword";
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	public String getName(){

		return this.name;
	}

	public void setName(String name){
		
		this.name = name;
	}

	public String getWeapon(){
		
		return this.weapon;
	}

	public void setWeapon(String weapon){

		this.weapon = weapon;
	}

	public int getHitPoints(){
		
		return this.hitPoints;
	}

	public void setHitPoints(int hitPoints){
	
		this.hitPoints = hitPoints;
	}

	public int getStrength(){
		
		return this.strength;
	}
	
	public void setStrength(int strength){
		
		this.strength = strength;
	}

	@Override
	public List<String> write(){

		List<String> stats = new ArrayList<>();
		stats.add(getName());
		stats.add("" +getHitPoints());
		stats.add("" +getStrength());
		stats.add(getWeapon());
		
		return stats;
	}

	@Override
	public void read(List<String> list){
		
		if((list != null) && (list.size()>0)){
			setName(list.get(0));
			setHitPoints(Integer.parseInt(list.get(1)));
			setStrength(Integer.parseInt(list.get(2)));	
			setWeapon(list.get(3));
		}
	}

	public String toString(){

		String fullText = "Player{name='%s', hitPoints=%s, strength=%s , weapon='%s'}".formatted(getName(), getHitPoints(), getStrength(), getWeapon());

		return fullText;
	}



}
