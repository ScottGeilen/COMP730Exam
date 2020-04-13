package Q6;

public class StarTrekShips extends SpaceShip {
	public StarTrekShips(int tons, String n) {
		tonnage = tons;
		name = n;
	}
    public String getFranchise() {
		return "Star Trek";
	}
}