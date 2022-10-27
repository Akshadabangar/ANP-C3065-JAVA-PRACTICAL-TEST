package question2;

public class GameMenu 
{
	void startGame() {
		System.out.println("1.Start the Game");
	}
	
	void displayGameInstruction() {
		System.out.println("2.Display game instruction");
	}
	
	void exitGame() {
		System.out.println("3.Exit the Game");
	}
	
public static void main(String[] args) {
		
		System.out.println("1.Start the Game");
		System.out.println("2.Dispay game instruction");
		System.out.println("3.Exit the Game");
		
		
		GameMenu obj=new GameMenu();
		int menuChoice=3;
		
		switch(menuChoice) {
		case 1:
			//System.out.println("1.Start the Game");
			obj.startGame();
			break;
			
		case 2:
			//System.out.println("2.Display game instruction");
			obj.displayGameInstruction();
			break;
			
		case 3:
			
			//System.out.println("3. Exit the Game");
			obj.exitGame();
			break;
			
		default :
			System.out.println("Invalid Choice!!!");
			
			}	
		
		}
}
