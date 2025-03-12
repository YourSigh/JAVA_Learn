package com.learn.dao.impl;

import com.learn.dao.BookDao;

public class BookDaoImpl implements BookDao{
    private String dataBaseName;
    private String totalCount;

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public void save() {
        System.out.println("BookDaoImpl save... " + totalCount + " " + dataBaseName );
    }
}
