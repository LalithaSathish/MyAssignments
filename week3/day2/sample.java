package week3.day2;

public class sample extends JavaConnection{

	@Override
	public void disconnect() {
		System.out.println("disconnect()");
	}
	@Override
	public void exclusiveupdate() {
		System.out.println("exclusiveupdate");
		
	}
		public static void main(String[] args) {


			sample sam=new sample();

			sam.disconnect();
			sam.connect();
			sam.executeUpdate();
			sam.exclusiveupdate();

		}

	}


