package dev.joewilson.beans.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import dev.joewilson.beans.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {

  private final PostService postService;
  private final RestTemplate restTemplate;
  
  public PostController(PostService postService, RestTemplate restTemplate) {
    /**
     * This postService is like they're injected as a new object and then you simply able to use it
     */
    this.postService = postService;

    // we also can wired method restTemplate() from WebConfig class
    this.restTemplate = restTemplate;
  }

  @GetMapping
  public String findAll() {
    return postService.findAll();
  }

  @GetMapping("/load")
  public String loadPosts() {
    return "load-posts";
  }

}
