package guru.springframework.sfgdi.services;

//@Service
// using java configuration class
public class ConstructorGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello World - Constructor";
  }
}
