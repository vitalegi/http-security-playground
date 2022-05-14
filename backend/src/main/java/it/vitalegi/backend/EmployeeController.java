package it.vitalegi.backend;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:20001")
class EmployeeController {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/employees")
    List<String> all() {
        log.info("get employees");
        return Arrays.asList("aaa", "bbbb");
    }

    @PostMapping("/employees")
    String newEmployee(@RequestParam String name) {
        log.info("post employee {}", name);
        return name;
    }
}
