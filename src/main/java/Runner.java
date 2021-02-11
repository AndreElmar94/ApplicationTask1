import handler.Handler;
import handler.HandlerLocator;
import request.Request;
import request.RequestType;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        File fileForPayloadDelete = new File("text/deleteRequest.txt");
        File fileForPayloadUpdate = new File("text/updateRequest.txt");
        File fileForPayloadCreate = new File("text/createRequest.txt");
        FileReader fileReader;
        BufferedReader bf;
        List<Request> requests;
        Request deleteRequest = null;
        Request updateRequest = null;
        Request createRequest = null;

        try {
            fileReader = new FileReader(fileForPayloadDelete);
            bf = new BufferedReader(fileReader);
            String line = null;
            while ((line = bf.readLine()) != null) {
                deleteRequest = new Request(line, RequestType.DELETE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileReader = new FileReader(fileForPayloadUpdate);
            bf = new BufferedReader(fileReader);
            String line = null;
            while ((line = bf.readLine()) != null) {
                updateRequest = new Request(line, RequestType.UPDATE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileReader = new FileReader(fileForPayloadCreate);
            bf = new BufferedReader(fileReader);
            String line = null;
            while ((line = bf.readLine()) != null) {
                createRequest = new Request(line, RequestType.CREATE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        requests = List.of(deleteRequest, updateRequest, createRequest);

        for (Request request : requests) {
            HandlerLocator handlerLocator = new HandlerLocator();
            Handler suitableHandler = handlerLocator.getHandler(request.getType());
            suitableHandler.handle(request);
        }

    }
}