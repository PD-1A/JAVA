import java.util.*;

public class GeneralizationsD {
	public static void main(String[] args){
		ArrayList<String> sports = new ArrayList<String>();
		sports.add("Football");
		sports.add("Boxing");
		
		for(String sport : sports){
			System.out.println(sports);
			System.out.println(sport);
		}
		System.out.println(""); //Line change
		HashMap<String , String> A_person = new HashMap<String , String>();
		A_person.put("John", "good");
		A_person.put("Kelly", "bad");
		for(String name:A_person.keySet()){
			System.out.println(name + " is " + A_person.get(name));
		}
	}
	
	
}
