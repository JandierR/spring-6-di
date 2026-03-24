package guru.springframework.spring6di.services.profileServices;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("Profiles")
public class qaGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "I'm in the Quality Assurance profile";
    }

}
