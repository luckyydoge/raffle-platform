create database if not exists raffle_platform_db
    character set utf8mb4
    collate utf8mb4_unicode_ci;

use raffle_platform_db;

drop table if exists `draw_strategy`;
create table if not exists `draw_strategy`
(
    `id`          int          not null auto_increment,
    `strategy_id` int          not null unique,
    `name`        varchar(255) not null,
    `create_time` timestamp default current_timestamp,
    `update_time` timestamp default current_timestamp on update current_timestamp,
    primary key (`id`)
) engine = InnoDB
  character set utf8mb4
  collate utf8mb4_unicode_ci;

drop table if exists `prize_item`;
create table if not exists `prize_item`
(
    `id`          int          not null auto_increment,
    `item_id`     int          not null,
    `strategy_id` int          not null,
    `name`        varchar(255) not null,
    `probability` decimal(7, 6) not null ,
    `create_time` timestamp default current_timestamp,
    `update_time` timestamp default current_timestamp on update current_timestamp,
    primary key (`id`)
) engine = InnoDB
  character set utf8mb4
  collate utf8mb4_unicode_ci;

-- -----------------------------------------------------------
-- 1. 插入抽奖策略测试数据 (draw_strategy)
-- -----------------------------------------------------------
INSERT INTO `draw_strategy` (`strategy_id`, `name`)
VALUES
    (10001, '新手引导抽奖'),
    (10002, '每日免费抽奖'),
    (10003, '付费限时抽奖');

-- -----------------------------------------------------------
-- 2. 插入奖品项测试数据 (prize_item)
-- -----------------------------------------------------------
-- 策略 ID 10001 的奖品配置：
INSERT INTO `prize_item` (`item_id`, `strategy_id`, `name`, `probability`)
VALUES
    (1, 10001, '一等奖：高级礼包', 0.000010),   -- 0.001% 概率
    (2, 10001, '二等奖：限定皮肤碎片', 0.000090), -- 0.009% 概率
    (3, 10001, '三等奖：金币*1000', 0.000900),    -- 0.09% 概率
    (4, 10001, '参与奖：小额代金券', 0.009000),   -- 0.9% 概率
    (5, 10001, '未中奖：谢谢参与', 0.990000);   -- 99% 概率

-- 策略 ID 10002 的奖品配置 (示例 - 更高的奖品概率)：
INSERT INTO `prize_item` (`item_id`, `strategy_id`, `name`, `probability`)
VALUES
    (6, 10002, '高级抽奖券*1', 0.050000),
    (7, 10002, '金币*50', 0.200000),
    (8, 10002, '积分*10', 0.750000);

-- 策略 ID 10003 的奖品配置 (示例 - 不同的权重)：
INSERT INTO `prize_item` (`item_id`, `strategy_id`, `name`, `probability`)
VALUES
    (9, 10003, 'SS 级角色卡', 0.000001),
    (10, 10003, 'S 级角色卡', 0.000009),
    (11, 10003, 'A 级角色卡', 0.000090),
    (12, 10003, 'B 级角色卡', 0.999890);