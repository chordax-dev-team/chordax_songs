INSERT INTO song(id, title, entered_at, user_id) VALUES (1, 'Jestem dzieckiem Twym', '2025-09-10', 1);

INSERT INTO line(id, line_type, lyrics) VALUES (1, 'VERSE', 'Ty przynosisz mi zwycięstwa pieśń,');
INSERT INTO line(id, line_type, lyrics) VALUES (2, 'VERSE', 'Ty dotykasz słowem swym,');
INSERT INTO line(id, line_type, lyrics) VALUES (3, 'VERSE', 'Dajesz wolność mi z sideł wokół mnie,');
INSERT INTO line(id, line_type, lyrics) VALUES (4, 'VERSE', 'Więc znika każdy lęk.');

INSERT INTO tone(id, chord, position) VALUES (1, 'H',  60);
INSERT INTO tone(id, chord, position) VALUES (2, 'H', 165);
INSERT INTO tone(id, chord, position) VALUES (3, 'H',  30);
INSERT INTO tone(id, chord, position) VALUES (4, 'D',  70);
INSERT INTO tone(id, chord, position) VALUES (5, 'E', 150);
INSERT INTO tone(id, chord, position) VALUES (6, 'H',  45);
INSERT INTO tone(id, chord, position) VALUES (7, 'H', 155);
INSERT INTO tone(id, chord, position) VALUES (8, 'H',  30);
INSERT INTO tone(id, chord, position) VALUES (9, 'E',  60);
INSERT INTO tone(id, chord, position) VALUES (10,'H',  90);

INSERT INTO song_line(song_id, line_id) VALUES (1,  1);
INSERT INTO song_line(song_id, line_id) VALUES (1,  2);
INSERT INTO song_line(song_id, line_id) VALUES (1,  3);
INSERT INTO song_line(song_id, line_id) VALUES (1,  4);

INSERT INTO line_tone(line_id, tone_id) VALUES (1,  1);
INSERT INTO line_tone(line_id, tone_id) VALUES (1,  2);
INSERT INTO line_tone(line_id, tone_id) VALUES (2,  3);
INSERT INTO line_tone(line_id, tone_id) VALUES (2,  4);
INSERT INTO line_tone(line_id, tone_id) VALUES (2,  5);
INSERT INTO line_tone(line_id, tone_id) VALUES (3,  6);
INSERT INTO line_tone(line_id, tone_id) VALUES (3,  7);
INSERT INTO line_tone(line_id, tone_id) VALUES (4,  8);
INSERT INTO line_tone(line_id, tone_id) VALUES (4,  9);
INSERT INTO line_tone(line_id, tone_id) VALUES (4,  10);


-- #########  "wake me up" by avicii ##############

INSERT INTO song(id, title, composer, author, entered_at, user_id)
VALUES (2, 'Wake Me Up', 'Avicii, Aloe Blacc, Mike Einziger', 'Aloe Blacc', CURRENT_TIMESTAMP, 1);

INSERT INTO line(id, line_type, lyrics) VALUES (5, 'VERSE', 'Feeling my way through the darkness');
INSERT INTO line(id, line_type, lyrics) VALUES (6, 'VERSE', 'Guided by a beating heart');
INSERT INTO line(id, line_type, lyrics) VALUES (7, 'VERSE', 'I can’t tell where the journey will end');
INSERT INTO line(id, line_type, lyrics) VALUES (8, 'VERSE', 'But I know where to start');
INSERT INTO line(id, line_type, lyrics) VALUES (9, 'VERSE', 'They tell me I’m too young to understand');
INSERT INTO line(id, line_type, lyrics) VALUES (10, 'VERSE', 'They say I’m caught up in a dream');
INSERT INTO line(id, line_type, lyrics) VALUES (11, 'VERSE', 'Well life will pass me by if I don’t open up my eyes');
INSERT INTO line(id, line_type, lyrics) VALUES (12, 'VERSE', 'Well that’s fine by me');
INSERT INTO line(id, line_type, lyrics) VALUES (13, 'CHORUS', 'So wake me up when it’s all over');
INSERT INTO line(id, line_type, lyrics) VALUES (14, 'CHORUS', 'When I’m wiser and I’m older');
INSERT INTO line(id, line_type, lyrics) VALUES (15, 'CHORUS', 'All this time I was finding myself');
INSERT INTO line(id, line_type, lyrics) VALUES (16, 'CHORUS', 'And I didn’t know I was lost');

-- Line 5
INSERT INTO tone(id, chord, position) VALUES (11, 'Bm', 0);
INSERT INTO tone(id, chord, position) VALUES (12, 'G', 60);
INSERT INTO tone(id, chord, position) VALUES (13, 'D', 120);
INSERT INTO tone(id, chord, position) VALUES (14, 'A', 180);

-- Line 6
INSERT INTO tone(id, chord, position) VALUES (15, 'Bm', 0);
INSERT INTO tone(id, chord, position) VALUES (16, 'G', 60);
INSERT INTO tone(id, chord, position) VALUES (17, 'D', 120);
INSERT INTO tone(id, chord, position) VALUES (18, 'A', 180);

-- Line 13 (Chorus)
INSERT INTO tone(id, chord, position) VALUES (19, 'Bm', 0);
INSERT INTO tone(id, chord, position) VALUES (20, 'G', 60);
INSERT INTO tone(id, chord, position) VALUES (21, 'D', 120);
INSERT INTO tone(id, chord, position) VALUES (22, 'A', 180);
INSERT INTO tone(id, chord, position) VALUES (23, 'F#', 240);


INSERT INTO song_line(song_id, line_id) VALUES (2, 5);
INSERT INTO song_line(song_id, line_id) VALUES (2, 6);
INSERT INTO song_line(song_id, line_id) VALUES (2, 7);
INSERT INTO song_line(song_id, line_id) VALUES (2, 8);
INSERT INTO song_line(song_id, line_id) VALUES (2, 9);
INSERT INTO song_line(song_id, line_id) VALUES (2, 10);
INSERT INTO song_line(song_id, line_id) VALUES (2, 11);
INSERT INTO song_line(song_id, line_id) VALUES (2, 12);
INSERT INTO song_line(song_id, line_id) VALUES (2, 13);
INSERT INTO song_line(song_id, line_id) VALUES (2, 14);
INSERT INTO song_line(song_id, line_id) VALUES (2, 15);
INSERT INTO song_line(song_id, line_id) VALUES (2, 16);

-- Line 5
INSERT INTO line_tone(line_id, tone_id) VALUES (5, 11);
INSERT INTO line_tone(line_id, tone_id) VALUES (5, 12);
INSERT INTO line_tone(line_id, tone_id) VALUES (5, 13);
INSERT INTO line_tone(line_id, tone_id) VALUES (5, 14);

-- Line 6
INSERT INTO line_tone(line_id, tone_id) VALUES (6, 15);
INSERT INTO line_tone(line_id, tone_id) VALUES (6, 16);
INSERT INTO line_tone(line_id, tone_id) VALUES (6, 17);
INSERT INTO line_tone(line_id, tone_id) VALUES (6, 18);

-- Line 13 (Chorus)
INSERT INTO line_tone(line_id, tone_id) VALUES (13, 19);
INSERT INTO line_tone(line_id, tone_id) VALUES (13, 20);
INSERT INTO line_tone(line_id, tone_id) VALUES (13, 21);
INSERT INTO line_tone(line_id, tone_id) VALUES (13, 22);
INSERT INTO line_tone(line_id, tone_id) VALUES (13, 23);


-- ######## BOHEMIAN RAPSODY BY QUEEN ########
INSERT INTO song(id, title, composer, author, entered_at, user_id)
VALUES (3, 'Bohemian Rhapsody', 'Freddie Mercury', 'Queen', CURRENT_TIMESTAMP, 1);

INSERT INTO line(id, line_type, lyrics) VALUES (17, 'INTRO', 'Is this the real life? Is this just fantasy?');
INSERT INTO line(id, line_type, lyrics) VALUES (18, 'INTRO', 'Caught in a landslide, no escape from reality.');
INSERT INTO line(id, line_type, lyrics) VALUES (19, 'VERSE', 'Mama, just killed a man, put a gun against his head.');
INSERT INTO line(id, line_type, lyrics) VALUES (20, 'VERSE', 'Pulled my trigger, now he’s dead.');
INSERT INTO line(id, line_type, lyrics) VALUES (21, 'CHORUS', 'So you think you can stone me and spit in my eye?');
INSERT INTO line(id, line_type, lyrics) VALUES (22, 'CHORUS', 'So you think you can love me and leave me to die?');
INSERT INTO line(id, line_type, lyrics) VALUES (23, 'OUTRO', 'Nothing really matters to me.');

-- Line 17
INSERT INTO tone(id, chord, position) VALUES (24, 'Em7', 0);
INSERT INTO tone(id, chord, position) VALUES (25, 'A7', 60);

-- Line 18
INSERT INTO tone(id, chord, position) VALUES (26, 'D7', 0);
INSERT INTO tone(id, chord, position) VALUES (27, 'G', 60);

-- Line 19
INSERT INTO tone(id, chord, position) VALUES (28, 'G', 0);
INSERT INTO tone(id, chord, position) VALUES (29, 'Em', 60);
INSERT INTO tone(id, chord, position) VALUES (30, 'Am', 120);

-- Line 20
INSERT INTO tone(id, chord, position) VALUES (31, 'D', 0);
INSERT INTO tone(id, chord, position) VALUES (32, 'G', 60);

-- Line 21
INSERT INTO tone(id, chord, position) VALUES (33, 'Bb', 0);
INSERT INTO tone(id, chord, position) VALUES (34, 'Eb', 60);

-- Line 22
INSERT INTO tone(id, chord, position) VALUES (35, 'F', 0);
INSERT INTO tone(id, chord, position) VALUES (36, 'Gm', 60);

-- Line 23
INSERT INTO tone(id, chord, position) VALUES (37, 'Cm', 0);
INSERT INTO tone(id, chord, position) VALUES (38, 'Ab', 60);

INSERT INTO song_line(song_id, line_id) VALUES (3, 17);
INSERT INTO song_line(song_id, line_id) VALUES (3, 18);
INSERT INTO song_line(song_id, line_id) VALUES (3, 19);
INSERT INTO song_line(song_id, line_id) VALUES (3, 20);
INSERT INTO song_line(song_id, line_id) VALUES (3, 21);
INSERT INTO song_line(song_id, line_id) VALUES (3, 22);
INSERT INTO song_line(song_id, line_id) VALUES (3, 23);

-- Line 17
INSERT INTO line_tone(line_id, tone_id) VALUES (17, 24);
INSERT INTO line_tone(line_id, tone_id) VALUES (17, 25);

-- Line 18
INSERT INTO line_tone(line_id, tone_id) VALUES (18, 26);
INSERT INTO line_tone(line_id, tone_id) VALUES (18, 27);

-- Line 19
INSERT INTO line_tone(line_id, tone_id) VALUES (19, 28);
INSERT INTO line_tone(line_id, tone_id) VALUES (19, 29);
INSERT INTO line_tone(line_id, tone_id) VALUES (19, 30);

-- Line 20
INSERT INTO line_tone(line_id, tone_id) VALUES (20, 31);
INSERT INTO line_tone(line_id, tone_id) VALUES (20, 32);

-- Line 21
INSERT INTO line_tone(line_id, tone_id) VALUES (21, 33);
INSERT INTO line_tone(line_id, tone_id) VALUES (21, 34);

-- Line 22
INSERT INTO line_tone(line_id, tone_id) VALUES (22, 35);
INSERT INTO line_tone(line_id, tone_id) VALUES (22, 36);

-- Line 23
INSERT INTO line_tone(line_id, tone_id) VALUES (23, 37);
INSERT INTO line_tone(line_id, tone_id) VALUES (23, 38);

ALTER TABLE tone ALTER COLUMN id RESTART WITH 39;
ALTER TABLE line ALTER COLUMN id RESTART WITH 24;
ALTER TABLE song ALTER COLUMN id RESTART WITH 4;
