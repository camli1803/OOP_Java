package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public String getArtist() {
        return artist;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public CompactDisc(String title, String category, int length, String director) {
        super(title, category, length, director);
    }

    public CompactDisc(String title, String category, int length, String director, String artist, ArrayList<Track> tracks) {
        super(title, category, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(String title, String category, int length, String director, String artist) {
        super(title, category, length, director);
        this.artist = artist;
    }

    public boolean checkTrackOfCD(Track track, ArrayList<Track> TrackList) {
        boolean check = false;
        for (Track trackOfCD : TrackList) {
            if (trackOfCD.equals(track)) {
                check = true;
            }
        }
        return check;
    }
    public void addTrack(Track track){
        if (checkTrackOfCD(track, tracks))
            System.out.println("Error: Track này đã được add trước đó!!!");
        else {
            tracks.add(track);
            System.out.println("Thông báo: Đã add track này!");

        }

    }
    public void removeTrack(Track track) {
        if (tracks.size() == 0) {
            System.out.println("Error: CD trống!!!Không thể xóa!!!");
        } else {
            boolean check = false;
            for (int i = 0; i < tracks.size(); i++) {
                if (tracks.get(i).equals(track)) {
                    for (int j = i; j < tracks.size() - 1; j++) {
                        //   itemsOrdered[j] = itemsOrdered[j + 1];
                        tracks.set(j,tracks.get(j+1));
                    }

                    check = true;
                }
            }
            if (check) {
                System.out.println("Thông báo: Track này đã được xóa!");
            } else {
                System.out.println("Error: Track này không tồn tại trong đơn!!!");
            }

        }
    }
    public int getLength(){
        int length = 0;
        for(Track trackOfCD: tracks){
            length += trackOfCD.getLength();
        }
        return length;
    }
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        for(Track trackOfCD : tracks){
            trackOfCD.play();
        }
    }
    }

