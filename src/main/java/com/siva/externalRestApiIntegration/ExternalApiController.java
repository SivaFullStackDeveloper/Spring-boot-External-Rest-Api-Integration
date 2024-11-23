package com.siva.externalRestApiIntegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ExternalApiController{
    @Autowired
    private  RestTemplate restTemplate;

    @Scheduled(fixedRate = 10000)
    public  void getApi(){
        String url = "https://jsonplaceholder.typicode.com/posts";
        String result = restTemplate.getForObject(url,String.class);
        System.out.println(result);
    }
    @Scheduled(fixedRate = 10000)
    public void postDataToApi() {
        String url = "https://jsonplaceholder.typicode.com/posts";

        Post post = new Post();
        post.setId(1);
        post.setTitle("My Title");
        post.setBody("This is a post body");

        // Send the request
        Post response = restTemplate.postForObject(url, post, Post.class);

        // Print response
        System.out.println("Response: " + response.getTitle());
    }
    public static void updateApi(){}

    public static void deleteApi(){}
}


class Post{
    int id;

    String title;
    String body;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
