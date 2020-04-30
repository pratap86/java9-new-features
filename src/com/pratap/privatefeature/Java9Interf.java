package com.pratap.privatefeature;

/**
 * 
 * @author 835698 private method inside interface - code re-usability
 */
public interface Java9Interf {

	default void m1() {

		System.out.println("inside m1()");
		m3();
	}

	default void m2() {

		System.out.println("inside m2()");
		m3();
	}
	
	private void m3() {
		System.out.println("common finctionality");
	}
}
