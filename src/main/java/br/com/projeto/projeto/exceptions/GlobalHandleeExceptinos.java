package br.com.projeto.projeto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
@ControllerAdvice
public class GlobalHandleeExceptinos extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomExceptions.class)
    public ResponseEntity<RecordExceptions> handleNotFund(CustomExceptions ex , WebRequest request){

        RecordExceptions response = new RecordExceptions(
             new Date(),
                ex.getMessage(),
                request.getDescription(false)
        );
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}
