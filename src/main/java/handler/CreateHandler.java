package handler;

import request.Request;

public class CreateHandler implements Handler {

    @Override
    public void handle(Request request) {
        String payload = request.getPayload();
        String result = new StringBuffer(payload).reverse().toString();
        System.out.println("result of createRequest's handling (отобразить payload справа налево) : " + result);
        System.out.println();
    }
}