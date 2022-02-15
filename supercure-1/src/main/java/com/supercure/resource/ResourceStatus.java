package com.supercure.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supercure.dao.ReplyStratusDao;
import com.supercure.entity.ReplyStatus;
import com.supercure.service.ServiceReplyStatus;

@RestController
@RequestMapping("/reply/")
public class ResourceStatus {

	@Autowired
	ServiceReplyStatus service;
	
	@PostMapping("create")
	public ReplyStatus createReply(ReplyStatus reply) {
	return service.createReply(reply);	
	}
	
	@PutMapping("update")
	public ReplyStatus updateReply(ReplyStatus reply) {
	return service.updateReply(reply);	
	}
	
	@DeleteMapping("delete/id/{id}")
	public void deleteReply(@PathVariable("id") Long id) {
	service.deleteReply(id);	
	}
	
	@GetMapping("allstatus")
	public List<ReplyStatus> allStatus(){
		return service.allStatus();
	}

	
}
