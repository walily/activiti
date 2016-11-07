# 暂时没用
CREATE DATABASE activiti CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';

use activiti;

drop table if exists OA_LEAVE;

create table OA_LEAVE
(
  ID                   int  AUTO_INCREMENT,
  PROCESS_INSTANCE_ID  VARCHAR(64),
  USER_ID              VARCHAR(20)   not null,
  START_TIME           TIMESTAMP      not null,
  END_TIME             TIMESTAMP      not null,
  LEAVE_TYPE           VARCHAR(20),
  REASON               VARCHAR(2000),
  APPLY_TIME           TIMESTAMP      not null,
  REALITY_START_TIME   TIMESTAMP,
  REALITY_END_TIME     TIMESTAMP,
  constraint PK_OA_LEAVE primary key (ID)
);