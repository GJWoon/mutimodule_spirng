package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.enums.CodeEnum;
import org.example.exception.CustomException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final CommonService commonService;


    public String getCommonService() {

         return commonService.common();

    }

    public String exception(){

        if(true){
            throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        }
        return "excpetion";
    }
}

