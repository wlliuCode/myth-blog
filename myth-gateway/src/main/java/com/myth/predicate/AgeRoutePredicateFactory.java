package com.myth.predicate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.cloud.gateway.handler.predicate.GatewayPredicate;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 自定义路由断言factory
 */
@Component
public class AgeRoutePredicateFactory
        extends AbstractRoutePredicateFactory<AgeRoutePredicateFactory.Config> {

    /**
     * 构造函数
     */
    public AgeRoutePredicateFactory() {
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("minAge", "maxAge");
    }
    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        return new GatewayPredicate() {
            @Override
            public boolean test(ServerWebExchange serverWebExchange) {
                String ageStr = serverWebExchange.getRequest().getQueryParams().getFirst("age");
                if (StringUtils.isNotEmpty(ageStr)) {
                    int age = Integer.parseInt(ageStr);
                    return age >= config.getMinAge() && age <= config.getMaxAge();
                }
                return true;
            }
        };
    }
    /**
     * 配置类，用于接收参数
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Config {
        private int minAge;
        private int maxAge;
    }
}
