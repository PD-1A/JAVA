import java.util.HashMap;

public class Restaurant {
	public static void main(String[] args){
		HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();
		
		restaurantMenu.put("G01",12);
		restaurantMenu.put("G02",23);
		restaurantMenu.put("G03",34);
		
		System.out.println(restaurantMenu.get("G02"));
		
		System.out.println("The size of restaurantMenu is " + restaurantMenu.size());
		for(String item : restaurantMenu.keySet()){
			System.out.println("a " + item + " costs " + restaurantMenu.get(item));
		}
	}

}
