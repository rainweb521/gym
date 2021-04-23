package com.fc.test.model.auto;

import java.io.Serializable;

/**
 * @Author: wcy
 * @Date: 2020/2/28
 */
public class CourseTest implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer all;
    private Integer today;
    private String username;

    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }

    public Integer getToday() {
        return today;
    }

    public void setToday(Integer today) {
        this.today = today;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
