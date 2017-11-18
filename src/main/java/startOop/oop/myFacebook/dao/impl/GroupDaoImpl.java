package startOop.oop.myFacebook.dao.impl;

import startOop.oop.myFacebook.dao.GropDao;
import startOop.oop.myFacebook.database.Database;
import startOop.oop.myFacebook.model.Group;

import java.util.List;

public class GroupDaoImpl implements GropDao{
    @Override
    public List<Group> getAllGroups() {
        Database database = new Database();
        return database.getGroups();
    }
}
