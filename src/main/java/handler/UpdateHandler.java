package handler;

import request.Request;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpdateHandler extends Handler {

    @Override
    public String handle(Request request) {
        String payload = request.getPayload();
        Pattern pattern = Pattern.compile("(((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]))$");
        Matcher matcher = pattern.matcher(payload);
        return String.valueOf(matcher.find());
    }
}