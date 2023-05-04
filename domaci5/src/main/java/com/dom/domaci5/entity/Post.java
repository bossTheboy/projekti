package com.dom.domaci5.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Post {

    private Integer id;

    @NotNull(message = "Title field is required")
    @NotEmpty(message = "Title field is required")
    private String author;

    @NotNull(message = "Title field is required")
    @NotEmpty(message = "Title field is required")
    private String title;

    @NotNull(message = "Content field is required")
    @NotEmpty(message = "Content field is required")
    private String content;


    public Post(){}

    public Post(String author, String title,  String content){
        this();
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public Post(Integer id,String author, String title,  String content){
        this(author, title, content);
        this.id = id;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



}
