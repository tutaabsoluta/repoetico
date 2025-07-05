package com.alonso.blog.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tag")
public class TagEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 55)
    private String name;

    @Column(nullable = false, unique = true)
    private String slug;


    protected TagEntity() {};

    public  TagEntity( String name, String slug ) {
        this.name = name;
        this.slug = slug;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
