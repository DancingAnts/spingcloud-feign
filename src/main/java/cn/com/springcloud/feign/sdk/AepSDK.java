package cn.com.springcloud.feign.sdk;

import cn.com.springcloud.feign.client.FeignClient;

public class AepSDK {
    public static void login(String username,String password){
        FeignClient  feignClient = Feign.builder()
                .target(FeignClient.class, "http://localhost");
        feignClient.login(username,password);
    }
    /** 测试*/
    public static void main(String[] args) {
        login("lsz","lsz");
    }

}
