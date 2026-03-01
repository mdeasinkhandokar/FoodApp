package com.example.FoodApp.payment.dtos;

import com.example.FoodApp.auth_users.dtos.UserDTO;
import com.example.FoodApp.enums.PaymentGateway;
import com.example.FoodApp.enums.PaymentStatus;
import com.example.FoodApp.order.dtos.OrderDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDTO {

    private Long id;

    private Long orderId;

    private BigDecimal amount;

    private PaymentStatus paymentStatus;

    private String transactionId;

    private PaymentGateway paymentGateway;

    private String failureReason;

    private  boolean success;

    private LocalDateTime paymentDate;

    private OrderDTO order;

    private UserDTO user;







}
