package handler;
import request.RequestType;

public class HandlerLocator {

    public Handler getHandler(RequestType type) {
        return switch (type) {
            case CREATE -> new CreateHandler();
            case DELETE -> new DeleteHandler();
            case UPDATE -> new UpdateHandler();
        };
    }
}