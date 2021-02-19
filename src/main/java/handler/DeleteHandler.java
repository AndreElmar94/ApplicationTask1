package handler;

import request.Request;

public class DeleteHandler implements Handler {

    @Override
    public String handle(Request request) {
        String payload = request.getPayload();

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

        return result;
    }
}