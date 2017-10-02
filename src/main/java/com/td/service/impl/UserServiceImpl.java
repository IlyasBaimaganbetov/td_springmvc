package com.td.service.impl;

import com.td.dao.UserDAO;
import com.td.entity.User;
import com.td.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
/**
 * @author ilias
 *
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl()");
	}
	
    @Autowired
    private UserDAO userDAO;

    @Override
    public long createUser(User user) {
        return userDAO.createUser(user);
    }
    @Override
    public User updateUser(User user) {
        return userDAO.updateUser(user);
    }
    @Override
    public void deleteUser(long id) {
        userDAO.deleteUser(id);
    }
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
    @Override
    public User getUser(long id) {
        System.out.println("zashel v UserServiceImpl.getUser");
        return userDAO.getUser(id);
    }    
    /*@Override
    public List<Employee> getAllEmployees(String employeeName) {
    	return employeeDAO.getAllEmployees(employeeName);
    }*/
}
