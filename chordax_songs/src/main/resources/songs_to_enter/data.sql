-- ######## AS IT WAS BY HARRY STYLES ########
INSERT INTO song(id, title, composer, author, entered_at, user_id)
VALUES (1, 'As It Was', 'Harry Styles, Kid Harpoon, Tyler Johnson', 'Harry Styles, Kid Harpoon, Tyler Johnson', CURRENT_TIMESTAMP, 1);

-- Lines for "As It Was"
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (24, 'INTRO', 'Come on Harry, we wanna say goodnight to you', 1);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (25, 'VERSE', 'Holdin'' me back, gravity''s holdin'' me back', 1);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (26, 'VERSE', 'I want you to hold out the palm of your hand', 1);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (27, 'CHORUS', 'In this world, it''s just us', 1);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (28, 'CHORUS', 'You know it''s not the same as it was', 1);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (29, 'VERSE', 'Answer the phone, Harry you''re no good alone', 1);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (30, 'BRIDGE', 'Go home, get ahead, light-speed internet', 1);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (31, 'OUTRO', 'As it was, as it was, you know it''s not the same', 1);

-- Tones
INSERT INTO tone(id, chord, position) VALUES (39, 'Am', 0);
INSERT INTO tone(id, chord, position) VALUES (40, 'D', 60);
INSERT INTO tone(id, chord, position) VALUES (41, 'G', 120);
INSERT INTO tone(id, chord, position) VALUES (42, 'C', 0);
INSERT INTO tone(id, chord, position) VALUES (43, 'Am', 60);
INSERT INTO tone(id, chord, position) VALUES (44, 'D', 120);
INSERT INTO tone(id, chord, position) VALUES (45, 'G', 180);
INSERT INTO tone(id, chord, position) VALUES (46, 'C', 180);

-- INTRO (Line 24)
INSERT INTO line_tone VALUES (24, 39); -- Am
INSERT INTO line_tone VALUES (24, 40); -- D
INSERT INTO line_tone VALUES (24, 41); -- G

-- VERSE 1 (Line 25)
INSERT INTO line_tone VALUES (25, 42); -- C
INSERT INTO line_tone VALUES (25, 43); -- Am
INSERT INTO line_tone VALUES (25, 44); -- D

-- VERSE 2 (Line 26)
INSERT INTO line_tone VALUES (26, 45); -- G
INSERT INTO line_tone VALUES (26, 46); -- C

-- CHORUS 1 (Line 27)
INSERT INTO line_tone VALUES (27, 39); -- Am
INSERT INTO line_tone VALUES (27, 41); -- G

-- CHORUS 2 (Line 28)
INSERT INTO line_tone VALUES (28, 40); -- D
INSERT INTO line_tone VALUES (28, 42); -- C

-- VERSE 3 (Line 29)
INSERT INTO line_tone VALUES (29, 43); -- Am
INSERT INTO line_tone VALUES (29, 44); -- D

-- BRIDGE (Line 30)
INSERT INTO line_tone VALUES (30, 45); -- G
INSERT INTO line_tone VALUES (30, 46); -- C

-- OUTRO (Line 31)
INSERT INTO line_tone VALUES (31, 39); -- Am
INSERT INTO line_tone VALUES (31, 41); -- G
INSERT INTO line_tone VALUES (31, 46); -- C


-- ######## BOHEMIAN RHAPSODY — OPERATIC SECTION ########
INSERT INTO song(id, title, composer, author, entered_at, user_id)
VALUES (2, 'Bohemian Rhapsody', 'Freddie Mercury', 'Freddie Mercury', CURRENT_TIMESTAMP, 1);

-- Lines
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (32, 'OPERATIC', 'I see a little silhouette of a man', 2);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (33, 'OPERATIC', 'Scaramouche, Scaramouche, will you do the Fandango?', 2);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (34, 'OPERATIC', 'Thunderbolt and lightning, very very frightening me', 2);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (35, 'OPERATIC', 'Galileo, Galileo, Galileo, Figaro – Magnifico!', 2);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (36, 'OPERATIC', 'I''m just a poor boy, nobody loves me', 2);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (37, 'OPERATIC', 'He''s just a poor boy from a poor family', 2);

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

-- Line 32: "I see a little silhouette of a man"
INSERT INTO line_tone VALUES (32, 47); -- B
INSERT INTO line_tone VALUES (32, 48); -- F#
INSERT INTO line_tone VALUES (32, 49); -- F

-- Line 33: "Scaramouche, Scaramouche, will you do the Fandango?"
INSERT INTO line_tone VALUES (33, 50); -- F#
INSERT INTO line_tone VALUES (33, 51); -- A#
INSERT INTO line_tone VALUES (33, 52); -- F

-- Line 34: "Thunderbolt and lightning, very very frightening me"
INSERT INTO line_tone VALUES (34, 53); -- C#
INSERT INTO line_tone VALUES (34, 54); -- F#
INSERT INTO line_tone VALUES (34, 55); -- G#

-- Line 35: "Galileo, Galileo, Galileo, Figaro – Magnifico!"
INSERT INTO line_tone VALUES (35, 56); -- G
INSERT INTO line_tone VALUES (35, 57); -- F#
INSERT INTO line_tone VALUES (35, 58); -- G

-- Line 36: "I'm just a poor boy, nobody loves me"
INSERT INTO line_tone VALUES (36, 59); -- F
INSERT INTO line_tone VALUES (36, 60); -- C
INSERT INTO line_tone VALUES (36, 61); -- Cdim

-- Line 37: "He's just a poor boy from a poor family"
INSERT INTO line_tone VALUES (37, 62); -- C
INSERT INTO line_tone VALUES (37, 60); -- C (reused)
INSERT INTO line_tone VALUES (37, 59); -- F (reused)

--
--
-- ######## DUCHU ŚWIĘTY ########
INSERT INTO song(id, title, composer, author, entered_at, user_id)
VALUES (3, 'Duchu Święty', 'Szymon Czyżewski, Melania Król, Dawid Leszczyński', 'Szymon Czyżewski, Melania Król, Dawid Leszczyński', CURRENT_TIMESTAMP, 1);

-- Lines
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (50, 'VERSE', 'Nie ma nic ważniejszego, kiedy jesteś tu blisko', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (51, 'VERSE', 'Z Tobą nic się nie równa, jesteś żywą nadzieją', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (52, 'REFRAIN', 'Obecność Twa', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (53, 'VERSE', 'Spróbowałem i pragnę najsłodszej miłości', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (54, 'VERSE', 'Moje serce jest wolne od wstydu i hańby', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (55, 'REFRAIN', 'Obecność Twa', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (56, 'CHORUS', 'Duchu Święty, zapraszamy Cię', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (57, 'CHORUS', 'Obecność Twa, jak fala, zmienia miejsce te', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (58, 'CHORUS', 'Twoja chwała niech przenika serce me', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (59, 'CHORUS', 'Przejmij, Panie, wszystko, obecności chcemy Twej', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (60, 'BRIDGE', 'Spraw, byśmy byli bardziej świadomi Twej obecności', 3);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (61, 'BRIDGE', 'Daj nam doświadczyć dobroci Twojej chwały', 3);

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

-- Line 50: "Nie ma nic ważniejszego, kiedy jesteś tu blisko"
INSERT INTO line_tone VALUES (50, 77); -- D
INSERT INTO line_tone VALUES (50, 78); -- A

-- Line 51: "Z Tobą nic się nie równa, jesteś żywą nadzieją"
INSERT INTO line_tone VALUES (51, 79); -- D
INSERT INTO line_tone VALUES (51, 80); -- A

-- Line 52: "Obecność Twa"
INSERT INTO line_tone VALUES (52, 81); -- A
INSERT INTO line_tone VALUES (52, 82); -- D

-- Line 53: "Spróbowałem i pragnę najsłodszej miłości"
INSERT INTO line_tone VALUES (53, 83); -- A
INSERT INTO line_tone VALUES (53, 84); -- D

-- Line 54: "Moje serce jest wolne od wstydu i hańby"
INSERT INTO line_tone VALUES (54, 85); -- Em
INSERT INTO line_tone VALUES (54, 86); -- Em

-- Line 55: "Obecność Twa"
INSERT INTO line_tone VALUES (55, 87); -- A
INSERT INTO line_tone VALUES (55, 77); -- D

-- Line 56: "Duchu Święty, zapraszamy Cię"
INSERT INTO line_tone VALUES (56, 78); -- A
INSERT INTO line_tone VALUES (56, 84); -- D

-- Line 57: "Obecność Twa, jak fala, zmienia miejsce te"
INSERT INTO line_tone VALUES (57, 85); -- Em
INSERT INTO line_tone VALUES (57, 86); -- Em

-- Line 58: "Twoja chwała niech przenika serce me"
INSERT INTO line_tone VALUES (58, 87); -- A
INSERT INTO line_tone VALUES (58, 82); -- D

-- Line 59: "Przejmij, Panie, wszystko, obecności chcemy Twej"
INSERT INTO line_tone VALUES (59, 83); -- A
INSERT INTO line_tone VALUES (59, 84); -- D

-- Line 60: "Spraw, byśmy byli bardziej świadomi Twej obecności"
INSERT INTO line_tone VALUES (60, 85); -- Em
INSERT INTO line_tone VALUES (60, 86); -- Em

-- Line 61: "Daj nam doświadczyć dobroci Twojej chwały"
INSERT INTO line_tone VALUES (61, 87); -- A
INSERT INTO line_tone VALUES (61, 77); -- D


-- ######## JESTEM DZIECKIEM TWYM ########
INSERT INTO song(id, title, composer, author, entered_at, user_id)
VALUES (4, 'Jestem dzieckiem Twym', 'Jonathan David Helser, Melissa Helser', 'Bethel Music', CURRENT_TIMESTAMP, 1);

-- Lines
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (62, 'VERSE', 'Ty przynosisz mi zwycięstwa pieśń,', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (63, 'VERSE', 'Ty dotykasz słowem Swym.', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (64, 'VERSE', 'Dajesz wolność mi z sideł wokół mnie,', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (65, 'VERSE', 'Więc znika każdy lęk.', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (66, 'CHORUS', 'Wiem, nie muszę się więcej bać, bo jestem dzieckiem Twym.', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (67, 'VERSE', 'Ty wybrałeś mnie u początku dni,', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (68, 'VERSE', 'Wyszeptałeś imię me.', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (69, 'VERSE', 'Jestem dzieckiem Twym, pokochałeś mnie,', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (70, 'VERSE', 'Me życie w Twojej krwi.', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (71, 'BRIDGE', 'Idąc za Tobą mogę przejść przez morze,', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (72, 'BRIDGE', 'W miłości tonie cały strach.', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (73, 'BRIDGE', 'Wyzwalasz mnie i mogę wyznać, że', 4);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (74, 'BRIDGE', 'Ja jestem dzieckiem Twym.', 4);

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

-- Line 62: "Ty przynosisz mi zwycięstwa pieśń,"
INSERT INTO line_tone VALUES (62, 88); -- D
INSERT INTO line_tone VALUES (62, 89); -- H

-- Line 63: "Ty dotykasz słowem Swym."
INSERT INTO line_tone VALUES (63, 90); -- G
INSERT INTO line_tone VALUES (63, 91); -- A

-- Line 64: "Dajesz wolność mi z sideł wokół mnie,"
INSERT INTO line_tone VALUES (64, 92); -- D
INSERT INTO line_tone VALUES (64, 93); -- D

-- Line 65: "Więc znika każdy lęk."
INSERT INTO line_tone VALUES (65, 94); -- H
INSERT INTO line_tone VALUES (65, 95); -- B

-- Line 66: "Wiem, nie muszę się więcej bać, bo jestem dzieckiem Twym."
INSERT INTO line_tone VALUES (66, 96); -- E
INSERT INTO line_tone VALUES (66, 97); -- H

-- Line 67: "Ty wybrałeś mnie u początku dni,"
INSERT INTO line_tone VALUES (67, 98); -- G
INSERT INTO line_tone VALUES (67, 99); -- A

-- Line 68: "Wyszeptałeś imię me."
INSERT INTO line_tone VALUES (68, 100); -- D
INSERT INTO line_tone VALUES (68, 101); -- H

-- Line 69: "Jestem dzieckiem Twym, pokochałeś mnie,"
INSERT INTO line_tone VALUES (69, 90); -- G
INSERT INTO line_tone VALUES (69, 91); -- A

-- Line 70: "Me życie w Twojej krwi."
INSERT INTO line_tone VALUES (70, 88); -- D
INSERT INTO line_tone VALUES (70, 89); -- H

-- Line 71: "Idąc za Tobą mogę przejść przez morze,"
INSERT INTO line_tone VALUES (71, 102); -- G
INSERT INTO line_tone VALUES (71, 95); -- B

-- Line 72: "W miłości tonie cały strach."
INSERT INTO line_tone VALUES (72, 96); -- E
INSERT INTO line_tone VALUES (72, 97); -- H

-- Line 73: "Wyzwalasz mnie i mogę wyznać, że"
INSERT INTO line_tone VALUES (73, 100); -- D
INSERT INTO line_tone VALUES (73, 101); -- H

-- Line 74: "Ja jestem dzieckiem Twym."
INSERT INTO line_tone VALUES (74, 98); -- G
INSERT INTO line_tone VALUES (74, 99); -- A


-- ######## WAKE ME UP ########
INSERT INTO song(id, title, composer, author, entered_at, user_id)
VALUES (5, 'Wake Me Up', 'Avicii, Aloe Blacc, Mike Einziger', 'Avicii, Aloe Blacc, Mike Einziger', CURRENT_TIMESTAMP, 1);

-- Lines
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (75, 'VERSE', 'Feeling my way through the darkness', 5);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (76, 'VERSE', 'Guided by a beating heart', 5);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (77, 'VERSE', 'I can''t tell where the journey will end', 5);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (78, 'CHORUS', 'So wake me up when it''s all over', 5);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (79, 'CHORUS', 'When I''m wiser and I''m older', 5);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (80, 'CHORUS', 'All this time I was finding myself', 5);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (81, 'CHORUS', 'And I didn''t know I was lost', 5);

-- Tones
INSERT INTO tone(id, chord, position) VALUES (103, 'Bm', 0);
INSERT INTO tone(id, chord, position) VALUES (104, 'G', 60);
INSERT INTO tone(id, chord, position) VALUES (105, 'D', 120);
INSERT INTO tone(id, chord, position) VALUES (106, 'A', 180);
INSERT INTO tone(id, chord, position) VALUES (107, 'F#', 180);

-- Line 75: "Feeling my way through the darkness"
INSERT INTO line_tone VALUES (75, 103); -- Bm
INSERT INTO line_tone VALUES (75, 104); -- G

-- Line 76: "Guided by a beating heart"
INSERT INTO line_tone VALUES (76, 105); -- D
INSERT INTO line_tone VALUES (76, 106); -- A

-- Line 77: "I can't tell where the journey will end"
INSERT INTO line_tone VALUES (77, 107); -- F#
INSERT INTO line_tone VALUES (77, 103); -- Bm

-- Line 78: "So wake me up when it's all over"
INSERT INTO line_tone VALUES (78, 104); -- G
INSERT INTO line_tone VALUES (78, 105); -- D

-- Line 79: "When I'm wiser and I'm older"
INSERT INTO line_tone VALUES (79, 106); -- A
INSERT INTO line_tone VALUES (79, 107); -- F#

-- Line 80: "All this time I was finding myself"
INSERT INTO line_tone VALUES (80, 103); -- Bm
INSERT INTO line_tone VALUES (80, 104); -- G

-- Line 81: "And I didn't know I was lost"
INSERT INTO line_tone VALUES (81, 105); -- D
INSERT INTO line_tone VALUES (81, 106); -- A


-- ######## YESTERDAY ########
INSERT INTO song(id, title, composer, author, entered_at, user_id)
VALUES (6, 'Yesterday', 'Paul McCartney', 'John Lennon & Paul McCartney', CURRENT_TIMESTAMP, 1);

-- Lines
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (82, 'VERSE', 'Yesterday, all my troubles seemed so far away', 6);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (83, 'VERSE', 'Now it looks as though they''re here to stay', 6);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (84, 'VERSE', 'Oh, I believe in yesterday', 6);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (85, 'CHORUS', 'Why she had to go, I don''t know, she wouldn''t say', 6);
INSERT INTO line(id, line_type, lyrics, song_id) VALUES (86, 'CHORUS', 'I said something wrong, now I long for yesterday', 6);

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

-- Line 82: "Yesterday, all my troubles seemed so far away"
INSERT INTO line_tone VALUES (82, 108); -- F
INSERT INTO line_tone VALUES (82, 109); -- Em7

-- Line 83: "Now it looks as though they're here to stay"
INSERT INTO line_tone VALUES (83, 110); -- A7
INSERT INTO line_tone VALUES (83, 111); -- Dm

-- Line 84: "Oh, I believe in yesterday"
INSERT INTO line_tone VALUES (84, 112); -- Bb
INSERT INTO line_tone VALUES (84, 113); -- C7

-- Line 85: "Why she had to go, I don't know, she wouldn't say"
INSERT INTO line_tone VALUES (85, 114); -- F/E
INSERT INTO line_tone VALUES (85, 115); -- G7

-- Line 86: "I said something wrong, now I long for yesterday"
INSERT INTO line_tone VALUES (86, 116); -- Gm
INSERT INTO line_tone VALUES (86, 117); -- C

-- Set the sequence to start at 7
ALTER TABLE song ALTER COLUMN id RESTART WITH 7;
ALTER TABLE line ALTER COLUMN id RESTART WITH 87;
ALTER TABLE tone ALTER COLUMN id RESTART WITH 118;