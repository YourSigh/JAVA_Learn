package com.learn.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.learn")
@PropertySource("jdbc.properties")
@Import({JdbcConfig.class})
public class SpringConfig {
}
