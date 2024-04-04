package com.epicode.U5D3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class IntegrationTest {

    @Autowired
    private MyRepository myRepository;

    @Test
    void testRepository() {
        assertTrue(myRepository.findAll().size() > 0);
    }
}
