package startOop.oop.carTrackSecond.service;

import startOop.oop.carTrackSecond.model.Track;

import java.util.List;

public interface TrackService {

    List<Track> getAllTracks();
    void roll(Track track);
    void stop(Track track);
}
