package Basics;

import java.io.IOException;

import com.fasterxml.jackson.databind.util.JSONPObject;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Demo {
    private static final String API_URL = "https://api.pushbullet.com/v2/pushes";
    private static final String ACCESS_TOKEN = "access token of the pushbullet website ";

    public static void main(String[] args) {
        // String BASE_URL = "https://api.notion.com/v1/";
        // String TOKEN = "token of the user from notion "
        // Example: Fetch a page
        // String pageId = "178da782c9e5806a8917cd45db2fc3c6";
        String json = """
                    {
                      "type": "note",
                      "title": "Hello from Pushbullet",
                      "body": "This is a test notification sent via Java!"
                    }
                """;
        RequestBody body = RequestBody.create(json, MediaType.get("application/json"));
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(API_URL)
                .post(body)
                .addHeader("Access-Token", ACCESS_TOKEN)
                .addHeader("Content-Type", "application/json")
                .build();

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(2000);
                Response response = client.newCall(request).execute();
                if (response.isSuccessful()) {

                    System.out.println(response.body().string());
                } else {
                    System.err.println("Request failed: " + response.code());
                }
            }
        } catch (IOException exception) {
            System.out.println(exception);
        }catch(InterruptedException exception){
            System.out.println(exception);
        }

    }

}
