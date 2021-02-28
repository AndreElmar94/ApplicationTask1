//package handler;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import request.RequestType;
//
//public class HandlerLocatorTest {
//    HandlerLocator handlerLocator;
//
//    @BeforeEach
//    public void initHandlerLocator() {
//        handlerLocator = new HandlerLocator();
//    }
//
//    @Test
//    public void testGetHandler() {
//        Handler actual1 = handlerLocator.getHandler(RequestType.DELETE);
//        Handler actual2 = handlerLocator.getHandler(RequestType.UPDATE);
//        Handler actual3 = handlerLocator.getHandler(RequestType.CREATE);
//
//        Assertions.assertEquals(new DeleteHandler(), actual1);
//        Assertions.assertEquals(new UpdateHandler(), actual2);
//        Assertions.assertEquals(new CreateHandler(), actual3);
//    }
//}