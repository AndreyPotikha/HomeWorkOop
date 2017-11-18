package startOop.oop.myFacebook.database;

import startOop.oop.myFacebook.model.Group;
import startOop.oop.myFacebook.model.Post;
import startOop.oop.myFacebook.model.User;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Database {

    public List<Group> getGroups() {
        List<Group> groups = new LinkedList<>();
        Group group = new Group("Home", "500", LocalDate.of(2017, 11, 17));
        Group group1 = new Group("Work", "100", LocalDate.of(2015, 12, 20));
        groups.add(group);
        groups.add(group1);
        return groups;
    }

    public List<User> getUsers() {
        List<User> users = new LinkedList<>();
        User user = new User("Alex", "22");
        User user1 = new User("Bob", "45");
        users.add(user);
        users.add(user1);
        return users;
    }

    public List<Post> getPost() {
    List<Post> posts = new LinkedList<>();
        Post post = new Post("Title", "1");
        Post post1 = new Post("Title2", "2");
        posts.add(post);
        posts.add(post1);
        return posts;
    }

}
