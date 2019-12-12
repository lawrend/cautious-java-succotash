
public class RequestCarpentry implements RequestService{
	@Override
	public String pickService(String projNickname, int extraCost) {
		return "Carpentry service has been requested for " + extraCost + " for " + projNickname;
	}

}
