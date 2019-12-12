package advJavaMod1HWFiles;

public class RequestPlumbing implements RequestService{
	private RequestService plumbing = new RequestPlumbing();
	
	@Override
	public String pickService(String projNickname, int extraCost) {
		return "Plumbing service has been requested for " + extraCost + " for " + projNickname;
	}
}
