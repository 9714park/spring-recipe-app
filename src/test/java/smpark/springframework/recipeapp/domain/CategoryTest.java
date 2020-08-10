package smpark.springframework.recipeapp.domain;

import org.junit.Before;

import static org.junit.Assert.*;

public class CategoryTest {
    Category category;
    @Before
    public void setUp(){
        category = new Category();
    }

    @org.junit.Test
    public void getId() {
        Long id = 4L;
        category.setId(id);
        assertEquals(id, category.getId());
    }

    @org.junit.Test
    public void getDescription() {
    }

    @org.junit.Test
    public void getRecipes() {
    }
}