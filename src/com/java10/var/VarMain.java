package com.java10.var;

import java.util.List;
import java.util.Scanner;

public class VarMain {

	public static void main(String args[]) {
		// var in java is not like in javascript
		// the compiler will assum var as the type of the initalization
		whatYouCanDo();
		whatYouCantDo();
	}

	private static void whatYouCanDo() {
		var number = 53;
		var text = "This is my text!";
		var scan = new Scanner(text);
		var textByMethod = getTextByMethod();
		
		var list = List.of("A", "B", "C");
		for(var item : list) {
			
		}
		
		for(var i=0; i< list.size(); i++) {
			
		}

	}

	private static void whatYouCantDo() {

	}

	private static String getTextByMethod() {
		return "Text by method!";
	}
}
