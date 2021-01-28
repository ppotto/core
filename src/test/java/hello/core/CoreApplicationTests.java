package hello.core;

import hello.core.beanfind.ApplicationContextExtendsFindTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CoreApplicationTests {

	@Test
	void contextLoads() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);


	}

}
