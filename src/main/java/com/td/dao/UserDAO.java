/**
 * 
 */
package com.td.dao;

import java.util.List;
import com.td.entity.User;

/**
 * 
 * @author ilias
 */
public interface UserDAO {
    public long createUser(User user);
    public User updateUser(User user);
    public void deleteUser(long id);
    public List<User> getAllUsers();
    public User getUser(long id);	
    //public List<User> getAllUsers(String userName);
}
