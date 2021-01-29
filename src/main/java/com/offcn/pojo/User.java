package com.offcn.pojo;

import java.io.Serializable;

/**
 * @author： xiaoyu
 * @date： 2021/1/28 10:56
 * @version：1.0
 * @Description：
 */
public class User implements Serializable {


    private long id;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
