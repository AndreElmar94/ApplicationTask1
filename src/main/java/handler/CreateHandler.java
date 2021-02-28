package handler;

import request.Request;

public class CreateHandler implements Handler {

    @Override
    public void payloadBeforeHandler(Request request) {
        System.out.println(" payload: " + request.getPayload());
    }

    @Override
    public String handle(Request request) {
        String payload = request.getPayload();
        return new StringBuffer(payload).reverse().toString();
    }
}