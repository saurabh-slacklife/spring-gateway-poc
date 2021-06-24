package com.example.gatewaypoc.components;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public class ApiKeyHeaderKeyResolver implements KeyResolver {

  public static final String BEAN_NAME = "apiKeyHeaderKeyResolver";

  @Override
  public Mono<String> resolve(ServerWebExchange exchange) {
    return Mono.just(exchange.getRequest().getHeaders().getFirst("api_key"));
  }
}
