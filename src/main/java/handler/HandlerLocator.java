import handler.CreateHandler;
import handler.DeleteHandler;
import handler.Handler;
import handler.UpdateHandler;
import request.RequestType;

public class HandlerLocator {
    public static Handler getHandler(RequestType type) {
        switch (type) {
            case CREATE:
                return new CreateHandler();
            case DELETE:
                return new DeleteHandler();
            case UPDATE:
                return new UpdateHandler();
        }
        return null;
    }
}