package startOop.oop.myFacebook.dao.impl;

import startOop.oop.myFacebook.dao.PostDao;
import startOop.oop.myFacebook.database.Database;
import startOop.oop.myFacebook.model.Post;

import java.util.List;

public class PostDaoImpl implements PostDao {
    @Override
    public List<Post> getAllPost() {
        Database database = new Database();
        return database.getPost();
    }
}
