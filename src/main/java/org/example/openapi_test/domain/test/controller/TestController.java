package org.example.openapi_test.domain.test.controller;

import lombok.RequiredArgsConstructor;
import org.example.openapi_test.domain.test.dto.TestDto;
import org.example.openapi_test.domain.test.service.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @PostMapping
    public ResponseEntity<Long> saveTest(@RequestBody TestDto testDto) {
        Long test = testService.saveTest(testDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(test);
    }
}
