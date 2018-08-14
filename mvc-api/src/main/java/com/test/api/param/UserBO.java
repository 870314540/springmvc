package com.test.api.param;

import java.io.Serializable;

/**
 * @author cuiyt
 * @Descrption
 * @create 2018/8/14
 */
public class UserBO implements Serializable {

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
