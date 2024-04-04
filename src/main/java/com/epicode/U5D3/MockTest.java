package com.epicode.U5D3;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MockTest {

    @Mock
    private MyExtra myExtra;

        @Test
        void testMock() {
            MockitoAnnotations.initMocks(this);
            when(myExtra.getMessage()).thenReturn("Mocked message");
            String message = myExtra.getMessage();
            verify(myExtra).getMessage();
    }
}
