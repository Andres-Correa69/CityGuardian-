package co.edu.uniquindio.cityguardian.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Comment {
    //var
    private String id;
    private String content;
    private String clientIdFk;
    private String reportIdFk;
    private LocalDateTime date;

    //builder
    public Comment(String id, String content, String clientIdFk, String reportIdFk, LocalDateTime date) {
        this.id = id;
        this.content = content;
        this.clientIdFk = clientIdFk;
        this.reportIdFk = reportIdFk;
        this.date = date;
    }

    //empty builder
    public Comment() {}

    //methods
    public static void editComment(String newContent){}
    public static void deleteComment(){}

    //Getter y Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getClientIdFk() {
        return clientIdFk;
    }

    public void setClientIdFk(String clientIdFk) {
        this.clientIdFk = clientIdFk;
    }

    public String getReportIdFk() {
        return reportIdFk;
    }

    public void setReportIdFk(String reportIdFk) {
        this.reportIdFk = reportIdFk;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
