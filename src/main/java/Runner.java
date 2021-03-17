import handler.Files;
import handler.Handler;
import handler.HandlerLocator;
import request.Request;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Files files = new Files();
        List<Request> requests = new LinkedList<>(files.workingWithFiles());
        HandlerLocator handlerLocator = new HandlerLocator();
        for (Request request : requests) {
            Handler suitableHandler = handlerLocator.getHandler(request.getType());
            suitableHandler.payloadBeforeHandler(request);
            System.out.println("result : " + suitableHandler.handle(request));
        }
    }
}