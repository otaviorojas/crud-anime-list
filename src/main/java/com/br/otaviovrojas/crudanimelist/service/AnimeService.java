package com.br.otaviovrojas.crudanimelist.service;

import com.br.otaviovrojas.crudanimelist.dao.repository.AnimeRepository;
import com.br.otaviovrojas.crudanimelist.domain.Anime;
import com.br.otaviovrojas.crudanimelist.dto.mapper.AnimeMapper;
import com.br.otaviovrojas.crudanimelist.dto.request.AnimeRequest;
import com.br.otaviovrojas.crudanimelist.dto.response.AnimeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService {

    private final AnimeRepository animeRepository;

    public List<AnimeResponse> getAnimes() {

        List<Anime> animes = animeRepository.findAll();

        return AnimeMapper.toAnime(animes);
    }

    public void createAnime(AnimeRequest animeRequest) {
        Anime anime = AnimeMapper.fromRequest(animeRequest);
        animeRepository.save(anime);
    }
}
