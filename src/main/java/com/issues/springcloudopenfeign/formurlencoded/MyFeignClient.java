package com.issues.springcloudopenfeign.formurlencoded;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import java.net.URI;

import static com.issues.springcloudopenfeign.formurlencoded.MyRestController.MY_PATH;
import static org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE;

@FeignClient(name = "my-feign-client", url = "http://localhost:80")
public interface MyFeignClient {

    @PostMapping(path = MY_PATH, consumes = APPLICATION_FORM_URLENCODED_VALUE)
    ResponseEntity<ControllerRequestAndResponse> applicationFormUrlEncodedValue(URI baseUrl, FeignRequest request);

}
