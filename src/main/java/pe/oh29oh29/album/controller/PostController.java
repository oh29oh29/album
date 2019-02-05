package pe.oh29oh29.album.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @GetMapping("")
    public ResponseEntity<?> getPosts() {
        List<String> posts = new ArrayList();
        posts.add("a");
        posts.add("b");
        posts.add("c");
        return ResponseEntity.ok(posts);
    }
}
