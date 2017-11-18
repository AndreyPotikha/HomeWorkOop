package startOop.oop.myFacebook.service.impl;

import startOop.oop.myFacebook.dao.PostDao;
import startOop.oop.myFacebook.dao.impl.PostDaoImpl;
import startOop.oop.myFacebook.model.Post;

import java.util.List;

public class PostUserImpl implements PostDao {

    @Override
    public List<Post> getAllPost() {
        PostDao postDao = new PostDaoImpl();
        return postDao.getAllPost();
    }
}
