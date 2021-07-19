package net.coding.geekquestionnaire.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/system")
public class SystemController {

  @RequestMapping("/time")
  public ResponseEntity getTime(){
    return ResponseEntity.ok(System.currentTimeMillis());
  }
}
