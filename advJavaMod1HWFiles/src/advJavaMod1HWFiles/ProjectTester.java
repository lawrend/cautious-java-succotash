import java.util.*;

public class ProjectTester {

	public static void main(String[] args) {
		
		HouseProject h1 = new HouseProject("Refinish Floors", 2500, 0);
		HouseProject h2 = new HouseProject("Change Light Fixtures", 2500, 0);
		BedroomProject h3 = new BedroomProject("New Paint", 1000, 0);
		BathroomProject h4 = new BathroomProject("New Tile", 3000, 245);
		OutdoorProject h5 = new OutdoorProject("New Fence", 5000, 1245);
		ArrayList<HouseProject> currentProjects = new ArrayList<HouseProject>();
		currentProjects.add(h1);
		currentProjects.add(h2);
		currentProjects.add(h3);
		currentProjects.add(h4);
		currentProjects.add(h5);
		currentProjects.add(new BathroomProject("New Toilet", 2555, 0));
		
		h2.addToEstimatedCost(300);
		h3.subtractFromEstimatedCost(200);
		h4.addToActualCost(3000);
		
		System.out.println("Before sort:\n");
		for(HouseProject p : currentProjects)
			System.out.println(p.toString());
		
		Collections.sort(currentProjects);
		
		System.out.println("After sort:\n");
	    for(HouseProject p : currentProjects)
			System.out.println(p.toString());
		
		String a = null;
		String b = "";
		
		System.out.println(b.equals(a));
		
		System.out.println(Financing.BANK_LOAN.thanksForTheMoney());
		
		//M3 USING BUILDER
		HouseProject builtByBuilder = new HouseProjectBuilder("New Roof", 2000, 2500).build();
		System.out.println(builtByBuilder);
		
		//M3 USING FACTORY
		HouseProject newDeck = HouseProjectFactory.getProject("Outdoor", "New Deck", 1000, 2000);
		System.out.println(newDeck);
		
		
		h1.executeServiceRequest(h1.getNickname(), 300);
		
	}
	

}
