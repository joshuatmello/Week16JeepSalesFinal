package com.promineotech.jeep.controller.support;

//Assignment 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import lombok.Getter;

//Here is where we get the random port, putting it in here to be used by all test classes
public class BaseTest {
  @LocalServerPort
  private int serverPort;
  
  //TestRestTemplate sends the HTTP requests within the application
  //So you don't have to add it from a web browser
    @Autowired
  @Getter
    private TestRestTemplate restTemplate;
  
  public TestRestTemplate getRestTemplate() {
    return restTemplate;
  }

//Gets the URI, returns it as a string
  protected String getBaseUri() {
    
    //this is the test we are running in the background
    return String.format("http://localhost:%d/jeeps", serverPort);
  }
  
}
