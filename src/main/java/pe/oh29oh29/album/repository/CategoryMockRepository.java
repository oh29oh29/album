package pe.oh29oh29.album.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import pe.oh29oh29.album.model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Profile("dev")
public class CategoryMockRepository implements CategoryRepository {

    private List<Category> categoryList;

    CategoryMockRepository() {
        categoryList = new ArrayList<>();
        categoryList.add(Category.builder().id("1").title("testTitle").description("testDesc").durationFrom("20190101").durationTo("20190131").build());
        categoryList.add(Category.builder().id("2").title("testTitle").description("testDesc").durationFrom("20190101").durationTo("20190131").build());
        categoryList.add(Category.builder().id("3").title("testTitle").description("testDesc").durationFrom("20190101").durationTo("20190131").build());
    }

    @Override
    public List<Category> findAll() {
        return categoryList;
    }

    @Override
    public List<Category> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Category> findAllById(Iterable<String> strings) {
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
    public void delete(Category entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Category> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Category> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Category> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Category> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Category> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Category> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Category getOne(String s) {
        return null;
    }

    @Override
    public <S extends Category> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Category> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Category> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Category> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Category> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Category> boolean exists(Example<S> example) {
        return false;
    }
}
