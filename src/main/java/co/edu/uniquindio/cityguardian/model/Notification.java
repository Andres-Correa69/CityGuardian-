package co.edu.uniquindio.cityguardian.model;

import java.time.LocalDateTime;

public class Notification {
    //var
    private String id;
    private String message;
    private String recipientIdFk;
    private LocalDateTime sentDate;
    private Boolean read;

    //builder

    public Notification(String id, String message, String recipientIdFk, LocalDateTime sentDate, Boolean read) {
        this.id = id;
        this.message = message;
        this.recipientIdFk = recipientIdFk;
        this.sentDate = sentDate;
        this.read = read;
    }

    //empty builder
    public Notification() {}

    //methods
    public static void sendNotification(){}
    public static void markAsRead(){}

    //getter y setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getSentDate() {
        return sentDate;
    }

    public void setSentDate(LocalDateTime sentDate) {
        this.sentDate = sentDate;
    }

    public String getRecipientIdFk() {
        return recipientIdFk;
    }

    public void setRecipientIdFk(String recipientIdFk) {
        this.recipientIdFk = recipientIdFk;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }
}
