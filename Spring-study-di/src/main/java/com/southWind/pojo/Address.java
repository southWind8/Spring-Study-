package com.southWind.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Address
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/9
 **/
@Builder
@AllArgsConstructor@NoArgsConstructor
@Data
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
