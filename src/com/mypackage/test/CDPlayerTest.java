/*
 * Author: Mit Swami
 * Compile: javac -cp ../libs/*:../target/ -d ../target/ com/mypackage/test/CDPlayerTest.java
 * Run: java -cp ../libs/*:../target/ com.mypackage.test.CDPlayerTest
 */
package com.mypackage.test;

import com.mypackage.config.CDConfig;
import com.mypackage.modal.CDPlayer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CDPlayerTest{

	public static void main(String args[]){
		System.out.println("Startting Spring Applicatioon...");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CDConfig.class);
		System.out.println("Application context ready.");
		
		CDPlayer cdPlayer = ctx.getBean(CDPlayer.class);
		System.out.println("[Debug] cdPlayer.play() returned: " + cdPlayer.play());
		
		ctx.close();
	}
	
}