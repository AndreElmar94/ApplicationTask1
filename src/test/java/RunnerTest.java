import handler.Handler;
import handler.HandlerLocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import request.Request;
import request.RequestType;

public class RunnerTest {

    private HandlerLocator handlerLocator;
    private Request deleteRequest;
    private Request updateRequest;
    private Request createRequest;

    @BeforeEach
    public void initialRunnerTest() {
        handlerLocator = new HandlerLocator();
        deleteRequest = new Request("Hello world", RequestType.DELETE);
        updateRequest = new Request("128.110.102.112", RequestType.UPDATE);
        createRequest = new Request("Hello world", RequestType.CREATE);
    }

    @Test
    public void testHandlerListRequests() {
        Handler suitableHandlerDelete = handlerLocator.getHandler(deleteRequest.getType());
        Handler suitableHandlerUpdate = handlerLocator.getHandler(updateRequest.getType());
        Handler suitableHandlerCreate = handlerLocator.getHandler(createRequest.getType());

        String actualDelete = suitableHandlerDelete.handle(deleteRequest);
        String actualUpdate = suitableHandlerUpdate.handle(updateRequest);
        String actualCreate = suitableHandlerCreate.handle(createRequest);

        String expectedDelete = "2";
        String expectedUpdate = String.valueOf(true);
        String expectedCreate = "dlrow olleH";

        Assertions.assertNotNull(deleteRequest);
        Assertions.assertNotNull(updateRequest);
        Assertions.assertNotNull(createRequest);
        Assertions.assertEquals(actualDelete, expectedDelete);
        Assertions.assertEquals(actualUpdate, expectedUpdate);
        Assertions.assertEquals(actualCreate, expectedCreate);
    }
}