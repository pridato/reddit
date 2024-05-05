package es.aplicaciones.reddit.controller;

import es.aplicaciones.reddit.model.Post;
import es.aplicaciones.reddit.repositories.PostRepository;
import es.aplicaciones.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@CrossOrigin(origins = "http://localhost:4321")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("get-posts")
    public List<Post> ListgetPosts() {
        return this.postService.getPosts();
    }

    @GetMapping("toggle-like")
    public Post toggleLike(@RequestParam String id, @RequestParam Boolean like) {
        return this.postService.toggleLike(id, like);
    }
}
