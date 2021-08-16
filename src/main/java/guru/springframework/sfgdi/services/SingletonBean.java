package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
  private static int count = 0;

  public SingletonBean() {
    System.out.println("Creating singleton bean!!");
    count++;
  }

  public String getMyScope() {
    return "Singleton: " + count;
  }
}
