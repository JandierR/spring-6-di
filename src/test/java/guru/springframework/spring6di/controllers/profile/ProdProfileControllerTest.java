package guru.springframework.spring6di.controllers.profile;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("prod")
@SpringBootTest
class ProdProfileControllerTest {

    @Autowired
    ProfileController profileController;

    @Test
    void sayHello() {
        System.out.println(profileController.sayHello());
    }
}