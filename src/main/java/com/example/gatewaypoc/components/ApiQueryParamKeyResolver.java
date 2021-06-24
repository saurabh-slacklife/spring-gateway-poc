package com.example.gatewaypoc.components;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public class ApiQueryParamKeyResolver implements KeyResolver {

  public static final String BEAN_NAME = "apiQueryParamKeyResolver";

  @Override
  public Mono<String> resolve(ServerWebExchange exchange) {
    return Mono.just(exchange.getRequest().getQueryParams().getFirst("api_key"));
  }
}
