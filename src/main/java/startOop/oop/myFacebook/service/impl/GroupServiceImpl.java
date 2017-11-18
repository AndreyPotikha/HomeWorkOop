package startOop.oop.myFacebook.service.impl;

import startOop.oop.myFacebook.dao.GropDao;
import startOop.oop.myFacebook.dao.impl.GroupDaoImpl;
import startOop.oop.myFacebook.model.Group;
import startOop.oop.myFacebook.service.GroupService;

import java.util.List;

public class GroupServiceImpl implements GroupService {
    @Override
    public List<Group> getAllGroup() {
        GropDao gropDao = new GroupDaoImpl();
        return gropDao.getAllGroups();
    }
}
