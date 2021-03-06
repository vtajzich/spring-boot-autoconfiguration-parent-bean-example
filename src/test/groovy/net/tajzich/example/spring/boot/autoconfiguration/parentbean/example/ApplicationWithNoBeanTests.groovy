package net.tajzich.example.spring.boot.autoconfiguration.parentbean.example

import net.tajzich.example.spring.boot.autoconfiguration.parentbean.example.service.Greater
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

import static junit.framework.TestCase.assertNull

@RunWith(SpringJUnit4ClassRunner)
@ActiveProfiles('no-create-bean')
@SpringApplicationConfiguration(classes = Application)
class ApplicationWithNoBeanTests {

	@Autowired(required = false)
	Greater greater

	@Test
	void contextLoads() {
		assertNull(greater)
	}
}
