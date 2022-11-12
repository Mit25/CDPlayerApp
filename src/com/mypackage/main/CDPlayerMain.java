/*
 * Author: Mit Swami
 */
package com.mypackage.main;

import com.mypackage.config.CDConfig;
import com.mypackage.model.CDPlayer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CDPlayerMain {

	public static void main(String args[]) {
		System.out.println("Starting Spring Applicatioon...");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CDConfig.class);
		System.out.println("Application context ready.");
		
		CDPlayer cdPlayer = ctx.getBean(CDPlayer.class);
		System.out.println("[Debug] cdPlayer.play() returned: " + cdPlayer.play());
		
		ctx.close();
	}
	
}
