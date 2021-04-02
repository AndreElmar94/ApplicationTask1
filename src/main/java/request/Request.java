package request;

public class Request {

    private String payload;
    private RequestType type;

    public Request(String payload, RequestType type) {
        this.payload = payload;
        this.type = type;
    }
    public String getPayload() {
        return payload;
    }
    public RequestType getType() {
        return type;
    }
}