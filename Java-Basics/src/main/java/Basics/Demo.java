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
    private static final String ACCESS_TOKEN = "o.6rpNQM4TMIbpnEXg3YtiVTpkayqD3Hs4";

    public static void main(String[] args) {

        String BASE_URL = "https://api.notion.com/v1";
        String TOKEN = "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";
        // Example: Fetch a page
        String pageId = "178da782c9e580219820de155cbef5f2";
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

        Request getNotionNoteRequest = new Request.Builder()
                .url(BASE_URL + "/blocks/" + pageId + "/children")
                .addHeader("Authorization", "Bearer " + TOKEN)
                .addHeader("Notion-Version", "2022-06-28")
                .build();
        try {
                Response response = client.newCall(getNotionNoteRequest).execute();
                if (response.isSuccessful()) {
                                    
                } else {
                    System.err.println("Request failed: " + response.code());
                }
            
        } catch (IOException exception) {
            System.out.println(exception);
        }
    }

}
