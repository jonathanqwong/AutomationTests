package objects;

public class Report {
    int reportId;
    String groupTitle;
    String title;
    String description;

    public Report( int reportId, String groupTitle, String title, String description ) {
        this.reportId = reportId;
        this.groupTitle = groupTitle;
        this.title = title;
        this.description = description;
    }
}
