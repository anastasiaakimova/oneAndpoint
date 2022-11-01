package by.akimova.oneandpointproject;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MainController {

    @Operation(summary = "Get string \"Hello world\" ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Get string \"Hello world\" ", content = @Content(mediaType = "text/plain")),
    })
    @GetMapping("/hello")
    public ResponseEntity<String> getHello(){

        return ResponseEntity.ok().body("Hello world!");
    }
}
