package week3.day1;

public class APIClient {
	public void sendRequest(String endpoint) {
    System.out.println("sendRequest: " + endpoint);
	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
	    System.out.println("sendRequest: " + endpoint);
		}
	public static void main(String[] args) {
		APIClient ac=new APIClient();
		ac.sendRequest("Name");
		ac.sendRequest("Name", "Sent", false);
	}

}
