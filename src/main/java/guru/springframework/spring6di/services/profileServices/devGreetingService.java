package guru.springframework.spring6di.services.profileServices;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("Profiles")
public class devGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "I'm using development profile";
    }
}
