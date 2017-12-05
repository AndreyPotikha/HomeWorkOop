package startOop.oop.carTrackSecond.dao;

import startOop.oop.carTrackSecond.model.Track;

import java.util.List;

public interface TrackDAO {

    List<Track> getAllTracks();
    void roll(Track track);
    void stop(Track track);
}
