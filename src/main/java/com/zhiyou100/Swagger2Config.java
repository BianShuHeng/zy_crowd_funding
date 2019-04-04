package com.zhiyou100;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 两个注解 Configuration // 说明这是一个配置类 @EnableSwagger2  说明这是 swagger2 的配置类
 * @author BianGe
 * @date 2019/3/28
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    // 复制粘贴配置方法，使用 alt + enter 依次导入需要的包

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // controller 包的位置
                .apis(RequestHandlerSelectors.basePackage("com.zhiyou100.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // api 文档的标题
                .title("springboot利用swagger构建api文档")
                // api 文档的详细描述信息
                .description("简单优雅的restfun风格，http://www.zhiyou100.com")
                // 公司的官网
                .termsOfServiceUrl("http://www.zhiyou100.com")
                // api 的版本号
                .version("1.0")
                .build();
    }
}
