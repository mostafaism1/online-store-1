DROP TABLE IF EXISTS product;

CREATE TABLE product (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              name VARCHAR(50) NOT NULL,
                              description VARCHAR(250) NOT NULL
);

INSERT INTO product (name, description) VALUES
('product1', 'product1 description'),
('product2', 'product2 description');