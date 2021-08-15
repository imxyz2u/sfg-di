package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

  //this type of configuration is used for third party jars to bring the objects in to spring context
  @Bean // adding bean annotation makes it a component
  ConstructorGreetingService constructorGreetingService(){ // this gives a method to get the instance
    return new ConstructorGreetingService();
  }

  @Bean
  PropertyInjectedGreetingService propertyInjectedGreetingService(){
    return new PropertyInjectedGreetingService();
  }

  @Bean SetterInjectedGreetingService setterInjectedGreetingService(){
    return new SetterInjectedGreetingService();
  }
}
