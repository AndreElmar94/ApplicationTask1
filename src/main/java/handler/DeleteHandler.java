package handler;

import request.Request;

public class DeleteHandler implements Handler {

    @Override
    public void payloadBeforeHandler(Request request) {
        System.out.println(" payload: " + request.getPayload());
    }

    @Override
    public String handle(Request request) {
        String payload = request.getPayload();
        int count = payload.split("\s*[^A-z]\s*|[\s]+").length;
        return Integer.toString(count);
    }
}