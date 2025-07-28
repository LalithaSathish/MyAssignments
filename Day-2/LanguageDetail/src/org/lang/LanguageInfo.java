package org.lang;

public class LanguageInfo extends StateDetails{
	public void tamilLanguage() {
		System.out.println("tamilLanguage Method from LanguageInfo Class");
	}
	public void englishLanguage() {
		System.out.println("englishLanguage Method from LanguageInfo Class");
	}
	public void hindiLanguage() {
		System.out.println("hindiLanguage Method from LanguageInfo Class");
	}
	
	public static void main(String[] args) {
		LanguageInfo li=new LanguageInfo();
		li.tamilLanguage();
		li.englishLanguage();
		li.hindiLanguage();
		li.southIndia();
		li.northIndia();
	}
}
