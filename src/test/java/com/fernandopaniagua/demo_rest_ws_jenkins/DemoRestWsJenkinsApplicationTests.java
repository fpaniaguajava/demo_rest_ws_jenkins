package com.fernandopaniagua.demo_rest_ws_jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoRestWsJenkinsApplicationTests {

	@Test
	void contextLoads() {
		int resultado = 2 + 2;
		assertEquals(4, resultado, "La suma de 2 + 2 debería ser 4");
	}

}
