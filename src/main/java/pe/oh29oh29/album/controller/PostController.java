package pe.oh29oh29.album.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.oh29oh29.album.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("")
    public ResponseEntity<?> getPosts(String categoryId) {
        return ResponseEntity.ok(postService.getPosts(categoryId));
    }

    @GetMapping("/{postId}")
    public ResponseEntity<?> getPost(@PathVariable  String postId) {
        System.out.println(postId);
        return ResponseEntity.ok(postService.getPost(postId));
    }
}
