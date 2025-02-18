package co.edu.uniquindio.cityguardian.model;

import java.time.LocalDateTime;

public class Report {

    //var
    private String id;
    private String title;
    private String categoryIdFk;
    private String description;
    private String locationIdFk;
    private ReportStatus statusId;
    private LocalDateTime creationDate;
    private String clientIdFk;
    private int priority;

    //builder

    public Report(String id, String title, String categoryIdFk, String description, String locationIdFk, ReportStatus statusId, LocalDateTime creationDate, String clientIdFk, int priority) {
        this.id = id;
        this.title = title;
        this.categoryIdFk = categoryIdFk;
        this.description = description;
        this.locationIdFk = locationIdFk;
        this.statusId = statusId;
        this.creationDate = creationDate;
        this.clientIdFk = clientIdFk;
        this.priority = priority;
    }

    //empty builder

    public Report() {
    }

    //methods
    public static void updateStatus(ReportStatus status){}
    public static void addComment(Comment comment){}
    public static void assingPriority(){}
    public static void viewHistory(){}

    //getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryIdFk() {
        return categoryIdFk;
    }

    public void setCategoryIdFk(String categoryIdFk) {
        this.categoryIdFk = categoryIdFk;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocationIdFk() {
        return locationIdFk;
    }

    public void setLocationIdFk(String locationIdFk) {
        this.locationIdFk = locationIdFk;
    }

    public ReportStatus getStatusId() {
        return statusId;
    }

    public void setStatusId(ReportStatus statusId) {
        this.statusId = statusId;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getClientIdFk() {
        return clientIdFk;
    }

    public void setClientIdFk(String clientIdFk) {
        this.clientIdFk = clientIdFk;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
