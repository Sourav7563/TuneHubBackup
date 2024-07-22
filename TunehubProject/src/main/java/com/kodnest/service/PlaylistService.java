package com.kodnest.service;

import java.util.List;

import com.kodnest.entity.Playlist;

public interface PlaylistService {

	public void addPlaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylist();

	


}
