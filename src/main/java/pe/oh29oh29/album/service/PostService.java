package pe.oh29oh29.album.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.oh29oh29.album.model.Post;
import pe.oh29oh29.album.repository.PostRepository;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getPosts(String categoryId) {
        return postRepository.findAll();
    }

    public Post getPost(String postId) {
        return postRepository.findById(postId).get();
    }
}
