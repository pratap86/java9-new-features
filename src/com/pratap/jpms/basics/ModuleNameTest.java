package com.pratap.jpms.basics;

import java.sql.Connection;
import java.util.ArrayList;

public class ModuleNameTest {

	public static void main(String[] args) {

		System.out.println(String.class.getModule());
		System.out.println(Connection.class.getModule());
		System.out.println(ArrayList.class.getModule());
	}

}
