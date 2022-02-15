package com.supercure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supercure.dao.ReplyStratusDao;
import com.supercure.entity.ReplyStatus;

@Service
public class ServiceReplyStatus {

	@Autowired
	ReplyStratusDao repo;
	public ReplyStatus createReply(ReplyStatus reply) {
	return repo.save(reply);	
	}
	
	public ReplyStatus updateReply(ReplyStatus reply) {
	return repo.save(reply);	
	}
	
	public void deleteReply(Long id) {
	repo.deleteById(id);	
	}
	
	public List<ReplyStatus> allStatus(){
		return repo.findAll();
	}
	
}
