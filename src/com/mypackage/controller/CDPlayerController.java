/*
 * Author: Mit Swami
 */
package com.mypackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mypackage.model.CDPlayer;

@Controller
public class CDPlayerController {
	
	@Autowired
	private CDPlayer cdPlayer;

	@RequestMapping(value="/ping", method=RequestMethod.GET)
	@ResponseBody
	public String ping() {
		return "pong";
	}

	@RequestMapping(value="/CDPlayer/play", method=RequestMethod.GET)
	@ResponseBody
	public Boolean playCDPlayer() {
		cdPlayer.play();
		return true;
	}
}