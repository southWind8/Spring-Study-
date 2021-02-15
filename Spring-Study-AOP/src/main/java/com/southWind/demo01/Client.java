package com.southWind.demo01;

/**
 * @ClassName Client
 * @Description TODO
 * @Author
 * @Date 2021/2/12
 **/

public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host=new Host();
        //代理，中介帮助房东租房子，但是代理角色一般会有一些附属操作
        Proxy proxy = new Proxy(host);
        //你不用面对房东直接找中介租房即可
        proxy.rent();
    }
}
