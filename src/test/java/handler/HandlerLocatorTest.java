package handler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import request.RequestType;

public class HandlerLocatorTest {
    HandlerLocator handlerLocator;

    @BeforeEach
    public void initHandlerLocator() {
        handlerLocator = new HandlerLocator();
    }

    @Test
    public void testGetHandler() {
        Handler actualDelete = handlerLocator.getHandler(RequestType.DELETE);
        Handler actualUpdate = handlerLocator.getHandler(RequestType.UPDATE);
        Handler actualCreate = handlerLocator.getHandler(RequestType.CREATE);

        Assertions.assertEquals(new DeleteHandler(), actualDelete);
        Assertions.assertEquals(new UpdateHandler(), actualUpdate);
        Assertions.assertEquals(new CreateHandler(), actualCreate);
        
        //одбавить тип какой-то левый, если на вход поступит, то надо иключеник выкинуть!
    }
}