package com.joldo.designpattern.singleton.case1.after.model;

public class Book {
    public enum Category{
        Thriller,
        Humor,
        Horror
    }

    Category category;

    String categoryName;

    public Book(Category category){

        this.setCategory(category);
    }

    public void setCategory(Category category){

        BookCategoryManager bookCategoryManager = BookCategoryManager.getInstance();
        String categoryName = bookCategoryManager.getCategoryName( category);

        this.category = category;
        this.categoryName = categoryName;
    }

    @Override
    public String toString(){
        return String.format("[%s]%s", category, categoryName);
    }

}
