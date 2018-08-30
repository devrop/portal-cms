package com.eintrusty.ui;

import com.eintrusty.ui.utiity.StringUtility;

public class Main {

	public static void main(String[]args){
		String password = "test";
		System.out.println("sebelum enkripsi " + password);
		String enkripsi = StringUtility.encrypt(password);
		System.out.println("password enkripsi " + enkripsi );
		System.out.println("decripted " + StringUtility.decrypt(enkripsi));
		
	}
}
