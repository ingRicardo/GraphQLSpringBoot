/**
 * 
 */
package com.spring.app.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.spring.app.model.Greeting;
import com.spring.app.repository.GreetingRepository;

/**
 * @author SRT
 *
 */
@Component
public class GreetingQuery implements GraphQLQueryResolver {

  @Autowired
  private GreetingRepository greetingRepository;

  public Greeting getGreeting(String id) {
    return greetingRepository.find(id);
  }
}