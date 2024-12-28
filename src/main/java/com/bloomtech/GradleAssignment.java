package com.bloomtech;

import java.io.IOException;

public class GradleAssignment {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    Request request = new Request.Builder().url("https://jsonplaceholder.typicode.com/posts/2").build();

        try {
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().toString());
    } catch (
    IOException exception){
        exception.printStackTrace();
    }

}
