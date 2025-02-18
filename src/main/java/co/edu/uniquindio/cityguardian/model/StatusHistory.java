package co.edu.uniquindio.cityguardian.model;

import java.time.LocalDateTime;

public class StatusHistory {
    //var
    private String id;
    private String reportIdFk;
    private ReportStatus previusStatusId;
    private ReportStatus newStatusId;
    private LocalDateTime changeDate;

    //builder

    public StatusHistory(String id, String reportIdFk, ReportStatus previusStatusId, ReportStatus newStatusId, LocalDateTime changeDate) {
        this.id = id;
        this.reportIdFk = reportIdFk;
        this.previusStatusId = previusStatusId;
        this.newStatusId = newStatusId;
        this.changeDate = changeDate;
    }

    //empty builder
    public StatusHistory(){}

    //methods
    public static void recordStatusChange(){}

    //getters y setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReportIdFk() {
        return reportIdFk;
    }

    public void setReportIdFk(String reportIdFk) {
        this.reportIdFk = reportIdFk;
    }

    public ReportStatus getPreviusStatusId() {
        return previusStatusId;
    }

    public void setPreviusStatusId(ReportStatus previusStatusId) {
        this.previusStatusId = previusStatusId;
    }

    public ReportStatus getNewStatusId() {
        return newStatusId;
    }

    public void setNewStatusId(ReportStatus newStatusId) {
        this.newStatusId = newStatusId;
    }

    public LocalDateTime getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(LocalDateTime changeDate) {
        this.changeDate = changeDate;
    }
}
