CREATE TABLE public.contactos (
	id serial,
	email varchar(80) NOT NULL,
	nombre varchar(60) NOT NULL,
	apellido varchar(60) NOT NULL,
	idcompania int4 NOT NULL,
	idstatus smallint NOT NULL,
	CONSTRAINT contactos_pkey PRIMARY KEY (id)
);

CREATE TABLE public.compania (
	id serial,
	nombre varchar(120) NOT NULL,
	CONSTRAINT compania_pkey primary key(id)
);

CREATE TABLE public.status (
	id serial,
	nombre varchar(40) NOT NULL,
	CONSTRAINT status_pkey primary key(id)
);

select * from contactos c 

INSERT INTO status (nombre) VALUES
('Imported lead'),
('Not contacted'),
('Contacted'),
('Customer'),
('Closed (lost)');

INSERT INTO compania (nombre) VALUES
('Phillips Van Heusen Corp.'),
('Avaya Inc.'),
('Laboratory Corporation of America Holdings'),
('AutoZone, Inc.'),
('Linens ''n Things Inc.');

INSERT INTO contactos (email, nombre, apellido, idcompania, idstatus) VALUES
('eula.lane@jigrormo.ye', 'Eula', 'Lane', 8, 1),
('barry.rodriquez@zun.mm', 'Barry', 'Rodriquez', 7, 5),
('eugenia.selvi@capfad.vn', 'Eugenia', 'Selvi', 6, 3),
('alejandro.miles@dec.bn', 'Alejandro', 'Miles', 10, 3),
('cora.tesi@bivo.yt', 'Cora', 'Tesi', 6, 4),
('marguerite.ishii@judbilo.gn', 'Marguerite', 'Ishii', 10, 2),
('mildred.jacobs@joraf.wf', 'Mildred', 'Jacobs', 8, 1),
('gene.goodman@kem.tl', 'Gene', 'Goodman', 8, 5),
('lettie.bennett@odeter.bb', 'Lettie', 'Bennett', 6, 1),
('mabel.leach@lisohuje.vi', 'Mabel', 'Leach', 10, 2),
('jordan.miccinesi@duod.gy', 'Jordan', 'Miccinesi', 8, 3),
('marie.parkes@nowufpus.ph', 'Marie', 'Parkes', 7, 1),
('rose.gray@kagu.hr', 'Rose', 'Gray', 9, 4),
('garrett.stokes@fef.bg', 'Garrett', 'Stokes', 9, 3),
('barbara.matthieu@derwogi.jm', 'Barbara', 'Matthieu', 7, 5),
('jean.rhodes@wehovuce.gu', 'Jean', 'Rhodes', 7, 3),
('jack.romoli@zamum.bw', 'Jack', 'Romoli', 6, 4),
('pearl.holden@dunebuh.cr', 'Pearl', 'Holden', 8, 1),
('belle.montero@repiwid.si', 'Belle', 'Montero', 9, 5),
('olive.molina@razuppa.ga', 'Olive', 'Molina', 6, 2),
('minerva.todd@kulmenim.ad', 'Minerva', 'Todd', 9, 3),
('bobby.pearson@ib.kg', 'Bobby', 'Pearson', 9, 1),
('larry.ciappi@ba.lk', 'Larry', 'Ciappi', 10, 2),
('ronnie.salucci@tohhij.lv', 'Ronnie', 'Salucci', 9, 1),
('walter.grossi@tuvo.sa', 'Walter', 'Grossi', 9, 1),
('frances.koopmans@foga.tw', 'Frances', 'Koopmans', 7, 5),
('frances.fujimoto@uswuzzub.jp', 'Frances', 'Fujimoto', 6, 5),
('olivia.vidal@hivwerip.vc', 'Olivia', 'Vidal', 9, 2),
('edna.henry@gugusu.rw', 'Edna', 'Henry', 8, 4),
('lydia.brun@zedekak.md', 'Lydia', 'Brun', 7, 3),
('jay.blake@ral.mk', 'Jay', 'Blake', 10, 4),
('isabel.serafini@turuhu.bh', 'Isabel', 'Serafini', 10, 1),
('rebecca.carter@omjo.et', 'Rebecca', 'Carter', 8, 4),
('maurice.fabbrini@rig.bh', 'Maurice', 'Fabbrini', 9, 3),
('ollie.turnbull@sicewap.org', 'Ollie', 'Turnbull', 6, 1),
('jerry.hopkins@fo.mh', 'Jerry', 'Hopkins', 9, 5),
('nora.lyons@gegijap.na', 'Nora', 'Lyons', 10, 1),
('anne.weis@kuvesa.pe', 'Anne', 'Weis', 7, 4),
('louise.gauthier@lapahu.mt', 'Louise', 'Gauthier', 6, 2),
('lloyd.fani@zev.ru', 'Lloyd', 'Fani', 8, 1),
('maud.dunn@nabeaga.ni', 'Maud', 'Dunn', 6, 1),
('henry.gigli@kaot.ps', 'Henry', 'Gigli', 6, 5),
('virgie.werner@tawuctuj.cf', 'Virgie', 'Werner', 10, 4),
('gregory.cozzi@eh.ru', 'Gregory', 'Cozzi', 8, 2),
('lucinda.gil@fajjusuz.kr', 'Lucinda', 'Gil', 7, 5),
('gertrude.verbeek@pave.cc', 'Gertrude', 'Verbeek', 6, 5),
('mattie.graham@ispaviw.gt', 'Mattie', 'Graham', 7, 2),
('bryan.shaw@ha.ee', 'Bryan', 'Shaw', 9, 1),
('essie.adams@iliat.cw', 'Essie', 'Adams', 8, 5),
('gary.osborne@do.ga', 'Gary', 'Osborne', 7, 5);