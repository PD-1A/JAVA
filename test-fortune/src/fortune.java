
import java.util.ArrayList;


import javax.swing.JOptionPane;

public class fortune extends carClass{

	public static void main(String[] args){
		ArrayList<Integer> strokes = new ArrayList<Integer>();	// for name strokes record
		ArrayList<Integer> addStrokes = new ArrayList<Integer>();
		
		fortune yourFortune = new fortune();
		
		int attribute[][] = {{0,0,1,0,3},
							 {0,2,2,4,2},
							 {1,2,1,1,3},
							 {0,4,1,4,4},
							 {3,2,3,4,3}};
		String sCounter = JOptionPane.showInputDialog("有幾個字\n"
				+ "2 or 3 ?");	
		String sStrokes;
		int nCounter = Integer.parseInt(sCounter);
		int iStrokes;
		int total_personality;
		int thinking,action,year30;
		
		//init variable
		strokes.add(0,1);	//strokes[0] = 1
		iStrokes = 0;
		total_personality = 0;
		
		if( (nCounter !=2) && (nCounter !=3) ){
			JOptionPane.showMessageDialog(null,"來亂的嗎", null, JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		for(int i=1; i<=nCounter; i++){
			sStrokes = JOptionPane.showInputDialog("第 " + i + " 個字的筆劃 : ");

			iStrokes = Integer.parseInt(sStrokes);
			strokes.add(i,iStrokes);
		}
		
		//only one name
		if(nCounter < 3){
			strokes.add(3,1);	
		}
		
		//calculate the attribute of the name
		
		for(int j=1; j<=nCounter; j++){
			total_personality += strokes.get(j);
		}
		if(nCounter == 2)
			total_personality += 1;
		strokes.add(4,total_personality);						//total
//		r(int k=0; k<nCounter; k++){
			addStrokes.add(strokes.get(0) + strokes.get(1));	//sky
			addStrokes.add(strokes.get(1) + strokes.get(2));	//person
			addStrokes.add(strokes.get(2) + strokes.get(3));	//land
			addStrokes.add(total_personality);
//		}
		for(int k=0; k<=3; k++){
			addStrokes.add(k,addStrokes.get(k)%10);
			addStrokes.remove(k+1);
			if(addStrokes.get(k) == 1 || addStrokes.get(k) == 2){			//wood
				addStrokes.add(k,0);
				addStrokes.remove(k+1);
			}
			else if (addStrokes.get(k) == 3 || addStrokes.get(k) == 4) {	//fire
				addStrokes.add(k,1);
				addStrokes.remove(k+1);
			}
			else if (addStrokes.get(k) == 5 || addStrokes.get(k) == 6) {	//land
				addStrokes.add(k,2);
				addStrokes.remove(k+1);
			}
			else if (addStrokes.get(k) == 7 || addStrokes.get(k) == 8) {	//gold
				addStrokes.add(k,3);
				addStrokes.remove(k+1);
			}
			else { 															//water
				addStrokes.add(k,4);
				addStrokes.remove(k+1);
			}	
		}

		//get the attribute of 2-array
		thinking = attribute[addStrokes.get(0)][addStrokes.get(1)];
		JOptionPane.showMessageDialog(null, "想法面");
//		System.out.println(thinking);
		switch (thinking){
			case 0:			
				yourFortune.tank();
				break;
			case 1:
				yourFortune.train();
				break;
			case 2:
				yourFortune.sportCar();
				break;
			case 3:
				yourFortune.babyCar();
				break;
			case 4:
				yourFortune.limousine();
				break;
		}
		
		action = attribute[addStrokes.get(1)][addStrokes.get(2)];
		JOptionPane.showMessageDialog(null, "行動面");
		switch (action){
		case 0:
			yourFortune.tank();
			break;
		case 1:
			yourFortune.train();
			break;
		case 2:
			yourFortune.sportCar();
			break;
		case 3:
			yourFortune.babyCar();
			break;
		case 4:
			yourFortune.limousine();
			break;
	}
//		System.out.println(action);
		
		year30 = attribute[addStrokes.get(2)][addStrokes.get(3)];
		JOptionPane.showMessageDialog(null, "30歲之後的總格");
		switch (year30){
		case 0:
			yourFortune.tank();
			break;
		case 1:
			yourFortune.train();
			break;
		case 2:
			yourFortune.sportCar();
			break;
		case 3:
			yourFortune.babyCar();
			break;
		case 4:
			yourFortune.limousine();
			break;
	}
//		System.out.println(year30);
		
		
		System.exit(0);
	}
}
