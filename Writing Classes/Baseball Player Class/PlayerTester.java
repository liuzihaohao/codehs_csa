public class PlayerTester {

	public static void main(String[] args) {

		BaseballPlayer harper = new BaseballPlayer("Bryce Harper", "Nationals");
		
		harper.hit();
		harper.hit();
		harper.hit();
		harper.out();
		harper.out();
		harper.out();
		harper.out();
		harper.out();
		System.out.println("Batting Average: " + harper.battingAvg());
		System.out.println(harper);
		
		harper.setTeam("Phillies");
		System.out.println(harper);
	}

}