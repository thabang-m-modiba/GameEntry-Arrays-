/**
 * @author Thabang Mamoloko
 */

/**
 * Blueprint for the Game entry
 */
public class GameEntry {
	private String name;
	private int score;
	/**
	 * @param namev - name of the gamer
	 * @param score - the Gamer's score
	 */
	public GameEntry(String name, int score) {
		this.name = name;
		this.score = score;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	
}
