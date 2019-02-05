package pe.oh29oh29.album.service;

import org.springframework.stereotype.Service;
import pe.oh29oh29.album.model.Category;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    public List<Category> getCategories() {
        List<Category> categoryList = new ArrayList<>();
        Category category1 = Category.builder().id("1").title("testTitle").description("testDesc").durationFrom("20190101").durationTo("20190131").build();
        Category category2 = Category.builder().id("2").title("testTitle").description("testDesc").durationFrom("20190101").durationTo("20190131").build();
        Category category3 = Category.builder().id("3").title("testTitle").description("testDesc").durationFrom("20190101").durationTo("20190131").build();
        categoryList.add(category1);
        categoryList.add(category2);
        categoryList.add(category3);
        return categoryList;
    }
}
