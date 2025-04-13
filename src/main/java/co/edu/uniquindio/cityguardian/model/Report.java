package co.edu.uniquindio.cityguardian.model;

import java.time.LocalDateTime;

public class Report {

    //var
    private String id;
    private String title;
    private Category category;
    private String description;
    private String locationIdFk;
    private ReportStatus status;
    private LocalDateTime creationDate;
    private String clientIdFk;
    private int priority;

    //builder

    public Report(String id, String title, Category category, String description, String locationIdFk, ReportStatus status, LocalDateTime creationDate, String clientIdFk, int priority) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.description = description;
        this.locationIdFk = locationIdFk;
        this.status = status;
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

    public Category getCategoryIdFk() {
        return category;
    }

    public void setCategoryIdFk(Category categoryIdFk) {
        this.category = categoryIdFk;
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

    public ReportStatus getStatus() {
        return status;
    }

    public void setStatus(ReportStatus status) {
        this.status = status;
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
