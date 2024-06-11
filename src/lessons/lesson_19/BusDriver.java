package lessons.lesson_19;


public class BusDriver {
    private String licenseNumber;
    private Autobus autobus;

    public BusDriver(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("{ BusDriver: ");
        sb.append(licenseNumber).append("; bus:");
        sb.append(autobus != null ? autobus.getId() : " {out of bus}");
        sb.append(" }");

        return sb.toString();

//        return "{BusDriver: " + licenseNumber + "; bus:" + autobus.getId() + "}";
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }
}
