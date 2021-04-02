package workingWithFiles;

import request.Request;
import request.RequestType;

import java.io.*;
import java.util.List;

public class FileNameFilter {
    public List<Request> findRequestFromFiles(String dir, String ext) {
        File file = new File(dir);
        File[] listFiles = file.listFiles(new MyFileNameFilter(ext));
        File[] files = listFiles;
        FileReader fileReader;
        BufferedReader bf;
        Request deleteRequest = null;
        Request updateRequest = null;
        Request createRequest = null;
        List<Request> requests;

        for (File f : files) {
            try {
                fileReader = new FileReader(f);
                bf = new BufferedReader(fileReader);
                String line;
                while ((line = bf.readLine()) != null) {
                    if (f.getName().equals("txtForDelete.txt")) {
                        deleteRequest = new Request(line, RequestType.DELETE);
                    }
                    if (f.getName().equals("txtForUpdate.txt")) {
                        updateRequest = new Request(line, RequestType.UPDATE);
                    }
                    if (f.getName().equals("txtForCreate.txt")) {
                        createRequest = new Request(line, RequestType.CREATE);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        requests = List.of(deleteRequest, updateRequest, createRequest);
        return requests;
    }
}