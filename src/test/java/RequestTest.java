import handler.*;
import org.junit.Assert;
import org.junit.Test;
import request.Request;
import request.RequestType;

import java.util.ArrayList;
import java.util.List;

public class RequestTest {

    HandlerLocator handlerLocator = new HandlerLocator();

    @Test
    public void handleCreate() {
        //given
        Request createRequest = new Request("Hello Lesha", RequestType.CREATE);

        //when
        Handler suitableHandler = handlerLocator.getHandler(createRequest.getType());
        suitableHandler.handle(createRequest);

        //then
        Assert.assertNotNull(createRequest.getPayload(), createRequest.getType());
    }

    @Test
    public void handleUpdate() {
        //given
        Request updateRequest = new Request("128.210.23.244", RequestType.UPDATE);

        //when
        Handler suitableHandler = handlerLocator.getHandler(updateRequest.getType());
        suitableHandler.handle(updateRequest);

        //then
        Assert.assertNotNull(updateRequest.getPayload(), updateRequest.getType());
    }

    @Test
    public void handleDelete() {
        //given
        Request deleteRequest = new Request("Malvina. Natal Opa,paragraf/me", RequestType.DELETE);

        //when
        Handler suitableHandler = handlerLocator.getHandler(deleteRequest.getType());
        suitableHandler.handle(deleteRequest);

        //then
        Assert.assertNotNull(deleteRequest.getPayload(), deleteRequest.getType());
    }

    @Test
    public void testFindAll() {
        //given
        Request deleteRequest = new Request("Malvina. Natal Opa,paragraf/me", RequestType.DELETE);
        Request updateRequest = new Request("128.210.23.244", RequestType.UPDATE);
        Request createRequest = new Request("Hello Lesha", RequestType.CREATE);

        //when
        int expected = 3;

        List<Request> actual = new ArrayList<>();
        actual.add(deleteRequest);
        actual.add(updateRequest);
        actual.add(createRequest);

        //then
        Assert.assertEquals(expected, actual.size());
    }
}
