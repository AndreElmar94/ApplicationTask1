package handler;

import request.Request;

public interface Handler {
    default void payloadBeforeHandler(Request request) {
        System.out.println(" payload: " + request.getPayload());
    }
    String handle(Request request);
}