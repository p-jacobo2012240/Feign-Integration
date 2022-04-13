package com.hackobo.client.management.application.repositories.repositories;

import java.util.Optional;

public interface BaseRepository<T, V>  {

    <S extends T> S save(S s);

    Optional<T> findById(V id);

    Iterable<T> findAll();

    void deleteById(V id);
}
