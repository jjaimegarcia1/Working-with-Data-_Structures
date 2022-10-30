public class TruckObject {
    private int truckID;
    private int packages;
    private String zip;

    public TruckObject(int truckID, int packages, String zip) {
        this.truckID = truckID;
        this.packages = packages;
        this.zip = zip;
    }
    public Integer getTruckID() {
        return truckID;
    }

    public void setTruckID(Integer truckID) {
        this.truckID = truckID;
    }

    public Integer getPackages() {
        return packages;
    }

    public void setPackages(Integer packages) {
        this.packages = packages;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    @Override
    public String toString() {
        return "truckID = " + truckID +
                ", packages = " + packages +
                ", zip = " + zip;
    }
}
