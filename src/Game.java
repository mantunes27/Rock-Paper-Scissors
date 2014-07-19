import java.util.Scanner;



public class Game {

	public static void main(String[] args) {
		System.out.println("Do you choose rock, paper or scissors?");
		Scanner s2 = new Scanner(System.in);
		String userChoice = s2.next();
		double computerChoice = Math.random();
		String computerResult = "";
		if(computerChoice < 0.33){
			computerResult = "rock";
		}else if(computerChoice < 0.67){
			computerResult = "paper";
		}else if(computerChoice < 1){
			computerResult = "scissors";
		}

		if(userChoice.equals(computerResult)){
			System.out.println("The result is a tie!");
		}
		
		if(userChoice.equals("rock") && computerResult.equals("paper")){
			System.out.println("Paper wins!");
		}else if((userChoice.equals("rock") && computerResult.equals("scissors"))){
			System.out.println("Rock wins!");
		}
		
		if((userChoice.equals("paper") && computerResult.equals("rock"))){
			System.out.println("Paper Wins!");
		}else if((userChoice.equals("paper") && computerResult.equals("scissors"))){
			System.out.println("Scissors Wins!");
		}
		
		if((userChoice.equals("scissors") && computerResult.equals("rock"))){
			System.out.println("Rock wins!");
		}else if((userChoice.equals("scissors") && computerResult.equals("paper"))){
			System.out.println("Scissors wins!");
		}
	}

}
