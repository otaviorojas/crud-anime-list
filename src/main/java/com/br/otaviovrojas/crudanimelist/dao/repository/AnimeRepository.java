package com.br.otaviovrojas.crudanimelist.dao.repository;


import com.br.otaviovrojas.crudanimelist.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long> {
}
