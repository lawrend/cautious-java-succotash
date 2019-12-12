package advJavaMod7;
import java.io.*;
import java.util.*;
import java.time.*;

public class ESMaker {
	
	//creates objects and makes map
	private static void fillMap(Map<String,EndangeredSpecies> map) {
        try (Scanner fileScan = new Scanner(
                new FileReader(new File("speciesList.csv")))) {
            String line = fileScan.nextLine();

            while(fileScan.hasNext()) {
                line = fileScan.nextLine();
                
                Scanner lineScan = new Scanner(line);
                lineScan.useDelimiter(",");
                String type = lineScan.next();
                String name = lineScan.next();
                String status = lineScan.next();
                String location = lineScan.next();
                String state = lineScan.next();
                String otherState = lineScan.next();
                String id = lineScan.next();
                EndangeredSpecies es = new EndangeredSpecies(id, name, location, state, type);
                map.put(id, es);
            }
    
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
	
    //creates objects and makes list	
	private static void fillList(List<EndangeredSpecies> list) {
        try (Scanner fileScan = new Scanner(
                new FileReader(new File("speciesList.csv")))) {
            String line = fileScan.nextLine(); 

            while(fileScan.hasNext()) {
                line = fileScan.nextLine();
                
                Scanner lineScan = new Scanner(line);
                lineScan.useDelimiter(",");
                String type = lineScan.next();
                String name = lineScan.next();
                String status = lineScan.next();
                String location = lineScan.next();
                String state = lineScan.next();
                String otherState = lineScan.next();
                String id = lineScan.next();
                EndangeredSpecies es = new EndangeredSpecies(id, name, location, state, type);
                list.add(es);
            }
    
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
	
	//count number of species in a given wildlife refuge location
    private static void countLocations(Map<String,EndangeredSpecies> map, String loc) {
	    int locations = 0;
	    
	    Collection<EndangeredSpecies> values = map.values();
	    Iterator<EndangeredSpecies> iterator = values.iterator();
	    while(iterator.hasNext()) {
	        EndangeredSpecies es = iterator.next();
	        if(es.getLocation().contentEquals(loc)) {
	        	locations++;
	        }
	    }
	}
    
    //counts number of species endangered in a given state
    private static void countStates(Map<String,EndangeredSpecies> map, String st) {
	    int states = 0;
	    
	    Collection<EndangeredSpecies> values = map.values();
	    Iterator<EndangeredSpecies> iterator = values.iterator();
	    while(iterator.hasNext()) {
	        EndangeredSpecies es = iterator.next();
	        if(es.getState().contentEquals(st)) {
	        	states++;
	        }
	    }
	}
		

}
