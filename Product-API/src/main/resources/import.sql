-- Inserção de categorias
INSERT INTO tb_category (name) VALUES ('Eletrônicos');
INSERT INTO tb_category (name) VALUES ('Roupas');
INSERT INTO tb_category (name) VALUES ('Livros');
INSERT INTO tb_category (name) VALUES ('Computadores');
INSERT INTO tb_category (name) VALUES ('Calçados');
INSERT INTO tb_category (name) VALUES ('Música');
INSERT INTO tb_category (name) VALUES ('Acessórios Eletrônicos');
INSERT INTO tb_category (name) VALUES ('Casacos');
INSERT INTO tb_category (name) VALUES ('Instrumentos Musicais');

-- Inserção de produtos
INSERT INTO tb_product (name, description, img_url, created_at, quantity) VALUES ('Smartphone', 'Um smartphone avançado com câmera de alta resolução', 'url_da_imagem', '2024-01-23T12:00:00Z', 100);
INSERT INTO tb_product (name, description, img_url, created_at, quantity) VALUES ('Camiseta', 'Uma camiseta confortável e estilosa', 'url_da_imagem', '2024-01-23T12:30:00Z', 50);
INSERT INTO tb_product (name, description, img_url, created_at, quantity) VALUES ('Livro Fantasia', 'Uma emocionante aventura de fantasia', 'url_da_imagem', '2024-01-23T13:00:00Z', 20);
INSERT INTO tb_product (name, description, img_url, created_at, quantity) VALUES ('Laptop', 'Um poderoso laptop para produtividade', 'url_da_imagem', '2024-01-24T10:00:00Z', 30);
INSERT INTO tb_product (name, description, img_url, created_at, quantity) VALUES ('Tênis esportivo', 'Um tênis confortável para atividades esportivas', 'url_da_imagem', '2024-01-24T11:30:00Z', 40);
INSERT INTO tb_product (name, description, img_url, created_at, quantity) VALUES ('Álbum Clássico', 'Uma coleção de músicas clássicas', 'url_da_imagem', '2024-01-24T13:00:00Z', 15);
INSERT INTO tb_product (name, description, img_url, created_at, quantity) VALUES ('Fones de Ouvido Bluetooth', 'Fones sem fio com cancelamento de ruído', 'url_da_imagem', '2024-01-25T09:30:00Z', 25);
INSERT INTO tb_product (name, description, img_url, created_at, quantity) VALUES ('Jaqueta de Inverno', 'Uma jaqueta quente e elegante para o inverno', 'url_da_imagem', '2024-01-25T11:00:00Z', 35);
INSERT INTO tb_product (name, description, img_url, created_at, quantity) VALUES ('Teclado Digital', 'Um teclado musical para artistas e músicos', 'url_da_imagem', '2024-01-25T14:00:00Z', 10);

-- Associação de produto à categoria
INSERT INTO tb_product_category (product_id, category_id) VALUES (3, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (4, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (5, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (6, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (7, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (8, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (9, 3);
