create table if not exists T_USER (
`id` varchar(36) not null,
`username` varchar(36),
`age` integer,
`password` varchar(128),
`deleted` varchar(6) default "NO",
`creator` varchar(36),
`created` datetime,
`updater` varchar(36),
`updated` datetime,
primary key (`id`)
);