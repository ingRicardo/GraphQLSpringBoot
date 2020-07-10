/**
 * 
 */
package com.spring.app.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.spring.app.model.Greeting;
import com.spring.app.repository.GreetingRepository;

/**
 * @author SRT
 *
 */
@Component
public class GreetingMutation implements GraphQLMutationResolver {

  @Autowired
  private GreetingRepository greetingRepository;

  public Greeting newGreeting(String message) {
    Greeting greeting = new Greeting();
    greeting.setMessage(message);

    return greetingRepository.save(greeting);
  }
}