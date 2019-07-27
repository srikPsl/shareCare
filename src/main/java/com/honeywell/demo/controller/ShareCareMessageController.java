package com.honeywell.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.demo.entity.MapUserGrpMessage;
import com.honeywell.demo.service.ShareCareService;

@RestController
@RequestMapping("/rest")
public class ShareCareMessageController {
	
	@RequestMapping(value="/message", method=RequestMethod.POST)
	public boolean message(@RequestBody MapUserGrpMessage msg){
		
		
		return new ShareCareService().createMessage(msg);
		
	}
	
	@RequestMapping(value="/messages", method=RequestMethod.GET)
	public List<MapUserGrpMessage> messages(){
		
		
		return new ShareCareService().getMessages();
		
	}
	
}
