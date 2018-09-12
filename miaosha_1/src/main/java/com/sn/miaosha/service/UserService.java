package com.sn.miaosha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sn.miaosha.dao.UserDao;
import com.sn.miaosha.domain.User;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	public User getById(int id){
		return userDao.getById(id);
	}
	
	@Transactional
	public boolean tx() {
		
		User u1=new User();
		u1.setId(2);
		u1.setName("果然bb");
		userDao.insert(u1);
		
		User u2=new User();
		u1.setId(1);
		u1.setName("YiYi受受");
		userDao.insert(u2);
		
		return true;
	}
}
