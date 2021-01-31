package handler;
import request.Request;
public class DeleteHandler implements Handler {

    @Override
    public void handle(Request request) {
        String payload = request.getPayload();
        System.out.println("deleteRequest payload: " + payload);

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
        System.out.println("result of deleteRequest`s handling (посчитать колисество слов в payload): " + payload + " = " + count);
        System.out.println();
    }
}