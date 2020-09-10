package com.br.otaviovrojas.crudanimelist.dto.request;

import com.br.otaviovrojas.crudanimelist.domain.AnimeCategory;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Setter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Getter
public class AnimeRequest {

    @NotNull
    String name;

    @NotNull
    AnimeCategory category;

    @NotNull
    Integer episodesTotal;
}
