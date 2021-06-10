login : m3alem 
password :123
___________

create sequence ID_PERSONNE START WITH 1 INCREMENT BY 1;

______________________________

create table profession
(
	id_profession varchar2(20) primary key,
	nom_profession varchar2(50)
);

_______________

create table personne (
	id_personne number(10) primary key,
	nom varchar2(25) NOT NULL,
	prenom varchar2(25) NOT NULL,
	datenaissance date NOT NULL,
	bio varchar2(1000),
	adresse varchar2(500) NOT NULL,
	ville varchar2(20) NOT NULL,
	tel varchar2(20) NOT NULL,
	email varchar2(30)  NOT NULL UNIQUE,
	password varchar2(100) NOT NULL,
	experience varchar2(20) NOT NULL,
	id_profession varchar2(20) NOT NULL,

	constraint fk_id_profession foreign key (id_profession) references profession(id_profession) on delete cascade	
);


________________


insert into profession values ('P01','Bricolage et Petits travaux');
insert into profession values ('P02','Plomberie');
insert into profession values ('P03','Peinture');
insert into profession values ('P04','Électricité');
insert into profession values ('P05','Menuiserie');
insert into profession values ('P06','Climatisation-Chauffage');
insert into profession values ('P07','Maçonnerie');
insert into profession values ('P08','Mécanique');
insert into profession values ('P09','Femmes de ménages');
insert into profession values ('P10','Jardinier');
insert into profession values ('P11','Entretien piscine');
insert into profession values ('P12','Réparation électroménager');
insert into profession values ('P13','Réparation matériels électroniques');
insert into profession values ('P14','Installation parabole');

______________________________


insert into personne values(ID_PERSONNE.nextval,'Touhami','Abdelwahed',to_date('1982-12-22','yyyy-mm-dd'),'Bonjour je suis Abdo de casa plombier avec une experience de 15 ans','Inara Rue 306 N 15','casablanca','0612457896','touhami-abdel@gmail.com','123456','Entre 7 et 10 ans','P02')
insert into personne values(ID_PERSONNE.nextval,'Deghoughi','Morad',to_date('1967-01-12','yyyy-mm-dd'),'Salut a tous je m''appel morad je suis disponible 24/7 sur casa','Lot 28 Zone Industrielle Takadoum Takadoum','casablanca','0622145639','deghoughi1967@gmail.com','degoughi123','Plus de 10 ans','P02')
insert into personne values(ID_PERSONNE.nextval,'Lmoussaoui','Karim',to_date('1989-02-15','yyyy-mm-dd'),'Ma biographie est encore vide.','40 rue Omar Riffi Grand Casablanca','casablanca','0612336478','Lmoussaoui-kiko@gmail.com','k12345','Entre 4 et 7 ans','P02')
insert into personne values(ID_PERSONNE.nextval,'Joudar','Abdelkader',to_date('1981-07-24','yyyy-mm-dd'),'Joudar abdelkader men casa plombi marhba bel jami3','4 Angle Boulevard Sakia El Hamra Et Rue Numero 134 Centre Ville','casablanca','0655362147','alexis-joudar@gmail.com','ja987654321','Entre 7 et 10 ans','P02')	
insert into personne values(ID_PERSONNE.nextval,'Aymane','Khalil',to_date('1999-06-14','yyyy-mm-dd'),'Ma biographie est encore vide.','2 mars Numero 332 Ain Chock','casablanca','0622336647','aymanou-123@gmail.com','123456789','Entre 4 et 7 ans','P02')	