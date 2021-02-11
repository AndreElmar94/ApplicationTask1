package handler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import request.Request;
import request.RequestType;

public class CreateHandlerTest {
    private CreateHandler createHandler;

    @BeforeEach
    public void initCreateHandler() {
        createHandler = new CreateHandler();
    }

    @Test
    public void testReverseWord() {
        Request request = new Request("Hello", RequestType.CREATE);
        String expected = "olleH";

        String actual = createHandler.handle(request);

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(expected, actual);
    }

}
