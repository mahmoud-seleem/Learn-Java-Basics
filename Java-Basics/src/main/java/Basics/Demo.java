package Basics;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Demo {
    public static void main(String[] args) {
        String BASE_URL = "https://api.notion.com/v1/";
        String TOKEN = "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";
        OkHttpClient client = new OkHttpClient();
        // Example: Fetch a page
        String pageId = "178da782c9e5806a8917cd45db2fc3c6";
        Request request = new Request.Builder()
                .url(BASE_URL + "users")
                .addHeader("Authorization", "Bearer " + TOKEN)
                .addHeader("Notion-Version", "2022-06-28")
                .build();

        try{
            Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            System.out.println(response.body().string());
        } else {
            System.err.println("Request failed: " + response.code());
        }
        }catch(IOException exception){
            System.out.println(exception);
        }             
        
    }

}
