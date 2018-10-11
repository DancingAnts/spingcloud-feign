package cn.com.springcloud.feign.client;


import cn.com.springcloud.feign.config.FeignConfiguration;

//@FeignClient(name="microservice-provider-user",configuration=FeignConfiguration.class)
public interface FeignClients {
    // RequestLine注解声明请求方法和请求地址,可以允许有查询参数
    @RequestLine("GET /user/login")
    String login(@Param("username") String username, @Param("password") String password);

}
