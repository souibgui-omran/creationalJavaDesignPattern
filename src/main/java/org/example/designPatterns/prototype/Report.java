package org.example.designPatterns.prototype;

public class Report extends Document {
    private String author;
    private String title;

    public Report(String content, String author, String title) {
        super("Report", content);
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Report clone() {
        return new Report(getContent(), getAuthor(), getTitle());
    }
}
