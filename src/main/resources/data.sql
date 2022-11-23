INSERT INTO tb_juiz (id_juiz, nome) VALUES (1, 'Lelio Bentes Corrêa');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (2, 'Aloysio Silva Corrêa da Veiga');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (3, 'Dora Maria da Costa');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (4, 'Ives Gandra da Silva Martins Filho');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (5, 'Maria Cristina Irigoyen Peduzzi');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (6, 'Luiz Philippe Vieira de Mello Filho');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (7, 'Guilherme Augusto Caputo Bastos');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (8, 'Mauricio José Godinho Delgado');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (9, 'Kátia Magalhães Arruda');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (10, 'Augusto César Leite de Carvalho');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (11, 'José Roberto Freire Pimenta');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (12, 'Delaíde Alves Miranda Arantes');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (13, 'Hugo Carlos Scheuermann');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (14, 'Alexandre de Souza Agra Belmonte');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (15, 'Cláudio Mascarenhas Brandão');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (16, 'Douglas Alencar Rodrigues');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (17, 'Maria Helena Mallmann');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (18, 'Breno Medeiros');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (19, 'Alexandre Luiz Ramos');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (20, 'Luiz José Dezena da Silva');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (21, 'Evandro Pereira Valadão Lopes');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (22, 'Amaury Rodrigues Pinto Junior');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (23, 'Alberto Bastos Balazeiro');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (24, 'Morgana de Almeid_juiza Richa');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (25, 'Sergio Pinto Martins');
INSERT INTO tb_juiz (id_juiz, nome) VALUES (26, 'Margareth Rodrigues Costa');                   -- Desembargadora
INSERT INTO tb_juiz (id_juiz, nome) VALUES (27, 'José Pedro de Camargo Rodrigues de Souza');    -- Desembargador
INSERT INTO tb_juiz (id_juiz, nome) VALUES (28, 'João Pedro Silvestrin');                       -- Desembargador

INSERT INTO tb_orgao (id_orgao, nome, presidente_id_juiz) VALUES (1, 'Tribunal Pleno', 1);
INSERT INTO tb_orgao (id_orgao, nome, presidente_id_juiz) VALUES (2, 'Orgão Especial', 1);
INSERT INTO tb_orgao (id_orgao, nome, presidente_id_juiz) VALUES (3, 'Seção Especializada em Dissídios Coletivos', 1);
INSERT INTO tb_orgao (id_orgao, nome, presidente_id_juiz) VALUES (4, 'Subseção I da Seção Especializada em Dissídios Individuais', 1);
INSERT INTO tb_orgao (id_orgao, nome, presidente_id_juiz) VALUES (5, 'Subseção II da Seção Especializada em Dissídios Individuais', 1);
INSERT INTO tb_orgao (id_orgao, nome, presidente_id_juiz) VALUES (6, 'Primeira Turma', 13);
INSERT INTO tb_orgao (id_orgao, nome, presidente_id_juiz) VALUES (7, 'Segunda Turma', 17);
INSERT INTO tb_orgao (id_orgao, nome, presidente_id_juiz) VALUES (8, 'Terceira Turma', 8);
INSERT INTO tb_orgao (id_orgao, nome, presidente_id_juiz) VALUES (9, 'Quarta Turma', 4);
INSERT INTO tb_orgao (id_orgao, nome, presidente_id_juiz) VALUES (10, 'Quinta Turma', 18);
INSERT INTO tb_orgao (id_orgao, nome, presidente_id_juiz) VALUES (11, 'Sexta Turma', 9);
INSERT INTO tb_orgao (id_orgao, nome, presidente_id_juiz) VALUES (12, 'Sétima Turma', 15);
INSERT INTO tb_orgao (id_orgao, nome, presidente_id_juiz) VALUES (13, 'Oitava Turma', 7);

INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 1);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 2);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 3);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 4);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 5);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 6);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 7);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 8);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 9);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 10);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 11);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 12);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 13);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 14);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 15);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 16);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 17);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 18);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 19);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 20);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 21);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 22);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 23);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 24);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (1, 25);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (2, 1);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (2, 2);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (2, 3);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (2, 4);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (2, 5);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (2, 6);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (2, 7);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (2, 17);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (2, 18);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (2, 19);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (2, 20);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (2, 21);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (2, 22);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (2, 23);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (3, 1);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (3, 2);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (3, 3);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (3, 4);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (3, 6);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (3, 8);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (3, 12);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (3, 14);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (4, 1);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (4, 2);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (4, 3);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (4, 5);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (4, 7);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (4, 9);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (4, 10);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (4, 11);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (4, 13);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (4, 15);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (4, 17);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (4, 18);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (4, 19);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (5, 1);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (5, 2);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (5, 3);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (5, 16);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (5, 20);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (5, 21);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (5, 22);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (5, 23);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (5, 24);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (5, 25);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (6, 13);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (6, 20);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (6, 22);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (7, 6);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (7, 17);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (7, 25);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (7, 26);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (8, 8);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (8, 11);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (8, 23);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (9, 4);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (9, 5);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (9, 19);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (10, 16);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (10, 18);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (10, 24);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (11, 9);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (11, 10);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (11, 27);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (12, 14);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (12, 15);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (12, 21);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (13, 7);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (13, 12);
INSERT INTO tb_orgaos_juizes (id_orgao, id_juiz) VALUES (13, 28);
