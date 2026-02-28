/**
 * @author Thabang Mamoloko
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Game functionality
 */
public class Game {
	private List<GameEntry> arrList = new ArrayList<>();
	
	/**
	 * Constructor
	 */
	public Game() {}
	
	/**
	 * Method to add elements to the array
	 * @param obj
	 * @return new arrList
	 */
	public List<GameEntry> addScore(GameEntry obj){
		this.arrList.add(obj);
		return arrList;
	}
	
	/**
	 * Getter method for arrList
	 * @return arrList
	 */
	public List<GameEntry> getArrList(){
		return this.arrList;
	}
	
	/**
	 * @param arrList the arrList to set
	 */
	public void setArrList(List<GameEntry> arrList) {
		this.arrList = arrList;
	}

	/**
	 * Method to remove an element from the list
	 * @param obj
	 * @return new arrList
	 */
	public List<GameEntry> removeScore(GameEntry obj){
		this.arrList.remove(obj);
		return this.arrList;
	}
	 /**
	  * Method to print the list
	  */
	public void printArray() {
		for(int i = 0; i < this.arrList.size(); i++) {
			System.out.println(arrList.toString());
		}
	}
	 
	

}
