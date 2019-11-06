package com.lgastelu.examen.models;
import com.orm.dsl.Table;

@Table
public class Notes {
    private Long id;
    private String title;
    private String Content;

    public Notes(String title, String content) {
        this.title = title;
        Content = content;
    }

    public Notes(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
