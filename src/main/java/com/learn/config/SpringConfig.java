package com.learn.config;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@Configuration
@ComponentScan(value="com.learn",
//        excludeFilters = @ComponentScan.Filter(
//                type = FilterType.ANNOTATION,
//                classes = Controller.class
//        )
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = RestController.class)
        }
)
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class SpringConfig {
        @Bean
        public PlatformTransactionManager transactionManager(DataSource dataSource) {
                return new DataSourceTransactionManager(dataSource);
        }
}
