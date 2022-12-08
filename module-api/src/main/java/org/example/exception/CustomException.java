package org.example.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.enums.CodeEnum;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CustomException extends RuntimeException{

    private String returnCode;
    private String returnMessage;

    public CustomException(CodeEnum codeEnum){
        super(codeEnum.getMessage());
        this.returnCode = codeEnum.getCode();
        this.returnMessage = codeEnum.getMessage();
    }

}
