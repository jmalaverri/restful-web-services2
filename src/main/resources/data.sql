--Table Structure

--create table user (
--	id integer not null,
--	birth_date timestamp,
--	name varchar(255),
--	primary key (id)
--)

-- Do not use double quotes
insert into user values (10001, sysdate(), 'AB');
insert into user values (10002, sysdate(), 'Jill');
insert into user values (10003, sysdate(), 'Jam');
insert into post values (11001, 'My First Post', 10001);
insert into post values (11002, 'My Second Post', 10001);
