package dev.daniel.apibasica.web;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;
import java.time.OffsetDateTime;



@RestController
public class HealthController {

    private final org.springframework.jdbc.core.JdbcTemplate jdbc;


    @GetMapping("/health")
    public Map<String, Object> health() {
        return Map.of("status", "UP");
    }

    @GetMapping("/hello")
    public Map<String, Object> hello(@RequestParam(defaultValue = "Daniel") String name) {
        return Map.of(
                "message", "Hello, " + name + "!",
                "timestamp", OffsetDateTime.now().toString()
        );
    }

    public HealthController(org.springframework.jdbc.core.JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @org.springframework.web.bind.annotation.GetMapping("/dbping")
    public java.util.Map<String, Object> dbping() {
        Integer one = jdbc.queryForObject("SELECT 1", Integer.class);
        return java.util.Map.of(
                "db", (one != null && one == 1) ? "OK" : "FAIL"
        );
    }
}
