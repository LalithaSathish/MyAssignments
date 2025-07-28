package org.lang;

public class StateDetails {
	public String southIndia() {
		String state="South India";
		return state;
	}
	public String northIndia() {
		String state="North India";
		return state;
	}
	
	public static void main(String[] args) {
		LanguageInfo li=new LanguageInfo();
		StateDetails sd=new StateDetails();
		
		System.out.println("Methods from Laguage Class :- \n"+ li.tamilLanguage()+"\n"+li.englishLanguage()+"\n"+li.hindiLanguage());
		System.out.println("Methods from State Details Class :- \n"+sd.southIndia()+"\n"+sd.northIndia());
	}

}
