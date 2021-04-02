import workingWithFiles.FileNameFilter;
import handler.Handler;
import handler.HandlerLocator;
import request.Request;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        FileNameFilter fileNameFilter = new FileNameFilter();
        List<Request> requests = fileNameFilter.findRequestFromFiles("src/main/resources/text", ".txt");

        HandlerLocator handlerLocator = new HandlerLocator();
        for (Request request : requests) {
            Handler suitableHandler = handlerLocator.getHandler(request.getType());
            suitableHandler.payloadBeforeHandler(request);
            System.out.println("result : " + suitableHandler.handle(request));
        }
    }
}