CREATE TABLE city
(
    id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(55),
    country_id BIGINT(20),
    CONSTRAINT FK_m503bcpirmab9y40lg2ia9d54 FOREIGN KEY (country_id) REFERENCES country (id)
);
CREATE INDEX FK_m503bcpirmab9y40lg2ia9d54 ON city (country_id);
CREATE TABLE country
(
    id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(32)
);
CREATE TABLE orders
(
    id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    date DATE,
    time TIME,
    user_id BIGINT(20),
    CONSTRAINT FK_5o21t3sr1d00xjrras17vc723 FOREIGN KEY (user_id) REFERENCES user (id)
);
CREATE INDEX FK_5o21t3sr1d00xjrras17vc723 ON orders (user_id);
CREATE TABLE products
(
    id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    availability VARCHAR(255),
    description VARCHAR(255),
    name VARCHAR(32),
    price DOUBLE,
    weight DOUBLE,
    country_id BIGINT(20),
    orders_id BIGINT(20),
    size_id BIGINT(20),
    CONSTRAINT FK_1ifv57orpyh2te7r6ugqrwu57 FOREIGN KEY (size_id) REFERENCES size (id),
    CONSTRAINT FK_fg6d9lvfan6efgxhh9ol61d9o FOREIGN KEY (country_id) REFERENCES country (id),
    CONSTRAINT FK_pu1gx59og5ee520ry2dmu4ulb FOREIGN KEY (orders_id) REFERENCES orders (id)
);
CREATE INDEX FK_1ifv57orpyh2te7r6ugqrwu57 ON products (size_id);
CREATE INDEX FK_fg6d9lvfan6efgxhh9ol61d9o ON products (country_id);
CREATE INDEX FK_pu1gx59og5ee520ry2dmu4ulb ON products (orders_id);
CREATE TABLE size
(
    id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    capacity INT(11),
    height DOUBLE,
    length DOUBLE,
    width DOUBLE
);
CREATE TABLE user
(
    id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    birthDate DATETIME,
    email VARCHAR(20),
    firstName VARCHAR(32),
    lastName VARCHAR(32),
    phoneNumber VARCHAR(16),
    sexEnum VARCHAR(255),
    city_id BIGINT(20),
    CONSTRAINT FK_8yvso5b5bqpnhyj4mg86a6dcw FOREIGN KEY (city_id) REFERENCES city (id)
);
CREATE INDEX FK_8yvso5b5bqpnhyj4mg86a6dcw ON user (city_id);