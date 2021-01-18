/*
 * Author: Mit Swami
 * Compile: javac -cp "../libs/*:../target/" -d ../target/ com/mypackage/controller/CDPlayerController.java
 */
package com.mypackage.controller;

import com.mypackage.modal.CDPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CDPlayerController{
	
	@Autowired
	private CDPlayer cdPlayer;

	@RequestMapping(value="/ping",method=RequestMethod.GET)
	@ResponseBody
	public String ping() {
		return "pong";
	}

	@RequestMapping(value="/CDPlayer/play",method=RequestMethod.GET)
	@ResponseBody
	public Boolean playCDPlayer(){
		cdPlayer.play();
		return true;
	}
}