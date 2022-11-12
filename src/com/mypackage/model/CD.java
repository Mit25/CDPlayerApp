/*
 * Author: Mit Swami
 */
package com.mypackage.model;

import org.springframework.stereotype.Component;

/**
 * This class represents Compact Disk.
 */
@Component
public class CD {

	/**
	 * This method is called when we want to play CD.
	 * 
	 * @return if CD is played or not
	 */
	public Boolean play() {
		System.out.println("Playing CD...");
		return true;
	}
	
}