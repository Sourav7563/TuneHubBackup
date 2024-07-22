package com.kodnest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.entity.Song;

public interface SongRepository extends JpaRepository<Song, Integer>{

	Song findByName(String name);

}
