/*
Enterprise��
*/
create table if not exists enterprise (
		id int unsigned not null auto_increment, 
    username varchar(20) not null,
    password varchar(16) not null,
    contact_person_name varchar(20) not null,
    department tinyint unsigned not null,
    phone_number varchar(20) not null,
    cellphone_number varchar(12) null,
    email varchar(50) not null,
    company_name varchar(40) not null,
    company_province tinyint unsigned not null,
    company_city tinyint unsigned not null,
    company_district tinyint unsigned not null,
    company_address varchar(50) not null,
    purchase_type varchar(20) not null,
    company_website varchar(80) null,
    number_of_employees tinyint unsigned null,
    company_industry tinyint unsigned null,
    company_type tinyint unsigned null,
    subscribe char(1) null,
    primary key (id)) 
    CHARACTER SET utf8 COLLATE utf8_bin
comment='Enterprise User';


/*
Person��
*/
create table if not exists person (
		id int unsigned not null auto_increment, 
    username varchar(20) not null,
    password varchar(16) not null,
    email varchar(50) not null,
    recommended_by varchar(20) null,
    subscribe char(1) null,
    primary key (id)) 
    CHARACTER SET utf8 COLLATE utf8_bin
comment='Person User';
/*
Student��
*/
create table if not exists student (
		id int unsigned not null auto_increment, 
    username varchar(20) not null,
    password varchar(16) not null,
    email varchar(50) not null,
    recommended_by varchar(20) null,
    school_Id int unsigned not null,
    subscribe char(1) null,
    primary key (id)) 
    CHARACTER SET utf8 COLLATE utf8_bin
comment='Student User';