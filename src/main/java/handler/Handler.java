package handler;

import request.Request;

public abstract class Handler {
    public void payloadBeforeHandler(Request request) {
             System.out.println("payload: "+request.getPayload());
}

    public abstract String handle(Request request);
}