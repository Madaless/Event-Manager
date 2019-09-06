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

create table todo_item
(
    id bigint not null
        constraint todo_item_pkey
            primary key,
    content varchar(255),
    is_done boolean,
    is_predef boolean,
    todo_item_id bigint
        constraint fk6xdxva6csa8h3cuwv7om3cg58
            references event
);

alter table todo_item owner to postgres;

create table todo_predef_list
(
    id bigint not null
        constraint todo_predef_list_pkey
            primary key,
    name varchar(255)
);

alter table todo_predef_list owner to postgres;

create table todo_item_pre
(
    id bigint not null
        constraint todo_item_pre_pkey
            primary key,
    content varchar(255),
    todo_predef_list_id bigint
        constraint fk3iebds1qxeprw1u840hbdpkyw
            references todo_predef_list
);

alter table todo_item_pre owner to postgres;

