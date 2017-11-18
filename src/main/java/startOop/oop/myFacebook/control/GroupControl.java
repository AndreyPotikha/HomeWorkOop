package startOop.oop.myFacebook.control;

import startOop.oop.myFacebook.database.Database;
import startOop.oop.myFacebook.model.Group;

import java.util.List;

public class GroupControl {

    public static void main(String[] args) {

        Database database = new Database();
        List<Group> groups = database.getGroups();
        System.out.println(groups);

    }
}
