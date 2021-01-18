/*
 * Author: Mit Swami
 * Compile: javac -cp "../libs/*:../target/" -d ../target/ com/mypackage/modal/CDPlayer.java
 */
package com.mypackage.modal;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class CDPlayer{
	
	@Autowired
	private CD cd;

	public CDPlayer(){

	}

	public CDPlayer(CD cd1){
		this.cd=cd1;
	}

	public CD getCD(){
		return this.cd;
	}

	public void setCD(CD cd1){
		this.cd=cd1;
	}

	public Boolean play(){
		return cd.play();
	}
}