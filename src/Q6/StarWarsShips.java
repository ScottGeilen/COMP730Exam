package Q6;

public class StarWarsShips extends SpaceShip {
    public StarWarsShips(int tons, String n) {
		tonnage = tons;
		name = n;
	}
	public String getFranchise() {
		return "Star Wars";
	}

}