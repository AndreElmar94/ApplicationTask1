package handler;

import request.Request;
import request.RequestType;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileNameFilter {
    public void getAllFiles() {
        String dir = "src/main/java/resources/text";
        String ext = ".txt";
        findFiles(dir, ext);
    }

    public void findFiles(String dir, String ext) {
        File file = new File(dir);
        if (!file.exists()) {
            System.out.println(dir + " папка не найдена");
        } else {
            File[] listFiles = file.listFiles(new MyFileNameFilter(ext));
            if (listFiles.length == 0) {
                System.out.println(dir + " не содержит файлов с расширением " + ext);
            } else {
                for (File f : listFiles) {
                    System.out.println("Файл: " + dir + File.separator + f.getName());
                }
            }
        }
    }


//    public List<Request> listRequestsFromFiles() {
//        File fileForPayloadDelete = new File("src/main/resources/text/deleteRequest.txt");
//        File fileForPayloadUpdate = new File("src/main/resources/text/updateRequest.txt");
//        File fileForPayloadCreate = new File("src/main/resources/text/createRequest.txt");
//        FileReader fileReader;
//        BufferedReader bf;
//        Request deleteRequest = null;
//        Request updateRequest = null;
//        Request createRequest = null;
//
//        List<File> files = List.of(fileForPayloadDelete, fileForPayloadUpdate, fileForPayloadCreate);
//        for (File file : files) {
//            try {
//                fileReader = new FileReader(file);
//                bf = new BufferedReader(fileReader);
//                String line;
//                while ((line = bf.readLine()) != null) {
//                    if (file.equals(fileForPayloadDelete)) {
//                        deleteRequest = new Request(line, RequestType.DELETE);
//                    }
//                    if (file.equals(fileForPayloadUpdate)) {
//                        updateRequest = new Request(line, RequestType.UPDATE);
//                    } else {
//                        createRequest = new Request(line, RequestType.CREATE);
//                    }
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return List.of(deleteRequest, updateRequest, createRequest);
//    }
}