create table if not exists event
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

create table if not exists todo_item
(
    id bigint not null
        constraint todo_item_pkey
            primary key,
    content varchar(255),
    is_done boolean,
    type varchar(255),
    to_do_item_id bigint
        constraint fkr7u1tjrvqnmb25hgeggovoh76
            references event
);

alter table todo_item owner to postgres;

create table if not exists todo_item_pre
(
    id bigint not null
        constraint todo_item_pre_pkey
            primary key,
    content varchar(255)
);

alter table todo_item_pre owner to postgres;

create table if not exists to_do_predef_list
(
    id bigint not null
        constraint to_do_predef_list_pkey
            primary key,
    name varchar(255)
);

alter table to_do_predef_list owner to postgres;

