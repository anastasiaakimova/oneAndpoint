package by.akimova.oneandpointproject.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AmazonEC2 {

    private String region;
    private String availabilityZone;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
}
