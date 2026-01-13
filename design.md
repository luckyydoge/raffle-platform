# 设计文档

## 奖品计算（strategy）

### 表设计

```mermaid
erDiagram
    draw_strategy {
        int id pk
        int strategy_id unique
        varchar(255) name
    }

    prize_item {
        int id pk
        int item_id unique
        int strategy_id
        varchar(255) name
        decimal(7, 6) probability
    }

    draw_scheme ||--|{ prize_item
```

### 数据结构

strategy id - 概率表 - 具体奖品

### 算法

### 流程图

```mermaid
flowchart TD

start(接收strategy id) --> check_table{查询概率表是否存在}
check_table --> |yes| caculate
check_table --> |no| check_id{查询strategy id是否存在}
check_id --> |yes| generate_table[查询奖品并生成概率表]
check_id --> |no| fail(返回错误)
generate_table --> save[保存概率表]
save --> caculate[计算奖品]
caculate --> success(返回奖品id)
```

#### 哈希表（o(1)）

#### 范围（o(lgn)）

## 奖品扣减（award）
