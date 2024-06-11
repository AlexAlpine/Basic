package lessons.lesson_19;


public class Autopilot {
    private String softwareVersion;

    public Autopilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String toString(){
        return "{Autopilot. SV:" + softwareVersion + "}";
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
