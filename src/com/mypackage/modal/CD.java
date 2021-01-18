/*
 * Author: Mit Swami
 * Compile: javac -cp "../libs/*:../target/" -d ../target/ com/mypackage/modal/CD.java
 */
package com.mypackage.modal;

import org.springframework.stereotype.Component;

@Component
public class CD{

	public Boolean play(){
		System.out.println("Playing CD...");
		return true;
	}
	
}