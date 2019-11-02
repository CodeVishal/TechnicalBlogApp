package technicalblog.controller;

import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;
import org.springframework.ui.Model;
import technicalblog.service.PostService;

@Controller
public class HomeController {
    public HomeController(){
        System.out.println("****HomeController****");
    }
    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String getAllPosts(Model model){

        ArrayList<Post> posts= postService.getAllPosts();

        model.addAttribute("posts",posts);

        return "index";

    }
}
