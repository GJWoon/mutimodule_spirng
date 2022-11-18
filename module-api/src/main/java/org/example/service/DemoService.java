package org.example.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final CommonService commonService;


    public String getCommonService() {

         return commonService.common();

    }
}

