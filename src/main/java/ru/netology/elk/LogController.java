package ru.netology.elk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private static final Logger log = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    public String writeLog(@RequestParam(defaultValue = "default message") String message) {
        log.info("Target action triggered: {}", message);
        log.warn("Warning from target action: {}", message);
        return "Log written: " + message;
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}