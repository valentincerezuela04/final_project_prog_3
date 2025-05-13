package com.musicreviewapp.song.mapper;

import com.musicreviewapp.song.dto.SongResponse;
import com.musicreviewapp.song.model.Song;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class SongMapper {

    public SongResponse toResponse(Song song) {
        if (song == null) {
            return null;
        }

        return SongResponse.builder()
                .id(song.getId())
                .spotifyId(song.getSpotifyId())
                .name(song.getName())
                .artistName(song.getArtistName())
                .album(song.getAlbum())
                .imageUrl(song.getImageUrl())
                .durationMs(song.getDurationMs())
                .previewUrl(song.getPreviewUrl())
                .spotifyLink(song.getSpotifyLink())
                .releaseDate(song.getReleaseDate())
                .build();
    }

    public List<SongResponse> toResponseList(List<Song> songs) {
        if (songs == null) {
            return null;
        }

        return songs.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }
    // public Page<SongResponse> toResponsePage(Page<Song> songPage) {
    //    return songPage.map(this::toResponse);
    // }
    // Page implementation soon
}