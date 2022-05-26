package LListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LLChallengeMain {
    private static boolean forward = true;
    public static void main(String[] args) {
        boolean quit = false;
        boolean forward = true;
        Scanner scanner = new Scanner(System.in);
        menu();
        String gear = scanner.next();

        ArrayList<Album> Albums = new ArrayList<>();

        Album adele_21 = new Album("21", "Adele");
        adele_21.addSongs("Rumuor has it", 4.4);
        adele_21.addSongs("Turning Tables", 4.2);
        adele_21.addSongs("Rolling in the Deep", 5.0);
        adele_21.addSongs("Set Fire To The Rain", 4.8);
        adele_21.addSongs("He Won't Go", 3.5);
        adele_21.addSongs("One and Only", 5.9);

        Album rebel = new Album("Rebel", "Lecrae");
        rebel.addSongs("Rebel Intro", 3.5);
        rebel.addSongs("Go Hard", 4.54);
        rebel.addSongs("Don't Waste Your Life", 5.5);
        rebel.addSongs("Truth", 4.8);
        rebel.addSongs("Desperate", 5.5);
        rebel.addSongs("Got Paper", 4.2);

        Albums.add(adele_21);
        Albums.add(rebel);

        LinkedList<Song> myPlaylist = new LinkedList<>();
        rebel.addToPlaylist("Rebel Intro", myPlaylist);
        rebel.addToPlaylist("Turning Tables", myPlaylist); //Does not exist
        rebel.addToPlaylist("Got Paper", myPlaylist);
        adele_21.addToPlaylist("He Won't Go", myPlaylist);
        rebel.addToPlaylist("Don't Waste Your Life", myPlaylist);
        adele_21.addToPlaylist(1,myPlaylist);
        Albums.get(1).addToPlaylist(22, myPlaylist); //Does not exist

        ListIterator<Song> e = myPlaylist.listIterator();

        while(!quit){
    switch(gear){
        case "n":
            System.out.println("Playing next song");
//            System.out.println("--------------------");
//            if(player.hasNext()){
//               String s = player.next().toString();
//                System.out.println("Playing :" + s);
//            }
            nextSong(myPlaylist, e);
            break;
        case "b":
            System.out.println("Skipping backwards to previous song");
            playPrevious(myPlaylist, e);
            break;
        case "p":
            System.out.println("playing current song in the playlist (unimplemented)");
//            play(myPlaylist, e);
            break;
        case "r":
            System.out.println("Replaying the current song");
            break;
        case "l":
            System.out.println("Listing songs in the playlist");
            songsInPlaylist(myPlaylist);
            break;
        case "q":
            System.out.println("Quitting current playlist");
            quit = true;
            break;
        case "d":
            scanner.nextLine();
            System.out.println("Removing current song from the playlist");
            System.out.println("Enter the title of the song to be removed from the playlist");
            String title = scanner.nextLine();
            System.out.println(title);
            Song x = findSong(myPlaylist, title);
            removeSong(myPlaylist, x);
            break;
        default:
            System.out.println("Reprinting menu");
            menu();
    }
    gear = scanner.next();
}
    }
    public static void menu(){
        System.out.println("""
                To replay current song, enter (r)
                To play current song, enter (p)
                To play next song, enter (n)
                To play previous song, enter (b)
                To delete current song from the playlist (d)
                To list all songs on this playlist, enter (l):
                To quit, enter (q): \s""");
    }


    public static boolean checker(LinkedList<Song> songsPlaylist){
        if(songsPlaylist.size() == 0){
            System.out.println("No song in playlist");
            return false;
        }
        return true;
    }

    private static Song findSong(LinkedList<Song> songsPlaylist, String title){
        for(Song x: songsPlaylist){
            if(x.getTitle().equals(title)){
                return x;
            }
        }
        return null;
    }

    private static void removeSong(LinkedList<Song> playlist, Song x){
        if(x != null){
            playlist.remove(x);
        }else{
            System.out.println("No such song exists in the playlist");
        }
    }

    private static void play(LinkedList<Song> songsPlaylist, ListIterator<Song> listIterator){
    }

    private static void nextSong(LinkedList<Song> songsPlaylist, ListIterator<Song> listIterator){
        if(checker(songsPlaylist)){
            //I should have first checked if NOT FORWARD, then set forward first.
            if(forward){
                if(listIterator.hasNext()){
                    String song_e = listIterator.next().toString();
                    System.out.println("Playing " + song_e);
                }
            }else{
                if(listIterator.hasNext()){
                    listIterator.next();
                    forward = true;
                    nextSong(songsPlaylist, listIterator);
                }else{
                    System.out.println("We have reached the end of the playlist");
                    forward = false;
                }
            }
        }
    }

    private static void playPrevious(LinkedList<Song> songsPlaylist, ListIterator<Song> listIterator){
        if(checker(songsPlaylist)){
            if(forward) {
                //that is, it's going forward before now
                if (listIterator.hasPrevious()) {
                    listIterator.previous();
                    forward = false;
                }
            }
            if(listIterator.hasPrevious()){
                    String song_e = listIterator.previous().toString();
                    System.out.println("Playing " + song_e);
                }
                forward = false;
        }
    }

    private static void songsInPlaylist(LinkedList<Song> p){
        for(Song x: p){
            System.out.println(x.toString());
        }
    }
}