package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {
  private static int count;

  public PrototypeBean() {
    System.out.println("Creating PROTOTYPE bean!!!!!");
    count++;
  }

  public String getMyScope() {
    return "Prototype: " + count;
  }
}
