package handler;

import request.Request;

public class CreateHandler implements Handler {

    @Override
    public String handle(Request request) {
        String payload = request.getPayload();
        System.out.println("\n createRequest payload: " + payload);
        String result = new StringBuffer(payload).reverse().toString();
        System.out.print("result of createRequest's handling (отобразить payload справа налево) : ");
        System.out.print(result);
        return result;
    }
}