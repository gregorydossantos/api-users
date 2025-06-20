package com.gregory.api_users.rest.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import static com.fiap.gregory.hackathon.domain.message.CommonsMessage.FIELD_MANDATORY;
import static com.fiap.gregory.hackathon.domain.message.UserMessage.EMAIL_INVALID;
import static com.fiap.gregory.hackathon.domain.message.UserMessage.EXCHANGE_SIZE;
import static com.fiap.gregory.hackathon.domain.message.UserMessage.NAME_SIZE;

@Data
@Builder
public class UserRequest {

    @NotNull(message = FIELD_MANDATORY)
    @NotEmpty(message = FIELD_MANDATORY)
    @Size(max = 10, message = NAME_SIZE)
    private String name;

    @NotNull(message = FIELD_MANDATORY)
    @NotEmpty(message = FIELD_MANDATORY)
    @Email(message = EMAIL_INVALID)
    private String email;

    @NotNull(message = FIELD_MANDATORY)
    @NotEmpty(message = FIELD_MANDATORY)
    private String password;

    @NotNull(message = FIELD_MANDATORY)
    @NotEmpty(message = FIELD_MANDATORY)
    @Size(max = 10, message = EXCHANGE_SIZE)
    private String exchange;

}
