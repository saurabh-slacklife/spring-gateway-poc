package com.example.gatewaypoc.components;

import org.springframework.cloud.gateway.filter.ratelimit.PrincipalNameKeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class KeyResolverConfig {

  @Bean(name = ApiQueryParamKeyResolver.BEAN_NAME)
  ApiQueryParamKeyResolver apiKeyQueryParamResolver() {
    return new ApiQueryParamKeyResolver();
  }


  @Primary
  @Bean(name = ApiKeyHeaderKeyResolver.BEAN_NAME)
  ApiKeyHeaderKeyResolver apiKeyHeaderResolver() {
    return new ApiKeyHeaderKeyResolver();

  }

  @Bean(name = "principalNameKeyResolver")
  PrincipalNameKeyResolver principalNameKeyResolver() {
    return new PrincipalNameKeyResolver();
  }
}
