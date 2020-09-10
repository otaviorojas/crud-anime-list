package com.br.otaviovrojas.crudanimelist.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@EqualsAndHashCode
public class AnimeResponse {

    @NonNull
    String name;

    @NonNull
    String category;

    @NonNull
    Integer episodesTotal;
}
