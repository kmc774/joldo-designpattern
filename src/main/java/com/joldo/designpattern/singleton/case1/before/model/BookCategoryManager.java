package com.joldo.designpattern.singleton.case1.before.model;

public class BookCategoryManager {

    public BookCategoryManager(){}


    /**
     * 카테고리에 해당하는 이름을 리턴
     * @param category
     * @return
     */
    public String getCategoryName(Book.Category category) {
        switch (category){
            case Thriller:
                return "쪼그라드는 스릴러";
            case Humor:
                return "배꼽보다 유머";
            case Horror:
                return "불꽃 호러";
        }

        throw new RuntimeException("Invalid category.");
    }
}
