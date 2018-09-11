package cn.zdhspace.blog.dto;

public class ImageUploadJsonObject {

    private int success;

    private String message = "长传图片成功";

    private String url;

    public ImageUploadJsonObject(int success, String url) {
        this.success = success;
        this.url = url;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
