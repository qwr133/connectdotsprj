
package site.connectdots.connectdotsprj.musicboard.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import site.connectdots.connectdotsprj.musicboard.entity.Genre;
import site.connectdots.connectdotsprj.musicboard.entity.Music;



@SpringBootTest
@Transactional
@Rollback(value = false)
class MusicRepositoryTest {

    @Autowired
    MusicRepository musicRepository;

    @Test
    @DisplayName("bulk insert")
    void musicList() {

        for (int i = 0; i < 50; i++) {

            musicRepository.save(
                    Music.builder()
                            .music_board_title("Title " + i)
                            .music_board_singer("Singer " + i)
                            .music_board_lyrics("Lyrics " + i)
                            .music_board_genre(Genre.valueOf(Genre.발라드.toString() + i))
                            .build()

            );

        }


    }






}