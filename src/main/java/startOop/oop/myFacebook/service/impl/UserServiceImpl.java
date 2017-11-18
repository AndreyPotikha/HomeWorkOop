package startOop.oop.myFacebook.service.impl;

import startOop.oop.myFacebook.dao.UserDao;
import startOop.oop.myFacebook.dao.impl.UserDaoImpl;
import startOop.oop.myFacebook.model.User;
import startOop.oop.myFacebook.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUsers() {
        UserDao userDao = new UserDaoImpl();
        return userDao.getAllUser();
    }
}
