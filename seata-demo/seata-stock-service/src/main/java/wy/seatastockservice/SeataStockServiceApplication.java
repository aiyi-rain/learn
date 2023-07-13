package wy.seatastockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import wy.seatastockservice.config.DataSourceProxyConfig;

@SpringBootApplication
@ComponentScan(basePackages = {"wy"},
        excludeFilters = {@ComponentScan.Filter(
                type = FilterType.ASSIGNABLE_TYPE,
                value = {DataSourceProxyConfig.class})
        })
@EnableDiscoveryClient
@EnableFeignClients
public class SeataStockServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataStockServiceApplication.class, args);
    }

}
