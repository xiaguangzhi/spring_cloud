package hzm.customer.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Created by xiaohuang on 2018/4/12.
 * ----------------The heart withered--------
 */
@Configuration
public class Swagger2 {
    @Bean
    public Docket createRestAPi(){
        return  new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("hzm.customer.service"))
                .paths(PathSelectors.any())
                .build();

    }
    private ApiInfo apiInfo(){
        return  new ApiInfoBuilder().title("customer-service api 文档")
                .description("用户对外服务的接口文档")
                .termsOfServiceUrl("/")
                .version("1.0")
                .build();
    }

}
