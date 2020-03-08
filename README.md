# community

## 项目简介
 - 该项目是基于SpringBoot开发的在线论坛聊天系统。实现了用户管理，发帖，读帖，回复，点赞，搜索，私信等功能。
 - 本项目的主要目的是用于个人学习后端框架以及目前常用的中间件技术，如NoSQL，消息队列，搜索引擎等。

## 项目亮点
 - 对帖子以及其标题，和回复等用户公开发布的信息使用了前缀树进行关键词屏蔽。
 - 分别使用HyperLogLog与位图统计独立访客数和日活跃用户，节省了空间的同时保证了高精确度。
 - 使用ElasticSearch作为搜索引擎，利用其倒排索引的存储结构大幅度加快了搜索效率。
 - 对于某些频繁请求如点赞，关注等，利用Kafka将其改为异步事件防止数据库崩溃。
 - 将热门帖子存入本地缓存，大幅度提高了用户查看热帖的速度，在JMeter压力测试中吞吐量提高约20倍。