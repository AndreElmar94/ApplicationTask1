package handler;

import request.Request;

public class DeleteHandler extends Handler {

    @Override
    public String handle(Request request) {
        String payload = request.getPayload();
        int count = payload.split("\s*[^A-z]\s*|[\s]+").length;
        return Integer.toString(count);
    }
}