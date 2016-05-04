package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyBXmau3x99l_PlVGs-WKfc5UfuS82j-Uvs";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bEgiz6P0fZsd1_0-pk2tZLkSJMUd7IQF5S503c2v7sWd3XrSt9gcsfVxA8BPL6dhskzRqhbWsAscLoKPUzaiqrv6wsbt6MGQMJbevIkdSapyhRQuZRwlRy3HMdXhNyneItKEOBA");

        c.createData("Working!!", "Test message");

        return c;
    }
}

