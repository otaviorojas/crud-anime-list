package com.br.otaviovrojas.crudanimelist.dto.mapper;

import com.br.otaviovrojas.crudanimelist.domain.Anime;
import com.br.otaviovrojas.crudanimelist.dto.request.AnimeRequest;
import com.br.otaviovrojas.crudanimelist.dto.response.AnimeResponse;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AnimeMapper {

    public static AnimeResponse toStudent(Anime anime) {
        AnimeResponse animeResponse = new AnimeResponse();

        if (Objects.isNull(anime)) {
            return null;
        }

        animeResponse.setName(anime.getName());
        animeResponse.setCategory(anime.getCategory().toString());
        animeResponse.setEpisodesTotal(anime.getEpisodesTotal());


        return animeResponse;
    }

    public static List<AnimeResponse> toAnime(List<Anime> animes) {
        return animes.stream().map((Anime anime) -> AnimeMapper.toStudent(anime)).collect(Collectors.toList());
    }

    public static Anime fromRequest(AnimeRequest animeRequest) {
        return Anime.builder()
                .name(animeRequest.getName())
                .category(animeRequest.getCategory())
                .episodesTotal(animeRequest.getEpisodesTotal())
                .build();
    }
}
