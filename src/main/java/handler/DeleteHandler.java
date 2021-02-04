package handler;

import request.Request;

public class DeleteHandler implements Handler {

    @Override
    public String handle(Request request) {
        String payload = request.getPayload();
        System.out.println("\n deleteRequest payload: " + payload);

        int count = 0;
        count++;
        for (int i = 0; i < payload.length(); i++) {
            if (payload.charAt(i) == ' ') {
                count++;
            }
            if (payload.charAt(i) == '/') {
                count++;
            }
            if (payload.charAt(i) == ':') {
                count++;
            }
            if (payload.charAt(i) == '.') {
                count++;
            }
        }
        String result = Integer.toString(count);
        System.out.print("result of deleteRequest`s handling (посчитать колисество слов в payload): " + payload + " = ");
        System.out.println(result);

        return result;
    }
}