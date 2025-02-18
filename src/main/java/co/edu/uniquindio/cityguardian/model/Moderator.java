package co.edu.uniquindio.cityguardian.model;

import java.time.LocalDateTime;

public class Moderator extends User {
    //var
    private String moderatorId;
    private String userIdFk;

    //builder
    public Moderator(String id, String name, String email, String phone, String address, String city, String password, Boolean active, UserRol role, String moderatorId, String userIdFk) {
        super(id, name, email, phone, address, city, password, active, role);
        this.moderatorId = moderatorId;
        this.userIdFk = userIdFk;
    }

    //empty builder
    public Moderator() {
    }

    //methods
    public static void manageCategories(Category category){}
    public static void verifyReport(String reportId){}
    public static void rejectReport(String reportId, String reason){}
    public static void deletedReport(String reportId){}
    public static void markReportResolved(String reportId){}
    public static void generateReport(LocalDateTime start,LocalDateTime end){}

    //getters y setters


    public String getModeratorId() {
        return moderatorId;
    }

    public void setModeratorId(String moderatorId) {
        this.moderatorId = moderatorId;
    }

    public String getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(String userIdFk) {
        this.userIdFk = userIdFk;
    }
}
