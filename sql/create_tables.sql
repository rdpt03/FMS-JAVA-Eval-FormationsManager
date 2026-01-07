/*Table client*/
CREATE TABLE f_client(
   c_id INT AUTO_INCREMENT,
   c_first_name VARCHAR(50),
   c_last_name VARCHAR(50),
   c_email VARCHAR(50),
   c_address VARCHAR(50),
   c_phone_num VARCHAR(50),
   CONSTRAINT pk_client PRIMARY KEY(c_id)
);

/*Table user*/
CREATE TABLE f_user(
   u_id INT AUTO_INCREMENT,
   u_username VARCHAR(50),
   u_password VARCHAR(50),
   u_client_id INT NOT NULL,
   CONSTRAINT pk_user PRIMARY KEY(u_id),
   CONSTRAINT fk_user_client FOREIGN KEY(u_client_id) REFERENCES f_client(c_id)
);

/*Table Training*/
CREATE TABLE f_training(
   t_id INT AUTO_INCREMENT,
   t_summary VARCHAR(50),
   t_name VARCHAR(50),
   t_duration INT,
   t_is_in_person BOOLEAN,
   t_is_remotely BOOLEAN,
   t_price DECIMAL(15,2),
   CONSTRAINT pk_training PRIMARY KEY(t_id)
);

/*Table Order*/
CREATE TABLE f_cart(
   cart_id INT AUTO_INCREMENT,
   c_user_id INT NOT NULL, 
   CONSTRAINT pk_cart PRIMARY KEY(cart_id),
   CONSTRAINT fk_cart_user FOREIGN KEY(c_user_id) REFERENCES f_user(u_id)  
);

/*Connection table cart training*/
CREATE TABLE f_cart_have_training(
    ct_id INT AUTO_INCREMENT,
    cart_id INT,
    t_id INT,
    CONSTRAINT pk_ct PRIMARY KEY(ct_id),
    CONSTRAINT fk_ct_c FOREIGN KEY(cart_id) REFERENCES f_cart(cart_id),
    CONSTRAINT fk_ct_t FOREIGN KEY(t_id) REFERENCES f_training(t_id)
);

/*table order*/
CREATE TABLE f_order(
    o_id INT AUTO_INCREMENT,
    o_date DATE,
    u_id INT,
    c_id INT,
    CONSTRAINT pk_order PRIMARY KEY(o_id),
    CONSTRAINT fk_order_client FOREIGN KEY(u_id) REFERENCES f_user(u_id),
    CONSTRAINT fk_order_user FOREIGN KEY(c_id) REFERENCES f_client(c_id)
);

/*Connection table user training*/
CREATE TABLE f_user_have_training(
   ut_id INT AUTO_INCREMENT,
   t_id INT,
   o_id INT,
   CONSTRAINT pk_user_have_training PRIMARY KEY(ut_id),
   CONSTRAINT fk_ut_t FOREIGN KEY(t_id) REFERENCES f_training(t_id),
   CONSTRAINT fk_ut_u FOREIGN KEY(o_id) REFERENCES f_order(o_id)
);
