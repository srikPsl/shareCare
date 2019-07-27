--create schema app;

/*create table app.users(
   id INT NOT NULL, 
   user_name VARCHAR(50) NOT NULL, 
   locality VARCHAR(20) NOT NULL
) ;*/ 

INSERT INTO app.users ( user_name, locality) VALUES ("Shravan", "Hyderabad");

INSERT INTO app.users (user_name, locality) VALUES ( "Srikanth", "Hyderabad");

INSERT INTO app.users (user_name, locality) VALUES ("Prashanth", "Bangalore");

INSERT INTO app.users (user_name, locality) VALUES ("Sai", "Bangalore");

