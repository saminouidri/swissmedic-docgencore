package com.swissmedic.docgencore;

import com.swissmedic.docgencore.API.Controller.DocumentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

//sanity and basic tests

@SpringBootTest
class DocGenCoreApplicationTests {

	@Autowired
	private DocumentController DocumentController;

	@Test
	void contextLoads() {
		assertThat(DocumentController).isNotNull();
	}

}
