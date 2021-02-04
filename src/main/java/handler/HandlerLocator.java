package handler;
import request.RequestType;

public class HandlerLocator {

    public Handler getHandler(RequestType type) {
        switch (type) {
            case CREATE:
                return new CreateHandler();
            case DELETE:
                return new DeleteHandler();
            case UPDATE:
                return new UpdateHandler();
        }
        return getHandler(type);
    }
}