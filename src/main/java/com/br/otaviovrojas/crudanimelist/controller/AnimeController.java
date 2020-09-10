package com.br.otaviovrojas.crudanimelist.controller;

import com.br.otaviovrojas.crudanimelist.dto.request.AnimeRequest;
import com.br.otaviovrojas.crudanimelist.dto.response.AnimeResponse;
import com.br.otaviovrojas.crudanimelist.service.AnimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/animes")
@RequiredArgsConstructor
public class AnimeController {

    private final AnimeService animeService;

    @GetMapping
    private ResponseEntity<List<AnimeResponse>> getAnimes() {
        List<AnimeResponse> students = animeService.getAnimes();

        return ResponseEntity.status(HttpStatus.OK).body(students);
    }

    @PostMapping
    private ResponseEntity<?> createAnime(@Valid @RequestBody AnimeRequest animeRequest) {
        animeService.createAnime(animeRequest);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
