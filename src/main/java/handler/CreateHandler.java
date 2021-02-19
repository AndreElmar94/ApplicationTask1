package handler;

import request.Request;

public class CreateHandler implements Handler {

    @Override
    public String handle(Request request) {
        String payload = request.getPayload();
        String result = new StringBuffer(payload).reverse().toString();
//        System.out.print(result);
        return result;
    }
}