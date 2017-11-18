package startOop.oop.myFacebook.dao.impl;

import startOop.oop.myFacebook.dao.UserDao;
import startOop.oop.myFacebook.database.Database;
import startOop.oop.myFacebook.model.User;

import java.util.List;

public class UserDaoImpl implements UserDao{
    @Override
    public List<User> getAllUser() {
        Database database = new Database();
        return database.getUsers();
    }

}
