package com.example.FoodApp.exceptions;


import com.example.FoodApp.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response<?>>handleAllUnkownException(Exception ex){
        Response<?>response= Response.builder()
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message(ex.getMessage())
                .build();
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Response<?>>handlerNotFoundException (NotFoundException ex){

            Response<?>response=Response.builder()
                    .statusCode(HttpStatus.NOT_FOUND.value())
                    .message(ex.getMessage())
                    .build();
            return new ResponseEntity<>(response , HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<Response<?>>handleBadRequestExceptiion(BadRequestException ex){
        Response<?> response= Response.builder()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .message(ex.getMessage())
                .build();

        return new ResponseEntity<>(response , HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(PaymentProcessingException.class)
    public ResponseEntity<Response<?>>handlePaymentProcessionException(PaymentProcessingException ex){
        Response<?>response = Response.builder()
                .statusCode(HttpStatus.BAD_GATEWAY.value())
                .message(ex.getMessage())
                .build();
                return new ResponseEntity<>(response,HttpStatus.BAD_GATEWAY);

    }

    @ExceptionHandler(UnauthorizedAccessException.class)
    public ResponseEntity<Response<?>>handleUnauthorizedAccessException(UnauthorizedAccessException ex){
        Response<?>response =Response.builder()
                .statusCode(HttpStatus.UNAUTHORIZED.value())
                  .message(ex.getMessage())
                .build();
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Response<?>> handleIllegalArgumentException(IllegalArgumentException ex){
        Response<?>response= Response.builder()
                .statusCode(HttpStatus.BAD_GATEWAY.value())
                .message(ex.getMessage())
                .build();
        return new ResponseEntity<>(response , HttpStatus.BAD_REQUEST);


    }


}
