package handler;
import request.Request;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpdateHandler implements Handler {

    @Override
    public void handle(Request request) {
        String payload = request.getPayload();
        Pattern pattern = Pattern.compile("(((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]))$"); // [0-9] -> \\d
        Matcher matcher = pattern.matcher(payload);
        System.out.println("result of updateRequest`s handling (проверить, я вляется ли payload валидным ip adress): " + matcher.find());
        System.out.println();
    }
}