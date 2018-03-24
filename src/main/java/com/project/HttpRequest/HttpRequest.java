package com.project.HttpRequest;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HttpRequest {
    OkHttpClient client = new OkHttpClient();

    String getRequest(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public String getAnswer(String url){
        String answer = "Error";
        try {
            answer = getRequest("http://api.etherscan.io/api?module=account&action=txlist&address=0xbeef281b81d383336aca8b2b067a526227638087&sort=asc");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return answer;
    }

}
