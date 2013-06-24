package com.teddy.blog.service;

import java.util.HashMap;
import java.util.Map;

import com.teddy.blog.bean.TUser;
import com.teddy.blog.dao.TUserDAO;
import com.teddy.blog.service.base.IService;

public class UserService implements IService {
	public static final Map<Integer, String> HOST_MAP = new HashMap<Integer, String>();
	
	static {
		HOST_MAP.put(1, "Teddy");
		HOST_MAP.put(2, "Shall");
	}
	
	TUserDAO userDAO = new TUserDAO();
	
	public TUser findById(Integer id) {
		return userDAO.findById(id);
	}
}
