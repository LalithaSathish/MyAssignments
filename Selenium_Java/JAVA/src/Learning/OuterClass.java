package Learning;
public class OuterClass{
	
	public class InnerPrivateClass{
		void innerMethod() {
			System.out.println("this is private class inner method");
		}
		private void innerPrivateMethod() {
			System.out.println("this is private class innerprivate method");
		}
		
		void callInnerPrivateMethod() {
			innerPrivateMethod();
		}
	}
	
	
	public void callInnerMethod() {
		InnerPrivateClass innerInstance = new InnerPrivateClass();
		innerInstance.innerMethod();
		innerInstance.callInnerPrivateMethod();
	}
	
	public static void main(String[] args) {
		OuterClass outerInstance = new OuterClass();
		outerInstance.callInnerMethod();
	}
}
