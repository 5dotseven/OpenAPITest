package org.example.openapi_test.domain.test.service;

import org.example.openapi_test.domain.test.dto.TestDto;

public interface TestService {
    Long saveTest(TestDto testDto);
}
