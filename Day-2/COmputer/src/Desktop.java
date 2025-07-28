
public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("desktopSize Method from Desktop Class");
	}
	
	public static void main(String[] args) {
		Desktop dt=new Desktop();
		dt.desktopSize();
		dt.computerModel();
	}
}
