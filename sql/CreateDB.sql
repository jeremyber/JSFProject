------------------------
--DROP TABLES IN ORDER--
------------------------

drop table project.Cart;
drop table project.Listings;
drop table project.Properties;
drop table project.Login;
drop table project.Users;
drop table project.Schedule;


------------------------
--ADD PROPERTIES TABLE--
------------------------

create table project.Users (
username        VARCHAR(32),
email           VARCHAR(64),
firstname       VARCHAR(32),
lastname        VARCHAR(32),
permissions     INTEGER,
PRIMARY KEY (username)
);

-- Insert into the table the following values
insert into project.Users values('bllim', 'bllimymymymy@ilstu.edu', 'billy', 'lim', 2); 
insert into project.Users values('bmsalm', 'bmsalm@ilstu.edu', 'brandon', 'salm', 1);  
insert into project.Users values('roholl', 'roholl@ilstu.edu', 'roberto', 'hollentain', 2); 
insert into project.Users values('jdber', 'jdber@ilstu.edu', 'Jeremy', 'Ber', 1);


-------------------
--ADD LOGIN TABLE--
-------------------

create table project.Login (
username        VARCHAR(32),
password        VARCHAR(32),
securityq       VARCHAR(64),
securitya       VARCHAR(64),

FOREIGN KEY (username) REFERENCES project.Users
);

-- Insert into the table the following values
insert into project.Login values('bllim', 'bbb', 
'what subject is this class', 'it353'); 
insert into project.Login values('bmsalm', 'buddy', 
'what is your major', 'computer science'); 
insert into project.Login values('roholl', '12345', 
'what is your major', 'trollology'); 
insert into project.Login values('jdber', 'jeremy',
'what is your name', 'jeremy');


------------------------
--ADD PROPERTIES TABLE--
------------------------

create table project.Properties (
    propertyID          INT not null primary key
                        GENERATED ALWAYS AS IDENTITY
                        (START WITH 0, INCREMENT BY 1),
    ownerID             VARCHAR(32), 
    propertyName        VARCHAR(64),
    propertySize        VARCHAR(8),
    croppingSize        VARCHAR(8),
    zoningType          VARCHAR(32),
    buildings           VARCHAR(128),
    soilTypes           VARCHAR(128),
    avgProductivity     VARCHAR(128),
    legalDescription    VARCHAR(512),
    address             VARCHAR(64),
    county              VARCHAR(64),
    city                VARCHAR(64),
    state               VARCHAR(32),
    zipcode             VARCHAR(16),
    pictureURL          VARCHAR(512),
    

    --PRIMARY KEY (propertyID),
    FOREIGN KEY (ownerID) REFERENCES project.Users(username)
);

--test data
insert into project.Properties values(DEFAULT, 'bmsalm', 'Reckamp Farm', 
'60', '58', 'Farming', '2 Barns, 1 House, Seperate Garage','Dresden, Fox Silt loam',
'116 based on Bulletin 811 UoI)', 'N/A', '1234 fake st.' , 'McClean', 'Normal', 'IL', '61761', '0.jpg');

insert into project.Properties values(DEFAULT, 'roholl', 'Green Thumb Farm', 
'85', '80', 'Farming', '3 Barns, 1 House, 1 Guest House, 2 Sheds','Fox Silt loam',
'119 based on Bulletin 811 UoI)', 'N/A', '1234 fake st.' ,'McHenry', 'Woodstock', 'IL', '60014', '1.jpg');

insert into project.Properties values(DEFAULT, 'jdber', 'Sunset Apartment Complex', 
'3', '0', 'Residential', '2 Buildings - 68 Units','N/A',
'N/A', 'N/A', '1234 fake st.' , 'McHenry', 'Crystal Lake', 'IL', '60014', '2.jpg');

insert into project.Properties values(DEFAULT, 'bllim', 'The Condo', 
'.75', '0', 'Residential', '1 unit','N/A',
'N/A', 'N/A', '1234 fake st.' , 'BlahBlah', 'Myrtle Beach', 'NC', '43686', '3.jpg');

--Zillow stuff
insert into project.Properties values(DEFAULT, 'bmsalm', 'Zillow Test 1', 
'1', '0', 'Residential', '1 unit', 'N/A', 'N/A', 'N/A', '800 N Fell Ave', 'Mclean', 'Normal', 'IL', '61761', '4.jpg');

insert into project.Properties values(DEFAULT, 'roholl', 'Zillow Test 2', 
'1', '0', 'Residential', '1 unit', 'N/A', 'N/A', 'N/A', '1120 Ogelthorpe Ave', 'Mclean', 'Normal', 'IL', '61761', '5.jpg');

insert into project.Properties values(DEFAULT, 'jdber', 'Zillow Test 3', 
'1', '0', 'Residential', '1 unit', 'N/A', 'N/A', 'N/A', '408 Alden Dr', 'Mclean', 'Normal', 'IL', '61761', '6.jpg');

insert into project.Properties values(DEFAULT, 'bllim', 'Zillow Test 4', 
'1', '0', 'Residential', '1 unit', 'N/A', 'N/A', 'N/A', '1621 Gregory St', 'Mclean', 'Normal', 'IL', '61761', '7.jpg');

----------------------
--ADD LISTINGS TABLE--
----------------------

create table project.Listings (
    listingID           INT not null primary key
                        GENERATED ALWAYS AS IDENTITY
                        (START WITH 0, INCREMENT BY 1),
    propertyID          INTEGER,
    ownerID             VARCHAR(32),
    title               VARCHAR(128),
    price               DECIMAL(9,2),
    tax                 DECIMAL(9,2),
    listingDate         TIMESTAMP,
    viewCount           INTEGER,
    
    --PRIMARY KEY (listingID),
    FOREIGN KEY (propertyID) REFERENCES project.Properties,
    FOREIGN KEY (ownerID) REFERENCES project.Users(username)
);

--test data
insert into project.Listings values(DEFAULT , 0, 'bmsalm',  
'SELLING: RECKAMP FARM, McCLean, IL', 14000.00, 10000.00, 
TIMESTAMP('2013-11-01 23:03:20'), 25);

insert into project.Listings values(DEFAULT , 1, 'roholl',  
'WTS: GREEN THUMB FARM - Woodstock IL', 12000.00, 15000.00, 
TIMESTAMP('2013-11-05 16:45:40'), 40);

insert into project.Listings values(DEFAULT , 2, 'roholl',  
'WTS: Sunset Apartment Complex - Crystal Lake IL', 150000.00, 20000.00, 
TIMESTAMP('2013-10-28 12:56:22'), 27);

insert into project.Listings values(DEFAULT , 3, 'bllim',  
'Beachside on the Alantic, Condo - Mrytle Beach, NC', 500000.00, 12000.00, 
TIMESTAMP('2013-11-05 16:45:40'), 32);

--extra
insert into project.Listings values(DEFAULT , 0, 'bmsalm',  
'POSTING 1', 14000.00, 10000.00, 
TIMESTAMP('2013-11-01 23:03:20'), 10);

insert into project.Listings values(DEFAULT , 1, 'roholl',  
'POSTING 2', 12000.00, 15000.00, 
TIMESTAMP('2013-11-05 16:45:40'), 11);

insert into project.Listings values(DEFAULT , 2, 'roholl',  
'POSTING 3', 150000.00, 20000.00, 
TIMESTAMP('2013-10-28 12:56:22'), 46);

insert into project.Listings values(DEFAULT , 3, 'bllim',  
'POSTING 4', 500000.00, 12000.00, 
TIMESTAMP('2013-11-05 16:45:40'), 33);

insert into project.Listings values(DEFAULT , 0, 'bmsalm',  
'POSTING 5', 14000.00, 10000.00, 
TIMESTAMP('2013-11-01 23:03:20'), 12);

insert into project.Listings values(DEFAULT , 1, 'roholl',  
'POSTING 6', 12000.00, 15000.00, 
TIMESTAMP('2013-11-05 16:45:40'), 61);

insert into project.Listings values(DEFAULT , 2, 'roholl',  
'POSTING 7', 150000.00, 20000.00, 
TIMESTAMP('2013-10-28 12:56:22'), 11);

insert into project.Listings values(DEFAULT , 3, 'bllim',  
'POSTING 8', 500000.00, 12000.00, 
TIMESTAMP('2013-11-05 16:45:40'), 35);

insert into project.Listings values(DEFAULT , 0, 'bmsalm',  
'POSTING 9', 14000.00, 10000.00, 
TIMESTAMP('2013-11-01 23:03:20'), 18);

insert into project.Listings values(DEFAULT , 1, 'roholl',  
'POSTING 10', 12000.00, 15000.00, 
TIMESTAMP('2013-11-05 16:45:40'), 0);

insert into project.Listings values(DEFAULT , 2, 'roholl',  
'POSTING 11', 150000.00, 20000.00, 
TIMESTAMP('2013-10-28 12:56:22'), 12);

insert into project.Listings values(DEFAULT , 3, 'bllim',  
'POSTING 12', 500000.00, 12000.00, 
TIMESTAMP('2013-11-05 16:45:40'), 16);


--zillow stuff
insert into project.Listings values(DEFAULT, 4, 'bllim', 
'Zillow Test 1', 400.00, 1200.00,
TIMESTAMP('2013-12-02 11:42:11'), 176);

insert into project.Listings values(DEFAULT, 5, 'bllim', 
'Zillow Test 2', 400.00, 1200.00,
TIMESTAMP('2013-12-02 11:42:11'), 108);

insert into project.Listings values(DEFAULT, 6, 'bllim', 
'Zillow Test 3', 400.00, 1200.00,
TIMESTAMP('2013-12-02 11:42:11'), 115);

insert into project.Listings values(DEFAULT, 7, 'bllim', 
'Zillow Test 4', 400.00, 1200.00,
TIMESTAMP('2013-12-02 11:42:11'), 203);


----------------------
--ADD SCHEDULE TABLE--
----------------------

create table project.Schedule (
id          INT not null primary key
            GENERATED ALWAYS AS IDENTITY
            (START WITH 0, INCREMENT BY 1),
timeslot    VARCHAR(32),
available   SMALLINT, 
groupname   VARCHAR(32)

);

Insert into project.Schedule Values(default, '9:00 to 9:30 a.m.', 1, '');
Insert into project.Schedule Values(default, '9:30 to 10:00 a.m.', 1, '');
Insert into project.Schedule Values(default, '10:00 to 10:30 a.m.', 1, '');
Insert into project.Schedule Values(default, '10:30 to 11:00 a.m.', 1, '');
Insert into project.Schedule Values(default, '11:00 to 11:30 a.m.', 1, '');
Insert into project.Schedule Values(default, '11:30 to 12:00 p.m.', 1, '');
Insert into project.Schedule Values(default, '12:00 to 12:30 p.m.', 1, '');
Insert into project.Schedule Values(default, '12:30 to 1:00 p.m.', 1, '');
Insert into project.Schedule Values(default, '1:00 to 1:30 p.m.', 1, '');
Insert into project.Schedule Values(default, '1:30 to 2:00 p.m.', 1, '');
Insert into project.Schedule Values(default, '2:00 to 2:30 p.m.', 1, '');
Insert into project.Schedule Values(default, '2:30 to 3:00 p.m.', 1, '');
Insert into project.Schedule Values(default, '3:00 to 3:30 p.m.', 1, '');
Insert into project.Schedule Values(default, '3:30 to 4:00 p.m.', 1, '');
Insert into project.Schedule Values(default, '4:00 to 4:30 p.m.', 1, '');
Insert into project.Schedule Values(default, '4:30 to 5:00 p.m.', 1, '');


---------------------------
--    Add Cart Table     --
---------------------------

create table project.Cart (
listingid       INT NOT NULL,
username        VARCHAR(32) NOT NULL,

CONSTRAINT pk_cartid primary key(listingid, username),

FOREIGN KEY (listingid) REFERENCES project.Listings on delete cascade,
FOREIGN KEY (username) REFERENCES project.Users

);


Insert into project.Cart Values(0, 'bllim');
Insert into project.Cart Values(1, 'bmsalm');
Insert into project.Cart Values(2, 'bmsalm');


