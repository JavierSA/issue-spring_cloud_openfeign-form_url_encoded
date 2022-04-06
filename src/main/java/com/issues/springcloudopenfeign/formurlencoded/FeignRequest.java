package com.issues.springcloudopenfeign.formurlencoded;

import org.springframework.util.LinkedMultiValueMap;

public class FeignRequest extends LinkedMultiValueMap<String, String> {

    public FeignRequest(String field) {
        set("field", field);
    }

}
