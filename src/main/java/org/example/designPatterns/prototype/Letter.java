package org.example.designPatterns.prototype;

public class Letter extends Document {
    private String sender;
    private String recipient;

    public Letter(String content, String sender, String recipient) {
        super("Letter", content);
        this.sender = sender;
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public Letter clone() {
        return new Letter(getContent(), getSender(), getRecipient());
    }
}