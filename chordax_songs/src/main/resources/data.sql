INSERT INTO song(id, title, user_id) VALUES (1, 'Jestem dzieckiem Twym', 1);

INSERT INTO verse(id, lyrics) VALUES (1, 'Ty przynosisz mi zwycięstwa pieśń,');
INSERT INTO verse(id, lyrics) VALUES (2, 'Ty dotykasz słowem swym,');
INSERT INTO verse(id, lyrics) VALUES (3, 'Dajesz wolność mi z sideł wokół mnie,');
INSERT INTO verse(id, lyrics) VALUES (4, 'Więc znika każdy lęk.');

INSERT INTO tone(id, tone, position) VALUES (1, 'H',  60);
INSERT INTO tone(id, tone, position) VALUES (2, 'H', 165);
INSERT INTO tone(id, tone, position) VALUES (3, 'H',  30);
INSERT INTO tone(id, tone, position) VALUES (4, 'D',  70);
INSERT INTO tone(id, tone, position) VALUES (5, 'E', 150);
INSERT INTO tone(id, tone, position) VALUES (6, 'H',  45);
INSERT INTO tone(id, tone, position) VALUES (7, 'H', 155);
INSERT INTO tone(id, tone, position) VALUES (8, 'B',  30);
INSERT INTO tone(id, tone, position) VALUES (9, 'E',  60);
INSERT INTO tone(id, tone, position) VALUES (10,'H',  90);

INSERT INTO song_verses(song_id, verse_id) VALUES (1,  1);
INSERT INTO song_verses(song_id, verse_id) VALUES (1,  2);
INSERT INTO song_verses(song_id, verse_id) VALUES (1,  3);
INSERT INTO song_verses(song_id, verse_id) VALUES (1,  4);

INSERT INTO verse_tones(verse_id, tone_id) VALUES (1,  1);
INSERT INTO verse_tones(verse_id, tone_id) VALUES (1,  2);
INSERT INTO verse_tones(verse_id, tone_id) VALUES (2,  3);
INSERT INTO verse_tones(verse_id, tone_id) VALUES (2,  4);
INSERT INTO verse_tones(verse_id, tone_id) VALUES (2,  5);
INSERT INTO verse_tones(verse_id, tone_id) VALUES (3,  6);
INSERT INTO verse_tones(verse_id, tone_id) VALUES (3,  7);
INSERT INTO verse_tones(verse_id, tone_id) VALUES (4,  8);
INSERT INTO verse_tones(verse_id, tone_id) VALUES (4,  9);
INSERT INTO verse_tones(verse_id, tone_id) VALUES (4,  10);