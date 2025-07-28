package week3.day2;

public abstract class JavaConnection implements DatabseConnection{

	@Override
	public void connect() {
		System.out.println("connect()");

	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate()");

	}
	
	public abstract void exclusiveupdate();

}
