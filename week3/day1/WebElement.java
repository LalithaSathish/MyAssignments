package week3.day1;

public class WebElement {
	public void click() {
		System.out.println("Click Method from WebElement ");

	}
	public void setText(String text) {
		System.out.println("setText from WebElement & text: " +text);

	}
	
	public static void main(String[] args) {
		
		/*WebElement we=new WebElement();
		we.click();
		we.setText("WebElement");
		
		Button bn=new Button();
		bn.click();
		bn.setText("Button");
		bn.submit();
		
		TextField tf=new TextField();
		tf.click();
		tf.getText();
		tf.setText("TextField");
		
		CheckBoxButton cbb=new CheckBoxButton();
		cbb.click();
		cbb.setText("CheckBoxButton");
		cbb.submit();
		cbb.clickCheckButton();
		cbb.getText();*/
		
		RadioButton rb=new RadioButton();
		rb.click();
		rb.selectRadioButton();
		rb.submit();
		rb.setText("RadioButton");
		rb.clickCheckButton();
		rb.getText();
	}

}
