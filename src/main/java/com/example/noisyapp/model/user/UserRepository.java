package com.example.noisyapp.model.user;

import com.example.noisyapp.model.song.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface UserRepository extends JpaRepository<Song, Integer> {
}
