public class BaseballPlayer {

	private String name;
	private String team;
	private int hits;
	private int atBats;
	
	//Constructor
	public BaseballPlayer(String playerName, String currTeam){
		name = playerName;
		team = currTeam;
		hits = 0;
		atBats = 0;
	}
	
	/**
	* Returns value of name
	* @return String
	*/
	public String getName() {
		return name;
	}
	
	/**
	* Returns value of team
	* @return String
	*/
	public String getTeam() {
		return team;
	}
	
	/**
	* Returns number of hits
	* @return int
	*/
	public int getHits() {
		return hits;
	}
	
	/**
	* Returns number of at bats
	* @return int
	*/
	public int getAtBats() {
		return atBats;
	}
	
	/**
	* Sets the value of team
	* @param String
	*/
	public void setTeam(String newTeam) {
		team = newTeam;
	}
	
	
	/*
	 * Notice in the following methods that we restrict how a
	 * user of this class can add hits and outs.
	 * We don't give direct access since we want to control
	 * how we record a hit versus an out.
	 */
	 
	 /**
	* Call this method when a player gets a hit
	*/
	public void hit() {
		hits ++;
		atBats ++;
	}
	 /**
	* Call this method when a player makes an out
	*/
	public void out() {
		atBats ++;
	}
	
	 /**
	* Returns the players batting average.
	* @return double
	*/
	public double battingAvg() {
	    if (atBats == 0) {
	        return 0;
	    }
		return (double) hits/atBats;
	}
	
	/**
	* Returns a string representation of the BaseballPlayer object
	* @return String
	*/
	public String toString() {
		return name + " plays for the " + team 
				+" and has an average of " +battingAvg();
	}
}