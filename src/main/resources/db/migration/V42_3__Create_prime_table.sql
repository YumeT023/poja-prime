create table if not exists prime
(
    id varchar
        constraint prime_table_pk primary key,
    value varchar not null,
    creation_datetime timestamp not null
);
