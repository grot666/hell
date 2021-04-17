package com.example.demo1.pojo;

public class Posts {
    private int authorId;
    private String content;

    @Override
    public String toString() {
        return "Posts{" +
                "authorId=" + authorId +
                ", content='" + content + '\'' +
                '}';
    }

    public Posts(int authorId, String content) {
        this.authorId = authorId;
        this.content = content;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
