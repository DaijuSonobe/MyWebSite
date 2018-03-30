CREATE DATABASE bfm_db DEFAULT CHARACTER SET utf8;
USE bfm_db;
CREATE TABLE user ( 
  id SERIAL
  , login_id varchar (50) UNIQUE NOT NULL
  , family_name_kanji varchar (50) NOT NULL
  , first_name_kanji varchar (50) NOT NULL
  , family_name_kana varchar (50) NOT NULL
  , first_name_kana varchar (50) NOT NULL
  , nickname varchar (10) NOT NULL
  , zip_code varchar (10) NOT NULL
  , address varchar (100) NOT NULL
  , birth_date DATE NOT NULL
  , mail_address varchar (50) NOT NULL
  , password varchar (100) NOT NULL
  , create_date DATETIME NOT NULL
  , update_date DATETIME NOT NULL
  , user_image varchar (50)
  , comment text
); 
CREATE TABLE buy (id SERIAL, user_id varchar(50) NOT NULL, item_id int UNIQUE NOT NULL);
CREATE TABLE main_category (id SERIAL, name varchar(50) NOT NULL);
CREATE TABLE sub_category (id SERIAL, category_id int NOT NULL, name varchar(50) NOT NULL);
CREATE TABLE size (id SERIAL, size varchar(10) NOT NULL);
CREATE TABLE status (id SERIAL, status varchar(10) NOT NULL);
CREATE TABLE delivery_defrayment (id SERIAL, delivery_defrayment varchar(20) NOT NULL);
CREATE TABLE delivery_method (id SERIAL, delivery_method varchar(20) NOT NULL);
CREATE TABLE days_to_shipping (id SERIAL, days_to_shipping varchar(20) NOT NULL);
DROP TABLE buy;
CREATE TABLE buy (id SERIAL, user_id int NOT NULL, item_id int UNIQUE NOT NULL);

CREATE TABLE favorite (id SERIAL, user_id int NOT NULL, item_id int NOT NULL);

CREATE TABLE item( 
  id SERIAL
  , user_id int NOT NULL
  , user_image_1 varchar (50)
  , user_image_2 varchar (50)
  , user_image_3 varchar (50)
  , name varchar (50) NOT NULL
  , price int NOT NULL
  , category int NOT NULL
  , size int NOT NULL
  , status int NOT NULL
  , delivery_defrayment int NOT NULL
  , delivery_method int NOT NULL
  , delivery_cost int NOT NULL
  , days_to_shipping int NOT NULL
  , comment text NOT NULL
); 


