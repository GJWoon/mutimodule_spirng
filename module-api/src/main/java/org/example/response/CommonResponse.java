package org.example.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import org.example.enums.CodeEnum;
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class CommonResponse<T> {

    //통일화된 객체를 만들기 위한 response

    private String returnCode;
    private String returnMessage;
    private T info;

    public CommonResponse(CodeEnum codeEnum, T info) {

        this.returnCode = codeEnum.getCode();
        this.returnMessage = codeEnum.getMessage();
        this.info = info;

    }


    public CommonResponse(T info) {

        this.returnCode = CodeEnum.SUCCESS.getCode();
        this.returnMessage = CodeEnum.SUCCESS.getMessage();
        this.info = info;

    }

    public CommonResponse(String returnCode, String returnMessage) {
        this.returnCode = returnCode;
        this.returnMessage = returnMessage;
    }
}
