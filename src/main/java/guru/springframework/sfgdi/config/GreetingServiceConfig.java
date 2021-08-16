package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.I18NSpanishService;
import guru.springframework.sfgdi.services.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

  //this type of configuration is used for third party jars to bring the objects in to spring context
  @Bean
  // adding bean annotation makes it a component
  ConstructorGreetingService constructorGreetingService() { // this gives a method to get the instance
    return new ConstructorGreetingService();
  }

  @Bean
  PropertyInjectedGreetingService propertyInjectedGreetingService() {
    return new PropertyInjectedGreetingService();
  }

  @Bean
  SetterInjectedGreetingService setterInjectedGreetingService() {
    return new SetterInjectedGreetingService();
  }

  @Profile("EN")
  @Bean
  I18nEnglishGreetingService i18nService() {
    return new I18nEnglishGreetingService();
  }

  @Bean("i18nService")
  @Profile("ES")
  I18NSpanishService i18NSpanishService() {
    return new I18NSpanishService();
  }

  @Bean
  @Primary
  PrimaryGreetingService primaryGreetingService() {
    return new PrimaryGreetingService();
  }
}
