package com.southWind.demo01;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName Proxy
 * @Description TODO
 * @Author
 * @Date 2021/2/12
 **/
@AllArgsConstructor
@NoArgsConstructor@Data@Builder
public class Proxy implements Rent {

    private Host host;


    @Override
    public void rent() {
        host.rent();
        SeeHouse();
        law();
        fare();
    }
    public void SeeHouse(){
        System.out.println("中介带你看房子");
    }
    public void law(){
        System.out.println("中介和你签合同");
    }
    public void fare(){
        System.out.println("中介收钱");
    }
}
