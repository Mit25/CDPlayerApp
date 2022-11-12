/*
 * Author: Mit Swami
 */
package com.mypackage.model;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

/*
 * This class represents the CD player which can play the CD.
 */
@Component
public class CDPlayer {
	
	@Autowired
	private CD cd;

	public CDPlayer() {

	}

	public CDPlayer(CD cd) {
		this.cd = cd;
	}

	public CD getCD() {
		return this.cd;
	}

	public void setCD(CD cd) {
		this.cd = cd;
	}

	/**
	 * This method is called when we want to play a CD.
	 * 
	 * @return if CD is played or not
	 */
	public Boolean play() {
		if (this.cd != null) {
			return cd.play();
		} else {
			return false;
		}
	}
}