package com.southWind.demo05;

import org.aspectj.weaver.ast.Var;

/**
 * @ClassName Test01
 * @Description TODO
 * @Author \
 * @Date 2021/2/13
 **/

public class Test01 {
    public static void main(String[] args) {
        TestImpl test=new TestImpl();
        ProxyTest proxyTest=new ProxyTest();
        proxyTest.setTest(test);
        Test proxy =(Test) proxyTest.getProxy();
        proxy.add();
    }
}
