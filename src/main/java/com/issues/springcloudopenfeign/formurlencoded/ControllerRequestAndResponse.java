package com.issues.springcloudopenfeign.formurlencoded;

import java.util.Objects;

public class ControllerRequestAndResponse {

    private String field;

    public ControllerRequestAndResponse() {
    }

    public ControllerRequestAndResponse(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final ControllerRequestAndResponse that = (ControllerRequestAndResponse) o;
        return Objects.equals(field, that.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }

    @Override
    public String toString() {
        return "ControllerRequestAndResponse{" +
                "field='" + field + '\'' +
                '}';
    }

}
