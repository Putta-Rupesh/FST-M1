--Activity 1 (create a salesman table)
drop table salesman;

create table salesman(
    salesman_id int primary key,
    salesman_name varchar(20) not null,
    salesman_city varchar(20),
    commission int);

Describe salesman;

-- Activity 2 ( insert data into table)
insert all
	into salesman values(1001,'Rupesh','Cherlopalli',15)
	into salesman values(1002,'Pradeep','Tirupati',20)
    into salesman values(1003,'Vishnu','Tirupati',25)
    into salesman values(1004,'Rajendra','Rajempeta',30)
    into salesman values(1005,'Giri','Leelamahal',35)
select 1 from dual;

Select * from salesman;

-- Activity 3 (Select statements)
select salesman_id,salesman_city from salesman;

Select * from salesman
where salesman_city='Tirupati';

select salesman_name,commission from salesman
where salesman_name ='Rupesh';

-- Activity4 (Alter & Update)
Alter table salesman ADD(grade int);

update salesman set grade =100;
select * from salesman;

-- Activity5
update salesman set grade = 200 where salesman_name ='Rupesh';
update salesman set grade = 300 where salesman_city ='Tirupati';
update salesman set salesman_name = 'Giri Prasad' where salesman_name ='Giri';
select * from salesman;
