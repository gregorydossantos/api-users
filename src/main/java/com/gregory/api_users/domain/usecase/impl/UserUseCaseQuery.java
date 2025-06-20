package com.gregory.api_users.domain.usecase.impl;

import com.gregory.api_users.domain.usecase.IUserUseCaseQuery;

import java.util.List;

public class UserUseCaseQuery implements IUserUseCaseQuery {

    @Override
    public List<UserResponse> getUsers(int page, int size) {
        return List.of();
    }
}
