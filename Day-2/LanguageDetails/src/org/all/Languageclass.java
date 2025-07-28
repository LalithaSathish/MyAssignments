package org.all;

import org.tamil.Tamil;

public class Languageclass extends Tamil{
	public void alllanguage() {
		System.out.println("alllanguage Method from Languageclass Class");

	}
	//Multilevel inheritance.
	public static void main(String[] args) {
		Languageclass lc=new Languageclass();
		lc.alllanguage();
		lc.englishlanguage();
		lc.tamillanguage();
		lc.telgulanguage();
	}
}
