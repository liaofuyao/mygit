package com.colin.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Colin on 2017/12/21.
 */
@Entity
@Table(name="role")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }
}
