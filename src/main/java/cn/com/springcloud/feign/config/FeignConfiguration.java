package cn.com.springcloud.feign.config;


@Configuration
public class FeignConfiguration {
    @Bean
    public Contract feignConfiguration(){
        return new feign.Contract.Default();
    }
}
