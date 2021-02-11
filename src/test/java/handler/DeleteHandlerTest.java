package handler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import request.Request;
import request.RequestType;

public class DeleteHandlerTest {
    private DeleteHandler deleteHandler;

    @BeforeEach
    public void initDeleteHandler() {
        deleteHandler = new DeleteHandler();
    }

    @Test
    public void testCountWords() {
        Request request = new Request("Hello world!!!!!", RequestType.DELETE);
        String expected = "2";

        String actual = deleteHandler.handle(request);

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotNull(actual);
    }
}
