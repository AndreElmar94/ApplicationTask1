package handler;

import request.Request;

public interface Handler {
     void payloadBeforeHandler(Request request);

     String handle(Request request);
}