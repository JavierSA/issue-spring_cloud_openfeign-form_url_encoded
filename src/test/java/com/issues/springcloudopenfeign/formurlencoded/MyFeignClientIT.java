package com.issues.springcloudopenfeign.formurlencoded;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.net.URI;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
class MyFeignClientIT {

    @LocalServerPort
    private int port;

    @Autowired
    private MyFeignClient feignClient;

    @Test
    void applicationFormUrlencodedValue() {
        final URI baseUrl = URI.create("http://localhost:" + port);
        final String fieldValue = "Field value";
        final FeignRequest request = new FeignRequest(fieldValue);

        final ResponseEntity<ControllerRequestAndResponse> responseEntity = feignClient.applicationFormUrlEncodedValue(baseUrl, request);

        assertThat(responseEntity.getBody()).isEqualTo(new ControllerRequestAndResponse(fieldValue));
    }

}
