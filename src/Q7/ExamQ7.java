package Q7;
import java.util.ArrayList;

public class ExamQ7 {
    public static void main(String[] args) {
		ArrayList <BakedGoods> bakedGoods = new ArrayList <BakedGoods>();
		Cookie cookieCC = new Cookie(5.98, "Chocolate Chip", "12/20/2021");
		Cookie cookiePB = new Cookie(5.98, "Peanutbutter", "12/20/2021");
		Cookie cookieSHC = new Cookie(19.99, "Scott's Homemade Cookie", "12/20/2021");
		Brownie brownieFCRB = new Brownie(6.99, "Family Classic Recipe Brownie", "04/24/2024");
		Brownie brownieRPB = new Brownie(6.10, "Rae's Peanut Butter", "04/24/2024");
		Brownie brownieSHB = new Brownie(4.20, "Scott's Homemade Brownie", "04/24/2024");
		CinnamonRoll cinnamon1 = new CinnamonRoll(1.35, "Wendy's", "06/10/2065");
		CinnamonRoll cinnamon2 = new CinnamonRoll(1.55, "Carls Jr", "06/10/2065");
		CinnamonRoll cinnamon3 = new CinnamonRoll(5.35, "Raisin Cane's", "06/10/2065");
		bakedGoods.add(cookieCC);
		bakedGoods.add(cookiePB);
		bakedGoods.add(cookieSHC);
		bakedGoods.add(brownieFCRB);
		bakedGoods.add(brownieRPB);
		bakedGoods.add(brownieSHB);
		bakedGoods.add(cinnamon1);
		bakedGoods.add(cinnamon2);
		bakedGoods.add(cinnamon3);
		for (BakedGoods b: bakedGoods) {
			System.out.println(b.getPrice() + " " + b.getDescription() + " " + b.getSellByDate());
		}
	}

}