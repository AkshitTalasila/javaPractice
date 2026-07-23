import java.util.*;
public class MobilePhone{

	private String myNumber;
	private ArrayList<Contact> myContacts;

	public MobilePhone(String myNumber){
		
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<>();
	}

	public boolean addNewContact(Contact contact){
		
		if(findContact(contact)>=0){

			return false;
		}else{

			myContacts.add(contact);
			return true;
		}
	}

	public boolean updateContact(Contact old, Contact newCont){
	
		if(findContact(old)>=0){

			int index = myContacts.indexOf(old);
			myContacts.set(index,newCont);
			return true;
		}else{

			return false;
		}
	}

	public boolean removeContact(Contact rem){

		if(findContact(rem)>=0){
	
			myContacts.remove(rem);
			return true;
		}else{
			
			return false;
		}
	}


	private int findContact(Contact find){

        return findContact(find.getName());
	}

	private int findContact(String name){

		for(int i=0;i<myContacts.size();i++){

			String contactName = myContacts.get(i).getName();
			if(contactName == name){

				return i;
			}
		}

		return -1;
	}


	public Contact queryContact(String name){

		int index = findContact(name);
		if(index == -1){

			return null;
		}else{

			return myContacts.get(index);
		}
	}


	public void printContacts(){
        System.out.println("Contact List:");
		for(int i=0;i<myContacts.size();i++){
			System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
		}
	}
}
