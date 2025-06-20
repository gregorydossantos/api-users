package com.gregory.api_users.domain.usecase;

import com.fiap.gregory.hackathon.rest.dto.response.UserResponse;

import java.util.List;

public interface IUserUseCaseQuery {

    List<UserResponse> getUsers(int page, int size);

}
