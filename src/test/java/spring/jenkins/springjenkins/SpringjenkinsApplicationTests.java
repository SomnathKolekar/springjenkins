package spring.jenkins.springjenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringjenkinsApplicationTests {
	static Logger logger = LoggerFactory.getLogger(SpringjenkinsApplication.class);

	@Test
	 public void contextLoads() {
		logger.info("test case executing started...");
		logger.info("second commit test case executing started...");
		assertEquals(true, true) ;
		
	}

}
