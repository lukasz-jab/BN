package bn.model;

import java.util.List;

public class ProjectData {

    private String title;
    private String startDate;
    private String endDate;
    private String description;
    private Affiliation affiliation;
    private List<String> keywords = null;
    private List<String> invites = null;
    private String inviteMessage;
    private String projectid;


    public String getTitle() {
        return title;
    }

    public ProjectData withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public ProjectData withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public ProjectData withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProjectData withDescription(String description) {
        this.description = description;
        return this;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    public ProjectData withAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
        return this;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public ProjectData withKeywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    public List<String> getInvites() {
        return invites;
    }

    public ProjectData withInvites(List<String> invites) {
        this.invites = invites;
        return this;
    }

    public String getInviteMessage() {
        return inviteMessage;
    }

    public ProjectData withInviteMessage(String inviteMessage) {
        this.inviteMessage = inviteMessage;
        return this;
    }

    public String getProjectid() {
        return projectid;
    }

    public ProjectData withProjectid(String projectid) {
        this.projectid = projectid;
        return this;
    }

    @Override
    public String toString() {
        return "ProjectData{" +
                "title='" + title + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", description='" + description + '\'' +
                ", affiliation=" + affiliation +
                ", keywords=" + keywords +
                ", invites=" + invites +
                ", inviteMessage='" + inviteMessage + '\'' +
                ", projectid='" + projectid + '\'' +
                '}';
    }
}
