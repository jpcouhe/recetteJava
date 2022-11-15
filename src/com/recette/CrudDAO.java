package com.recette;

import java.util.List;
import java.util.Optional;

public interface CrudDAO<E> {
    List<E> findAll();
    Optional<E> findById(int id);
    List<E> findByKeyword(String keyword);
    E create(E element);

}
