package LListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private ArrayList<Song> songs; //songs in the album
    private LinkedList<Song> playlist; //songs in the playlist
    private String artist;
    private String albumTitle;

    public Album(String albumTitle, String artist) {
        this.songs = new ArrayList<>();
        this.artist = artist;
        this.albumTitle = albumTitle;
        this.playlist = new LinkedList<>();
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public boolean addSongs(String songTitle, double songDuration){
        Song song = new Song(songTitle,songDuration);
        if(findSong(song) == null){
            songs.add(song);
            return true;
        }
        System.out.println("Song titled " + songTitle + " already contained in album, " + this.albumTitle);
        return false;
    }

    private Song findSong(Song x){
        for(int i=0; i<this.songs.size(); i++){
            if(this.songs.get(i).equals(x)){
                return x;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber -1;
        if(index>=0 && index<=this.songs.size()){
            playlist.add(index, this.songs.get(index));
            return true;
        }
        System.out.println("This track number "+ trackNumber + " does not exist in an album");
        System.out.println("Not adding it to " + getPlaylist().toString());
        System.out.println("============");
        return false;
    }

    public boolean addToPlaylist(String songTitle, LinkedList<Song> playlist){
        Song e = new Song(songTitle);
        if(findSong(e)==null){
            playlist.add(e);
            return true;
        }else{
            System.out.println("The song " + songTitle + " is not in the album " + this.albumTitle);
            return false;
        }
    }
}
