package guru.springframework.sfgdi.repositories;

public class EnglishGreetingsRepositoryImpl implements EnglishGreetingsRepository {

  @Override
  public String syaHello() {
    return "Hello World - EN";
  }
}
