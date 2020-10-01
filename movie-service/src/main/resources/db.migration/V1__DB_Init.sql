create table movie
(
    id          bigint not null auto_increment,
    name        varchar(255),
    category    varchar(255),
    description varchar(255),
    director    varchar(255),
    primary key (id)
);

insert into movie (id, name, category, description, director) values
( 1,  'The Shawshank Redemption', 'DRAMA', 'Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.', 'Frank Darabont'),
( 2, 'The Godfather', 'CRIME', 'The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.', 'Francis Ford Coppola'),
( 3, 'The Godfather: Part II', 'CRIME', 'The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.', 'Francis Ford Coppola'),
( 4, 'The Dark Knight', 'ACTION', 'When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.', 'Christopher Nolan'),
( 5, '12 Angry Men', 'CRIME', 'A jury holdout attempts to prevent a miscarriage of justice by forcing his colleagues to reconsider the evidence.', 'Sidney Lumet'),
( 6, 'Schindlers List', 'HISTORY', 'In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.', 'Steven Spielberg'),
( 7, 'The Lord of the Rings: The Return of the King', 'ADVENTURE', 'Gandalf and Aragorn lead the World of Men against Saurons army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.', 'Peter Jackson'),
( 8, 'Pulp Fiction', 'CRIME', 'The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.', 'Quentin Tarantino');