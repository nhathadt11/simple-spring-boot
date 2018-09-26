package sample.cloud.simplespringboot.repository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.AbstractMap;

@RestController
@RequestMapping("/api/env")
public class EnvController {

  @GetMapping
  public ResponseEntity<AbstractMap.SimpleEntry<String, String>> getEnv(@RequestParam("q") String env) {
    return ResponseEntity.ok(
        new AbstractMap.SimpleEntry<>(env, System.getenv(env))
    );
  }
}
