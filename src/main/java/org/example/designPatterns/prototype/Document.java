package org.example.designPatterns.prototype;

import java.util.Objects;

abstract class Document implements Cloneable {
    private String type;
    private String content;

    public Document(String type, String content) {
        this.type = type;
        this.content = content;
    }

    public abstract Document clone();

    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;
        Document document = (Document) o;
        return Objects.equals(type, document.type) && Objects.equals(content, document.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, content);
    }
}