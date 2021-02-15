package com.southWind.demo04;

/**
 * @ClassName Host
 * @Description TODO
 * @Author
 * @Date 2021/2/12
 **/

public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
