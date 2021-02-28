import handler.Handler;
import handler.HandlerLocator;
import request.Request;
import request.RequestType;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        File fileForPayloadDelete = new File("src/main/resources/text/deleteRequest.txt");
        File fileForPayloadUpdate = new File("src/main/resources/text/updateRequest.txt");
        File fileForPayloadCreate = new File("src/main/resources/text/createRequest.txt");
        FileReader fileReader;
        BufferedReader bf;
        List<Request> requests;
        Request deleteRequest = null;
        Request updateRequest = null;
        Request createRequest = null;

        List<File> files = List.of(fileForPayloadDelete, fileForPayloadUpdate, fileForPayloadCreate);
        for (File file : files) {
            try {
                fileReader = new FileReader(file);
                bf = new BufferedReader(fileReader);
                String line;
                while ((line = bf.readLine()) != null) {
                    if (file.equals(fileForPayloadDelete)) {
                        deleteRequest = new Request(line, RequestType.DELETE);
                    }
                    if (file.equals(fileForPayloadUpdate)) {
                        updateRequest = new Request(line, RequestType.UPDATE);
                    } else {
                        createRequest = new Request(line, RequestType.CREATE);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        requests = List.of(deleteRequest, updateRequest, createRequest);
        HandlerLocator handlerLocator = new HandlerLocator();

        for (Request request : requests) {
            Handler suitableHandler = handlerLocator.getHandler(request.getType());
            suitableHandler.payloadBeforeHandler(request);
            System.out.println("result : " + suitableHandler.handle(request));
        }
    }
}