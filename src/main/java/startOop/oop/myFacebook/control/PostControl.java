package startOop.oop.myFacebook.control;

import startOop.oop.myFacebook.database.Database;
import startOop.oop.myFacebook.model.Post;

import java.util.List;

public class PostControl {

    public static void main(String[] args) {

        Database database = new Database();
        List<Post> post = database.getPost();
        System.out.println(post);
    }
}
