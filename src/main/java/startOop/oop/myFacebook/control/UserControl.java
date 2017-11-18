package startOop.oop.myFacebook.control;

import startOop.oop.myFacebook.model.User;
import startOop.oop.myFacebook.service.UserService;
import startOop.oop.myFacebook.service.impl.UserServiceImpl;

import java.util.List;

public class UserControl {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        List<User> allUsers = userService.getAllUsers();
        System.out.println(allUsers);

    }
}
