-- Inserir Categorias
INSERT INTO tb_category (name) VALUES ('Electronics');
INSERT INTO tb_category (name) VALUES ('Clothing');
INSERT INTO tb_category (name) VALUES ('Home Appliances');
INSERT INTO tb_category (name) VALUES ('Books');
INSERT INTO tb_category (name) VALUES ('Sports');

-- Inserir Produtos
INSERT INTO tb_product (name, price, quantity, description, img_url, rate) VALUES ('Laptop', 1200.0, 10, 'High-performance laptop', 'laptop.jpg', 4.5);
INSERT INTO tb_product (name, price, quantity, description, img_url, rate) VALUES ('Smartphone', 800.0, 20, 'Feature-rich smartphone', 'smartphone.jpg', 4.2);
INSERT INTO tb_product (name, price, quantity, description, img_url, rate) VALUES ('LED TV', 1500.0, 15, '55-inch 4K Smart LED TV', 'tv.jpg', 4.8);
INSERT INTO tb_product (name, price, quantity, description, img_url, rate) VALUES ('Running Shoes', 80.0, 50, 'Comfortable running shoes', 'shoes.jpg', 4.0);
INSERT INTO tb_product (name, price, quantity, description, img_url, rate) VALUES ('Coffee Maker', 60.0, 30, 'Automatic coffee maker', 'coffee_maker.jpg', 4.3);
INSERT INTO tb_product (name, price, quantity, description, img_url, rate) VALUES ('Cookbook', 20.0, 100, 'Bestseller cookbook', 'cookbook.jpg', 4.6);
INSERT INTO tb_product (name, price, quantity, description, img_url, rate) VALUES ('Fitness Tracker', 40.0, 25, 'Activity and sleep tracker', 'tracker.jpg', 4.1);
INSERT INTO tb_product (name, price, quantity, description, img_url, rate) VALUES ('Winter Jacket', 120.0, 10, 'Warm and stylish winter jacket', 'jacket.jpg', 4.7);
INSERT INTO tb_product (name, price, quantity, description, img_url, rate) VALUES ('Gaming Mouse', 30.0, 40, 'High precision gaming mouse', 'mouse.jpg', 4.4);
INSERT INTO tb_product (name, price, quantity, description, img_url, rate) VALUES ('Portable Speaker', 50.0, 15, 'Bluetooth portable speaker', 'speaker.jpg', 4.2);

-- Relacionar Produtos com Categorias
INSERT INTO tb_product_category (product_id, category_id) VALUES (1, 1); -- Laptop - Electronics
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 1); -- Smartphone - Electronics
INSERT INTO tb_product_category (product_id, category_id) VALUES (3, 1); -- LED TV - Electronics
INSERT INTO tb_product_category (product_id, category_id) VALUES (4, 2); -- Running Shoes - Clothing
INSERT INTO tb_product_category (product_id, category_id) VALUES (5, 3); -- Coffee Maker - Home Appliances
INSERT INTO tb_product_category (product_id, category_id) VALUES (6, 4); -- Cookbook - Books
INSERT INTO tb_product_category (product_id, category_id) VALUES (7, 5); -- Fitness Tracker - Sports
INSERT INTO tb_product_category (product_id, category_id) VALUES (8, 2); -- Winter Jacket - Clothing
INSERT INTO tb_product_category (product_id, category_id) VALUES (9, 1); -- Gaming Mouse - Electronics
INSERT INTO tb_product_category (product_id, category_id) VALUES (10, 1); -- Portable Speaker - Electronics

-- Inserir Avaliações
INSERT INTO tb_rate (rate, text, product_id) VALUES (4.5, 'Excellent performance!', 1); -- Laptop
INSERT INTO tb_rate (rate, text, product_id) VALUES (4.2, 'Great features!', 2); -- Smartphone
INSERT INTO tb_rate (rate, text, product_id) VALUES (4.8, 'Awesome picture quality!', 3); -- LED TV
INSERT INTO tb_rate (rate, text, product_id) VALUES (4.0, 'Comfortable for running!', 4); -- Running Shoes
INSERT INTO tb_rate (rate, text, product_id) VALUES (4.3, 'Makes great coffee!', 5); -- Coffee Maker
INSERT INTO tb_rate (rate, text, product_id) VALUES (4.6, 'Amazing recipes!', 6); -- Cookbook
INSERT INTO tb_rate (rate, text, product_id) VALUES (4.1, 'Tracks well!', 7); -- Fitness Tracker
INSERT INTO tb_rate (rate, text, product_id) VALUES (4.7, 'Keeps me warm!', 8); -- Winter Jacket
INSERT INTO tb_rate (rate, text, product_id) VALUES (4.4, 'Precise movements!', 9); -- Gaming Mouse
INSERT INTO tb_rate (rate, text, product_id) VALUES (4.2, 'Clear sound!', 10); -- Portable Speaker
