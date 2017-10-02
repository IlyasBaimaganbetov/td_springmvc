
package com.td.service;

import com.td.entity.User;
import java.util.List;

/**
 * @author ilias
 *
 */
public interface UserService {
    public long createUser(User user);
    public User updateUser(User user);
    public void deleteUser(long id);
    public List<User> getAllUsers();
    public User getUser(long id);	
	//public List<User> getAllUsers(String userName);
}
