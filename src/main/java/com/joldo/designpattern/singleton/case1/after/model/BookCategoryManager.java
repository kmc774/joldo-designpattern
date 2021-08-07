package com.joldo.designpattern.singleton.case1.after.model;

public class BookCategoryManager {

    private static BookCategoryManager instance;

    /**
     * 생성자 접근 차단
     */
    private BookCategoryManager(){}

    /**
     * 인스턴스가 아직 생성되지 않았다면, 생성 후 리턴.
     * 이미 생성된 인스턴스가 있다면, 기존 인스턴스 리턴.
     * @return
     */
    public static BookCategoryManager getInstance(){
        if (instance == null) {
            instance = new BookCategoryManager();
        }
        return instance;
    }

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
