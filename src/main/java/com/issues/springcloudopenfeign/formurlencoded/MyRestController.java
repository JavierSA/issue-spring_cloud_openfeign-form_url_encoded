package com.issues.springcloudopenfeign.formurlencoded;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE;

@RestController
public class MyRestController {

    static final String MY_PATH = "/my/path";

    @PostMapping(path = MY_PATH, consumes = APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<ControllerRequestAndResponse> applicationFormUrlEncodedValue(ControllerRequestAndResponse request) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(request);
    }

}
