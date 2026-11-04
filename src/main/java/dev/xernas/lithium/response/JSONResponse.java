package dev.xernas.lithium.response;

import dev.xernas.lithium.io.http.Status;
import dev.xernas.lithium.io.headers.ContentType;
import dev.xernas.lithium.io.headers.Header;

import java.util.List;

public class JSONResponse implements Response {

    private final String body;
    private final Status status;

    public JSONResponse(String body, Status status) {
        this.body = body;
        this.status = status;
    }

    @Override
    public ContentType getContentType() {
        return ContentType.APPLICATION_JSON;
    }

    @Override
    public List<Header> getHeaders() {
        return List.of();
    }

    @Override
    public byte[] getBody() {
        return body.getBytes(ContentType.APPLICATION_JSON.getCharset());
    }

    @Override
    public Status getStatus() {
        return status;
    }
}
