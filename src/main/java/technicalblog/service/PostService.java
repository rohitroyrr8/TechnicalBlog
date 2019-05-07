package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.model.Post;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {

    public ArrayList<Post> getAllPosts() {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("Post 1 Body");
        post1.setCreatedDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 1");
        post2.setBody("Post 1 Body");
        post2.setCreatedDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post 1");
        post3.setBody("Post 1 Body");
        post3.setCreatedDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }

    public ArrayList<Post> getOnePost() {
        ArrayList<Post> tempPosts = new ArrayList<Post>();
        Post post = new Post();

        post.setTitle("THis is your first post");
        post.setBody("this is first post body");
        post.setCreatedDate(new Date());

        tempPosts.add(post);

        return tempPosts;

    }
}
