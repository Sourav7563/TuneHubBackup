package com.kodnest.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.entity.Playlist;
import com.kodnest.repository.PlaylistRepository;
import com.kodnest.service.PlaylistService;

@Service
public class PlaylistServiceImpl implements PlaylistService {
	
	@Autowired
	PlaylistRepository playlistRepository;

	@Override
	public void addPlaylist(Playlist playlist) {
		
		Playlist exisPlaylist = playlistRepository.findByName(playlist.getName());
		
		if(exisPlaylist==null) {
			
			playlistRepository.save(playlist);
		}
		else {
			System.out.println("Playlist already exists");
		}
		
	}

	

	@Override
	public List<Playlist> fetchAllPlaylist() {
		List<Playlist> list = playlistRepository.findAll();
		return list;
	}


}
