package cn.zdhspace.blog.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BlogDto {

    private String title;
    private Integer id;
    private String date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.date = dateFormat.format(date);
    }
}
