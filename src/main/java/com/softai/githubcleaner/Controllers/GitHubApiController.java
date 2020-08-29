package com.softai.githubcleaner.Controllers;

import com.softai.githubcleaner.Service.GitHubService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Controller
@RestController
public class GitHubApiController {
    @Autowired
    GitHubService service = new GitHubService();

    @GetMapping(value = "/api/{username}/repos", produces = MediaType.APPLICATION_JSON_VALUE)
    JSONObject getRepos(@PathVariable String username) throws IOException {

        return new JSONObject(service.getRepos(username));
    }
}
