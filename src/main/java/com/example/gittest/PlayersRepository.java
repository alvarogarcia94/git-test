package com.example.gittest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayersRepository extends JpaRepository<Players, Long> {



}
