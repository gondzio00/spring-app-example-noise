package com.example.noisyapp.model.song;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SongRepository extends JpaRepository<Song, Integer> {
//    List<Song> findAllUserSongs(User user);
}
