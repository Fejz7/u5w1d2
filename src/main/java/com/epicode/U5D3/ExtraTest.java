package com.epicode.U5D3;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;




    @SpringBootTest
    public class ExtraTest {

        @Autowired
        private MyExtra myExtra;

        @Test
        void testService() {
            assertEquals("Hello World", myExtra.getMessage());
        }
    }


