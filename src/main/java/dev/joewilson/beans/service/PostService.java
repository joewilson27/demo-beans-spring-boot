package dev.joewilson.beans.service;

import org.springframework.stereotype.Component;

/**
 * with this @Component annotation, this class is autowired on controller when it uses inside constructor methods as parameter
 */
@Component
public class PostService {
  
  public String findAll() {
    return "All Posts";
  }

}
