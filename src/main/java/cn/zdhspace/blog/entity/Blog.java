package cn.zdhspace.blog.entity;

import java.util.Date;

public class Blog {

    private Integer b_id;

    private String b_title;

    private String b_content;

    private Date b_date;

    private Integer b_type_id;

    private Integer b_status;

    public Integer getB_id() {
        return b_id;
    }

    public void setB_id(Integer b_id) {
        this.b_id = b_id;
    }

    public String getB_title() {
        return b_title;
    }

    public void setB_title(String b_title) {
        this.b_title = b_title;
    }

    public String getB_content() {
        return b_content;
    }

    public void setB_content(String b_content) {
        this.b_content = b_content;
    }

    public Date getB_date() {
        return b_date;
    }

    public void setB_date(Date b_date) {
        this.b_date = b_date;
    }

    public Integer getB_type_id() {
        return b_type_id;
    }

    public void setB_type_id(Integer b_type_id) {
        this.b_type_id = b_type_id;
    }

    public Integer getB_status() {
        return b_status;
    }

    public void setB_status(Integer b_status) {
        this.b_status = b_status;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "b_id=" + b_id +
                ", b_title='" + b_title + '\'' +
                ", b_content='" + b_content + '\'' +
                ", b_date=" + b_date +
                ", b_type_id=" + b_type_id +
                ", b_status=" + b_status +
                '}';
    }
}
