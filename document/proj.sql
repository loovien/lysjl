create database if not exists shangjialian;
-- user table
create table if not exists  user (
	id int unsigned primary key auto_increment,
	name varchar(32) not null default '' comment '用户名称',
	mobile varchar(16) not null default '' comment '用户手机',
	expired_at datetime not null comment '用户过期时间',
	created_at datetime not null default CURRENT_TIMESTAMP,
	updated_at datetime NULL,
	deleted_at datetime NULL,
	key index_expired_at (expired_at),
	key index_created_at (created_at),
	key index_updated_at (updated_at),
	key index_deleted_at (deleted_at)

) engine innodb charset utf8;