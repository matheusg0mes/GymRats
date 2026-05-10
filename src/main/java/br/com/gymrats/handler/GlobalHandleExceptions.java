package br.com.gymrats.handler;

import br.com.gymrats.exceptions.CustomExceptions;
import br.com.gymrats.exceptions.RecordExceptions;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalHandleExceptions extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomExceptions.class)
    public ResponseEntity<RecordExceptions> handleNotFund(CustomExceptions ex, WebRequest request) {
        RecordExceptions response = new RecordExceptions(
                new Date(),
                ex.getMessage(),
                request.getDescription(false)
        );
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatusCode status,
            WebRequest request) {

        Map<String, String> erros = new HashMap<>();
        ex.getBindingResult()
                .getFieldErrors()
                .forEach(erro -> erros.put(erro.getField(), erro.getDefaultMessage()));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erros);
    }

    }


