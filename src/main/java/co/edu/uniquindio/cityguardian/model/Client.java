package co.edu.uniquindio.cityguardian.model;

public class Client extends User {

    //var


    private String userIdFk;

    //builder

    public Client(String id, String name, String lastName, String email, String phone, String address, String city, String password, Boolean active, UserRol role, String clientId, String userIdFk) {
        super(id, name, lastName, email, phone, address, city, password, active, role);

        this.userIdFk = userIdFk;
    }

    //empty builder
    public Client() {
    }

    //methods

    public static void createReport(Report report){}
    public static void editReport(Report report){}
    public static void deleteReport(Report report){}
    public static void changeReportStatus(String reportId, ReportStatus status){}
    public static void markReportImportant(String reportId){}
    public static void commentReport(String reportId, Comment comment){}
    public static void receiveNotification(){}

    //getter y setter

    public String getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(String userIdFk) {
        this.userIdFk = userIdFk;
    }
}
