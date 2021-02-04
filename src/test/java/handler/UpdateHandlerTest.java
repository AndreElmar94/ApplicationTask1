package handler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import request.Request;
import request.RequestType;

public class UpdateHandlerTest {

    private UpdateHandler updateHandler;

    @BeforeEach
    public void initUpdateHandler() {
        updateHandler = new UpdateHandler();
    }

    @Test
    public void chekIpAddresses() {
        Request request = new Request("128.210.23.244", RequestType.UPDATE);

        String actual = updateHandler.handle(request);

        Assertions.assertTrue(true, actual);
        Assertions.assertNotNull(actual);
    }
}
