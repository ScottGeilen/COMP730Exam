package Q6;
import java.util.ArrayList;

public class ExamQ6Abstract {
    public static void main(String [] args) {
		ArrayList <SpaceShip> ListOfShip = new ArrayList <SpaceShip>();
		SpaceShip starTrekShip1 = new StarTrekShips(235, "USS Jupp");
		SpaceShip starTrekShip2 = new StarTrekShips(343, "USS Gage");
		SpaceShip starTrekShip3 = new StarTrekShips(153, "USS Huron");
		ListOfShip.add(starTrekShip1);
		ListOfShip.add(starTrekShip2);
		ListOfShip.add(starTrekShip3);
		
		SpaceShip starWarsShip1 = new StarWarsShips(25, "Super Star Destroyer");
		SpaceShip starWarsShip2 = new StarWarsShips(35, "Trade Federation Battleship");
		SpaceShip starWarsShip3 = new StarWarsShips(3005, "Imperial Star Destroyer");
		ListOfShip.add(starWarsShip1);
		ListOfShip.add(starWarsShip2);
		ListOfShip.add(starWarsShip3);

		SpaceShip jelly = new OtherSciFiSpaceShips(76, "Jellyship");
		SpaceShip bb = new OtherSciFiSpaceShips(95, "BreakingBadShip");
		SpaceShip comp = new OtherSciFiSpaceShips(730, "COMP730Ship");
		ListOfShip.add(jelly);
		ListOfShip.add(bb);
		ListOfShip.add(comp);
		
		for (SpaceShip ship: ListOfShip) {
			System.out.println(s.getFranchise() + " " + ship.getName() + " " + ship.getTonnage());
		}
	}
}