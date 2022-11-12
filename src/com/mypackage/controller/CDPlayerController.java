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
@RequestMapping(value="/cdPlayer")
public class CDPlayerController {
	
	@Autowired
	private CDPlayer cdPlayer;

	@RequestMapping(value="/play", method=RequestMethod.GET)
	@ResponseBody
	public String playCDPlayer() {
		return cdPlayer.play().toString();
	}

}
