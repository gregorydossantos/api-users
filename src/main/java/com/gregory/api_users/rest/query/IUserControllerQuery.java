package com.gregory.api_users.rest.query;

import com.fiap.gregory.hackathon.rest.dto.response.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public interface IUserControllerQuery {

    @GetMapping(consumes = APPLICATION_JSON_VALUE)
    ResponseEntity<List<UserResponse>> getUsers(@RequestParam(value = "page", defaultValue = "0") int page,
                                                @RequestParam(value = "size", defaultValue = "10") int size);

}
