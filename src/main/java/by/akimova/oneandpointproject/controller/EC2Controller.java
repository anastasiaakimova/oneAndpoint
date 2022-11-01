package by.akimova.oneandpointproject.controller;

import by.akimova.oneandpointproject.model.AmazonEC2;
import by.akimova.oneandpointproject.service.EC2ServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ec2")
@Tag(name = "EC2 instance", description = "REST controller for EC2 instance info")
public class EC2Controller {

    private final EC2ServiceImpl ec2Service;

    public EC2Controller(EC2ServiceImpl ec2Service) {
        this.ec2Service = ec2Service;
    }

    @Operation(summary = "Get EC2 instance's name of the region and AZ ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Get EC2 instance's name of the region and AZ", content = @Content(mediaType = "application/json")),
    })
    @GetMapping("instance/info")
    public ResponseEntity<AmazonEC2> getAmazonEC2Info() {

        var ec2 = ec2Service.getAmazonEC2();
        return ResponseEntity.ok().body(ec2);
    }


}
