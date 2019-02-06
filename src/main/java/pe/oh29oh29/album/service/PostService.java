package pe.oh29oh29.album.service;

import org.springframework.stereotype.Service;
import pe.oh29oh29.album.model.Post;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> getPosts() {
        List<Post> postList = new ArrayList<>();
        Post post1 = Post.builder().id("1").description("testDesc").date("20190101").build();
        Post post2 = Post.builder().id("2").description("testDesc").date("20190101").build();
        Post post3 = Post.builder().id("3").description("testDesc").date("20190101").build();
        Post post4 = Post.builder().id("4").description("testDesc").date("20190101").build();
        Post post5 = Post.builder().id("5").description("testDesc").date("20190101").build();
        Post post6 = Post.builder().id("6").description("testDesc").date("20190101").build();
        Post post7 = Post.builder().id("7").description("testDesc").date("20190101").build();
        Post post8 = Post.builder().id("8").description("testDesc").date("20190101").build();
        Post post9 = Post.builder().id("9").description("testDesc").date("20190101").build();
        postList.add(post1);
        postList.add(post2);
        postList.add(post3);
        postList.add(post4);
        postList.add(post5);
        postList.add(post6);
        postList.add(post7);
        postList.add(post8);
        postList.add(post9);
        return postList;
    }
}
