package com.softai.githubcleaner.Service;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GitHubService {
    OkHttpClient client;

    public GitHubService() {
        this.client = new OkHttpClient();
    }

    public String getRepos(String username) throws IOException {

        Request request = new Request.Builder()
                .url("https://api.github.com/users/" +username + "/repos/1")
                .addHeader("Authorization", "token 3cc56689ff1e9d21b115725cca1d9d4fe7d74080")
                .build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(response.body().string());
            return response.body().string();
        } finally {

            System.out.println("Getting list of repository for user " + username);
        }
    }
}
