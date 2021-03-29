package handler;

import request.Request;

public class CreateHandler extends Handler {

    @Override
    public String handle(Request request) {
        String payload = request.getPayload();
        return new StringBuffer(payload).reverse().toString();
    }
}