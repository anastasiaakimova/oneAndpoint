package by.akimova.oneandpointproject.service;

import by.akimova.oneandpointproject.model.AmazonEC2;
import com.amazonaws.util.EC2MetadataUtils;
import org.springframework.stereotype.Service;

@Service
public class EC2ServiceImpl {

    /**
     * Make the object with the name of the region and AZ the application is running
     * @return amazonEC2
     */
    public AmazonEC2 getAmazonEC2() {
        AmazonEC2 amazonEC2 = new AmazonEC2();
        EC2MetadataUtils.InstanceInfo info = EC2MetadataUtils.getInstanceInfo();

        amazonEC2.setAvailabilityZone(info.getAvailabilityZone());
        amazonEC2.setRegion(info.getRegion());

        return amazonEC2;
    }

}
