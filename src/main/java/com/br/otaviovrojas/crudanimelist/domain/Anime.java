package com.br.otaviovrojas.crudanimelist.domain;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Builder
public class Anime {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    private Long id;

    @Column
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    private AnimeCategory category;

    @Column
    private Integer episodesTotal;


}
