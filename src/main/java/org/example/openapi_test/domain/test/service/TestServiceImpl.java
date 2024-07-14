package org.example.openapi_test.domain.test.service;

import lombok.RequiredArgsConstructor;
import org.example.openapi_test.domain.test.dto.TestDto;
import org.example.openapi_test.domain.test.entity.Test;
import org.example.openapi_test.domain.test.repository.TestRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;

    @Override
    public Long saveTest(TestDto testDto) {
        Test save = testRepository.save(
                Test.builder()
                        .name(testDto.getName())
                        .build());
        return save.getId();
    }
}
