package com.example.demo.bean.po;

public class Page {

    private int currentPage;
    private int pageSize;
    private int starter;

    public int getStarter(int currentPage,int pageSize) {
        return starter=(currentPage-1)*pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
