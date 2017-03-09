
public class Coffee extends Beverage{
	public void addSugar(int cubes){
		System.out.println("You add " + cubes + " sugar cubes");
	}
	public static void main(String[] args){

		for (int i=0; i<args.length;i++){
			System.out.print(args[i] + " \n");
		}
		Coffee myOrder = new Coffee();
		myOrder.addSugar(2);
		myOrder.isFull();
	}
}
