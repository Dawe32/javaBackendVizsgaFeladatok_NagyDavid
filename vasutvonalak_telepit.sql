create database vasutvonalak;
use vasutvonalak;
create table vonal(
vonalszam int not null primary key,
startallomas varchar(30) not null,
celallomas varchar(30) not null,
tavolsag_km int not null,
alapar int not null);

insert into vonal values (2,'Budapest','Esztergom',53,1120);
insert into vonal values (35,'Kaposvár','Siófok',100,1860);
insert into vonal values (140,'Cegléd','Szeged',118,2200);
insert into vonal values (100,'Budapest','Nyíregyháza',270,5420);
insert into vonal values (82,'Hatvan','Szolnok',68,1300);
insert into vonal values (109,'Debrecen','Tiszalök',68,1300);
insert into vonal values (11,'Győr','Veszprém',79,1480);