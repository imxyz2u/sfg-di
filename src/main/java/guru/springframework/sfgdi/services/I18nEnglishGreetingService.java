package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingsRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingsRepository englishGreetingsRepository;

    public I18nEnglishGreetingService(EnglishGreetingsRepository englishGreetingsRepository) {
        this.englishGreetingsRepository = englishGreetingsRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
