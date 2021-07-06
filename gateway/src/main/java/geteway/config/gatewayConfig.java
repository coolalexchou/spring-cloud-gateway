package geteway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class gatewayConfig {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		return builder
				.routes()
				.route("gateway_route_2", 
						p -> p.path("/c")
						.uri("https://tw.yahoo.com/"))
				.build();
    }
}