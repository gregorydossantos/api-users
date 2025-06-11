package com.gregory.api_users.infra.db.repositories;

import com.gregory.api_users.infra.db.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IUserRepository extends JpaRepository<User, UUID>, PagingAndSortingRepository<User, UUID> {

    Optional<User> findByEmail(String email);

}
