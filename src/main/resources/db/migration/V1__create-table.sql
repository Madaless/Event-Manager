create table event
(
    id bigint not null
        constraint event_pkey
            primary key,
    location varchar(255),
    creation_date timestamp,
    description varchar(255),
    hour varchar(255),
    name varchar(255),
    string_date varchar(255)
);

alter table event owner to postgres;

create table to_do_adicional
(
    id bigint not null
        constraint to_do_adicional_pkey
            primary key,
    name varchar(255),
    to_do_adicional_id bigint
        constraint fktocoabs8wudntqreext7d3gp9
            references event
);

alter table to_do_adicional owner to postgres;

create table to_do_default
(
    id bigint not null
        constraint to_do_default_pkey
            primary key,
    name varchar(255),
    to_do_default_id bigint
        constraint fkiwpaxm5um3b8rt9gi6b8ty2tl
            references event
);

alter table to_do_default owner to postgres;

create table todo_item
(
    id bigint not null
        constraint todo_item_pkey
            primary key,
    content varchar(255),
    to_do_item_id bigint
        constraint fklyt7oob32k83roxk6n821tsga
            references to_do_adicional
);

alter table todo_item owner to postgres;

