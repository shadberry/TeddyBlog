package net.teddy.service.impl;

import java.util.HashMap;
import java.util.Map;

import net.teddy.dao.impl.TUserDAO;
import net.teddy.model.impl.TUser;
import net.teddy.service.base.IService;

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
