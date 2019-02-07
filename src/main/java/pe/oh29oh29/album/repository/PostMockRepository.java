package pe.oh29oh29.album.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import pe.oh29oh29.album.model.Post;

import java.util.*;

@Repository
@Profile("dev")
public class PostMockRepository implements PostRepository {

    private Map<String, Post> postMap;

    PostMockRepository() {
        postMap = new HashMap<>();
        postMap.put("1", Post.builder().id("1").description("testDesc").uploadDate("20190101").realDate("20190101").imageUrl("https://picsum.photos/250/250/?image=000").build());
        postMap.put("2", Post.builder().id("2").description("testDesc").uploadDate("20190101").realDate("20190101").imageUrl("https://picsum.photos/250/250/?image=100").build());
        postMap.put("3", Post.builder().id("3").description("testDesc").uploadDate("20190101").realDate("20190101").imageUrl("https://picsum.photos/250/250/?image=200").build());
        postMap.put("4", Post.builder().id("4").description("testDesc").uploadDate("20190101").realDate("20190101").imageUrl("https://picsum.photos/250/250/?image=301").build());
        postMap.put("5", Post.builder().id("5").description("testDesc").uploadDate("20190101").realDate("20190101").imageUrl("https://picsum.photos/250/250/?image=400").build());
        postMap.put("6", Post.builder().id("6").description("testDesc").uploadDate("20190101").realDate("20190101").imageUrl("https://picsum.photos/250/250/?image=500").build());
        postMap.put("7", Post.builder().id("7").description("testDesc").uploadDate("20190101").realDate("20190101").imageUrl("https://picsum.photos/250/250/?image=600").build());
        postMap.put("8", Post.builder().id("8").description("testDesc").uploadDate("20190101").realDate("20190101").imageUrl("https://picsum.photos/250/250/?image=700").build());
        postMap.put("9", Post.builder().id("9").description("testDesc").uploadDate("20190101").realDate("20190101").imageUrl("https://picsum.photos/250/250/?image=800").build());
        postMap.put("10", Post.builder().id("10").description("testDesc").uploadDate("20190101").realDate("20190101").imageUrl("https://picsum.photos/250/250/?image=130").build());
        postMap.put("11", Post.builder().id("11").description("testDesc").uploadDate("20190101").realDate("20190101").imageUrl("https://picsum.photos/250/250/?image=250").build());
        postMap.put("12", Post.builder().id("12").description("testDesc").uploadDate("20190101").realDate("20190101").imageUrl("https://picsum.photos/250/250/?image=350").build());
    }

    @Override
    public List<Post> findAll() {
        return new ArrayList<>(postMap.values());
    }

    @Override
    public List<Post> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Post> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Post> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Post entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Post> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Post> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Post> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Post> findById(String s) {
        return Optional.of(postMap.get(s));
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Post> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Post> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Post getOne(String s) {
        return null;
    }

    @Override
    public <S extends Post> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Post> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Post> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Post> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Post> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Post> boolean exists(Example<S> example) {
        return false;
    }
}
