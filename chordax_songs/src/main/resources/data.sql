-- ######## AS IT WAS BY HARRY STYLES ########
INSERT INTO song(id, title, composer, author, entered_at, user_id)
VALUES (4, 'As It Was', 'Harry Styles, Kid Harpoon, Tyler Johnson', 'Harry Styles, Kid Harpoon, Tyler Johnson', CURRENT_TIMESTAMP, 1);

-- Lines for "As It Was"
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (24, 'INTRO', 'Come on Harry, we wanna say goodnight to you', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (25, 'VERSE', 'Holdin'' me back, gravity''s holdin'' me back', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (26, 'VERSE', 'I want you to hold out the palm of your hand', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (27, 'CHORUS', 'In this world, it''s just us', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (28, 'CHORUS', 'You know it''s not the same as it was', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (29, 'VERSE', 'Answer the phone, Harry you''re no good alone', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (30, 'BRIDGE', 'Go home, get ahead, light-speed internet', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (31, 'OUTRO', 'As it was, as it was, you know it''s not the same', 4);

-- Tones
INSERT INTO tone(id, chord, position) VALUES (39, 'Am', 0);
INSERT INTO tone(id, chord, position) VALUES (40, 'D', 60);
INSERT INTO tone(id, chord, position) VALUES (41, 'G', 120);
INSERT INTO tone(id, chord, position) VALUES (42, 'C', 0);
INSERT INTO tone(id, chord, position) VALUES (43, 'Am', 60);
INSERT INTO tone(id, chord, position) VALUES (44, 'D', 120);
INSERT INTO tone(id, chord, position) VALUES (45, 'G', 180);
INSERT INTO tone(id, chord, position) VALUES (46, 'C', 180);


-- ######## BOHEMIAN RHAPSODY — OPERATIC SECTION ########
INSERT INTO song(id, title, composer, author, entered_at, user_id)
VALUES (3, 'Bohemian Rhapsody', 'Freddie Mercury', 'Freddie Mercury', CURRENT_TIMESTAMP, 1);

-- Lines
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (32, 'OPERATIC', 'I see a little silhouette of a man', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (33, 'OPERATIC', 'Scaramouche, Scaramouche, will you do the Fandango?', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (34, 'OPERATIC', 'Thunderbolt and lightning, very very frightening me', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (35, 'OPERATIC', 'Galileo, Galileo, Galileo, Figaro – Magnifico!', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (36, 'OPERATIC', 'I''m just a poor boy, nobody loves me', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (37, 'OPERATIC', 'He''s just a poor boy from a poor family', 3);

-- Tones
INSERT INTO tone(id, chord, position) VALUES (47, 'B', 0);
INSERT INTO tone(id, chord, position) VALUES (48, 'F#', 60);
INSERT INTO tone(id, chord, position) VALUES (49, 'F', 120);
INSERT INTO tone(id, chord, position) VALUES (50, 'F#', 180);
INSERT INTO tone(id, chord, position) VALUES (51, 'A#', 0);
INSERT INTO tone(id, chord, position) VALUES (52, 'F', 60);     -- reused
INSERT INTO tone(id, chord, position) VALUES (53, 'C#', 120);
INSERT INTO tone(id, chord, position) VALUES (54, 'F#', 180);   -- reused
INSERT INTO tone(id, chord, position) VALUES (55, 'G#', 0);
INSERT INTO tone(id, chord, position) VALUES (56, 'G', 60);
INSERT INTO tone(id, chord, position) VALUES (57, 'F#', 120);   -- reused
INSERT INTO tone(id, chord, position) VALUES (58, 'G', 180);    -- reused
INSERT INTO tone(id, chord, position) VALUES (59, 'F', 0);      -- reused
INSERT INTO tone(id, chord, position) VALUES (60, 'C', 60);
INSERT INTO tone(id, chord, position) VALUES (61, 'Cdim', 120);
INSERT INTO tone(id, chord, position) VALUES (62, 'C', 180);    -- reused


-- ######## DUCHU ŚWIĘTY ########
INSERT INTO song(id, title, composer, author, entered_at, user_id)
VALUES (6, 'Duchu Święty', 'Szymon Czyżewski, Melania Król, Dawid Leszczyński', 'Szymon Czyżewski, Melania Król, Dawid Leszczyński', CURRENT_TIMESTAMP, 1);

-- Lines
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (50, 'VERSE', 'Nie ma nic ważniejszego, kiedy jesteś tu blisko', 6);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (51, 'VERSE', 'Z Tobą nic się nie równa, jesteś żywą nadzieją', 6);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (52, 'REFRAIN', 'Obecność Twa', 6);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (53, 'VERSE', 'Spróbowałem i pragnę najsłodszej miłości', 6);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (54, 'VERSE', 'Moje serce jest wolne od wstydu i hańby', 6);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (55, 'REFRAIN', 'Obecność Twa', 6);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (56, 'CHORUS', 'Duchu Święty, zapraszamy Cię', 6);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (57, 'CHORUS', 'Obecność Twa, jak fala, zmienia miejsce te', 6);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (58, 'CHORUS', 'Twoja chwała niech przenika serce me', 6);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (59, 'CHORUS', 'Przejmij, Panie, wszystko, obecności chcemy Twej', 6);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (60, 'BRIDGE', 'Spraw, byśmy byli bardziej świadomi Twej obecności', 6);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (61, 'BRIDGE', 'Daj nam doświadczyć dobroci Twojej chwały', 6);

-- Tones
INSERT INTO tone(id, chord, position) VALUES (77, 'D', 0);
INSERT INTO tone(id, chord, position) VALUES (78, 'A', 315);
INSERT INTO tone(id, chord, position) VALUES (79, 'D', 315); -- reused
INSERT INTO tone(id, chord, position) VALUES (80, 'A', 80);
INSERT INTO tone(id, chord, position) VALUES (81, 'A', 300);
INSERT INTO tone(id, chord, position) VALUES (82, 'D', 280);
INSERT INTO tone(id, chord, position) VALUES (83, 'A', 15);
INSERT INTO tone(id, chord, position) VALUES (84, 'D', 60);
INSERT INTO tone(id, chord, position) VALUES (85, 'Em', 120);
INSERT INTO tone(id, chord, position) VALUES (86, 'Em', 220);
INSERT INTO tone(id, chord, position) VALUES (87, 'A', 0);


-- ######## JESTEM DZIECKIEM TWYM ########
INSERT INTO song(id, title, composer, author, entered_at, user_id)
VALUES (7, 'Jestem dzieckiem Twym', 'Jonathan David Helser, Melissa Helser', 'Bethel Music', CURRENT_TIMESTAMP, 1);

-- Lines
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (62, 'VERSE', 'Ty przynosisz mi zwycięstwa pieśń,', 7);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (63, 'VERSE', 'Ty dotykasz słowem Swym.', 7);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (64, 'VERSE', 'Dajesz wolność mi z sideł wokół mnie,', 7);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (65, 'VERSE', 'Więc znika każdy lęk.', 7);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (66, 'CHORUS', 'Wiem, nie muszę się więcej bać, bo jestem dzieckiem Twym.', 7);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (67, 'VERSE', 'Ty wybrałeś mnie u początku dni,', 7);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (68, 'VERSE', 'Wyszeptałeś imię me.', 7);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (69, 'VERSE', 'Jestem dzieckiem Twym, pokochałeś mnie,', 7);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (70, 'VERSE', 'Me życie w Twojej krwi.', 7);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (71, 'BRIDGE', 'Idąc za Tobą mogę przejść przez morze,', 7);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (72, 'BRIDGE', 'W miłości tonie cały strach.', 7);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (73, 'BRIDGE', 'Wyzwalasz mnie i mogę wyznać, że', 7);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (74, 'BRIDGE', 'Ja jestem dzieckiem Twym.', 7);

-- Tones
INSERT INTO tone(id, chord, position) VALUES (88, 'D', 0);
INSERT INTO tone(id, chord, position) VALUES (89, 'H', 60);
INSERT INTO tone(id, chord, position) VALUES (90, 'G', 30);
INSERT INTO tone(id, chord, position) VALUES (91, 'A', 70);
INSERT INTO tone(id, chord, position) VALUES (92, 'D', 150);
INSERT INTO tone(id, chord, position) VALUES (93, 'D', 45);
INSERT INTO tone(id, chord, position) VALUES (94, 'H', 155);
INSERT INTO tone(id, chord, position) VALUES (95, 'B', 30);
INSERT INTO tone(id, chord, position) VALUES (96, 'E', 60);
INSERT INTO tone(id, chord, position) VALUES (97, 'H', 90);
INSERT INTO tone(id, chord, position) VALUES (98, 'G', 0);
INSERT INTO tone(id, chord, position) VALUES (99, 'A', 60);
INSERT INTO tone(id, chord, position) VALUES (100, 'D', 120);
INSERT INTO tone(id, chord, position) VALUES (101, 'H', 0);
INSERT INTO tone(id, chord, position) VALUES (102, 'G', 180);


-- ######## WAKE ME UP ########
INSERT INTO song(id, title, composer, author, entered_at, user_id)
VALUES (8, 'Wake Me Up', 'Avicii, Aloe Blacc, Mike Einziger', 'Avicii, Aloe Blacc, Mike Einziger', CURRENT_TIMESTAMP, 1);

-- Lines
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (75, 'VERSE', 'Feeling my way through the darkness', 8);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (76, 'VERSE', 'Guided by a beating heart', 8);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (77, 'VERSE', 'I can''t tell where the journey will end', 8);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (78, 'CHORUS', 'So wake me up when it''s all over', 8);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (79, 'CHORUS', 'When I''m wiser and I''m older', 8);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (80, 'CHORUS', 'All this time I was finding myself', 8);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (81, 'CHORUS', 'And I didn''t know I was lost', 8);

-- Tones
INSERT INTO tone(id, chord, position) VALUES (103, 'Bm', 0);
INSERT INTO tone(id, chord, position) VALUES (104, 'G', 60);
INSERT INTO tone(id, chord, position) VALUES (105, 'D', 120);
INSERT INTO tone(id, chord, position) VALUES (106, 'A', 180);
INSERT INTO tone(id, chord, position) VALUES (107, 'F#', 180);


-- ######## YESTERDAY ########
INSERT INTO song(id, title, composer, author, entered_at, user_id)
VALUES (9, 'Yesterday', 'Paul McCartney', 'John Lennon & Paul McCartney', CURRENT_TIMESTAMP, 1);

-- Lines
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (82, 'VERSE', 'Yesterday, all my troubles seemed so far away', 9);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (83, 'VERSE', 'Now it looks as though they''re here to stay', 9);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (84, 'VERSE', 'Oh, I believe in yesterday', 9);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (85, 'CHORUS', 'Why she had to go, I don''t know, she wouldn''t say', 9);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (86, 'CHORUS', 'I said something wrong, now I long for yesterday', 9);

-- Tones
INSERT INTO tone(id, chord, position) VALUES (108, 'F', 0);
INSERT INTO tone(id, chord, position) VALUES (109, 'Em7', 60);
INSERT INTO tone(id, chord, position) VALUES (110, 'A7', 120);
INSERT INTO tone(id, chord, position) VALUES (111, 'Dm', 180);
INSERT INTO tone(id, chord, position) VALUES (112, 'Bb', 240);
INSERT INTO tone(id, chord, position) VALUES (113, 'C7', 300);
INSERT INTO tone(id, chord, position) VALUES (114, 'F/E', 60);
INSERT INTO tone(id, chord, position) VALUES (115, 'G7', 180);
INSERT INTO tone(id, chord, position) VALUES (116, 'Gm', 240);
INSERT INTO tone(id, chord, position) VALUES (117, 'C', 300);