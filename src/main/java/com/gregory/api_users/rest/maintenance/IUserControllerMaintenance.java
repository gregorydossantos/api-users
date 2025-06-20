package com.gregory.api_users.rest.maintenance;

import com.fiap.gregory.hackathon.rest.dto.request.UserRequest;
import com.fiap.gregory.hackathon.rest.dto.response.UserResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public interface IUserControllerMaintenance {

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    ResponseEntity<Void> createUser(@Valid @RequestBody UserRequest request);

    @PostMapping(path = "/{id}", consumes = APPLICATION_JSON_VALUE)
    ResponseEntity<UserResponse> updateUser(@PathVariable("id") Long id, @RequestBody @Valid UserRequest request);

    @DeleteMapping(path = "/{id}", consumes = APPLICATION_JSON_VALUE)
    ResponseEntity<Void> deleteUser(@PathVariable("id") Long id);

}
