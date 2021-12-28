package com.example.gateway;

import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class BoardFilter extends AbstractGatewayFilterFactory<BoardFilter.Config> {
    private static final Logger logger = LogManager.getLogger(BoardFilter.class);

    public BoardFilter() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return ((exchange, chain) -> {
            logger.info("BoardFilter baseMessage : " + config.getBaseMessage());
            if (config.isPreLogger()) {
                logger.info("BoardFilter Start : " + exchange.getRequest());
            }
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                if (config.isPostLogger()) {
                    logger.info("BoardFilter End : " + exchange.getResponse());
                }
            }));
        });
    }

    @Data
    public static class Config {
        private String baseMessage;
        private boolean preLogger;
        private boolean postLogger;
    }
}
