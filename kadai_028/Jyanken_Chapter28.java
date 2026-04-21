package kadai_028;

import java.util.Scanner;
public class Jyanken_Chapter28 {
	
	
	public 	String getMyChoice() { 
		Scanner scanner = new Scanner(System.in);
		String jan = "";
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
				
			
			jan  = scanner.next();
			if(jan.equals("r")||
				jan.equals("s")||
				jan.equals("p")){
				scanner.close();
				
				return jan;
			}
		}
		
	
	}
	
	public String getRandom() {
		
		int n = (int)(Math.floor(Math.random() * 3));
		
		if(n == 0 ) {
			return "r";
			
		}else if(n == 1){
			return "s";
	
		}else{
			return "p";
		}
	}
	
	public void playGame() {
		
		String jan = getMyChoice();
		String ken = getRandom();
		
		if(jan.equals(ken) ) {
			 System.out.println("あいこです");
		
		}
		else if((jan.equals("r")&& ken.equals("s"))||
				(jan.equals("s")&& ken.equals("p"))||
				(jan.equals("p")&& ken.equals("s"))){
			 System.out.println("自分の勝ちです");
		}
		else {
			System.out.println("自分の負けです");
		}
			
		
	}

}
