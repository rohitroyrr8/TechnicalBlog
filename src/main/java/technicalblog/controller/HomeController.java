package technicalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getAllPosts(Model model) {
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

        model.addAttribute("posts", posts);
        return "index";
    }


}
