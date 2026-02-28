/**
 * @author Thabang Mamoloko
 */
import java.util.Scanner;
/**
 * The main method
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean running = true;
		Game game = new Game();
		game.setArrList(null);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Enter new score.");
        System.out.println("2. Print Top 10 scores");
        System.out.println("3. Exit");
        System.out.print("Enter Option: ");
        
        int userInput = scanner.nextInt();
        
        while(running) {
        	switch(userInput) {
        	case 1:
        		System.out.print("Enter name: ");
        		String name = scanner.next();
        		
        		System.out.print("Enter score: ");
        		int score = scanner.nextInt();
        		
        		GameEntry newGameEntry = new GameEntry(name, score);
        		game.getArrList().add(newGameEntry);
        		
        		System.out.print("New Score added successfully");
        		break;
        	case 2:
        		if(game.getArrList() == null) {
        			System.out.println("Array is empty");
        		}else {
        			game.printArray();
        		}
        		break;
        	case 3:
        		running = false;
        		System.out.println("Exiting");
        		break;
        	default:
        		System.out.println("Invalid input! Please enter valid input");
        	}
        }
        scanner.close();
	}

}
