import handler.Handler;
import handler.HandlerLocator;
import request.Request;
import request.RequestType;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Request deleteRequest = new Request("Malvina. Natal Opa,paragraf/me", RequestType.DELETE);
        Request updateRequest = new Request("128.210.23.244", RequestType.UPDATE);
        Request createRequest = new Request("Hello Lesha", RequestType.CREATE);

        List<Request> requests = List.of(deleteRequest, updateRequest, createRequest);

        for (Request request : requests) {
            HandlerLocator handlerLocator = new HandlerLocator();
            Handler suitableHandler = handlerLocator.getHandler(request.getType());
            suitableHandler.handle(request);
        }
    }
}