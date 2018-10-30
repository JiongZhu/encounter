# encounter

**数据库系统概论实习**

##### 概述

零件交易中心管理系统主要提供顾客和供应商之间完成零件交易的功能，其中包括供应商信息、顾客信息以及零件信息。供应商信息包括供应商号、供应商名、地址、电话、简介；顾客信息包括顾客号、顾客名、地址、电话；零件信息包括零件号、零件名、重量、颜色、简介等。此系统可以让供应商增加、删除和修改所提供的零件产品，还可以让顾客增加、删除和修改所需求的零件。交易员可以利用顾客提出的需求信息和供应商提出的供应信息来提出交易的建议，由供应商和顾客进行确认后即完成交易。

##### 环境配置

开发环境：JDK：1.8.0_172                             数据库：Mysql：5.7

构建工具：Gradle：4.8                                   框架：SpringBoot：2.0.2

缓存：Redis：4.0.10                      		权限管理：shiro

日志管理：Log4j2                                          数据库连接池：Druid

视图模板：Freemarker                                    前端框架：Bootstrap3

版本管理：Git                                                持续集成：Jenkins

##### 系统实现

数据流图

![数据流图](http://otmfpj0s2.bkt.clouddn.com/encounter/1.png)

数据库设计

![数据库设计](http://otmfpj0s2.bkt.clouddn.com/encounter/2.png)

登录界面

![登录界面](http://otmfpj0s2.bkt.clouddn.com/encounter/3.png)

管理员主界面

![管理员主界面](http://otmfpj0s2.bkt.clouddn.com/encounter/4.png)

供应商供应信息

![供应商信息](http://otmfpj0s2.bkt.clouddn.com/encounter/5.png)

零件信息

![零件信息](http://otmfpj0s2.bkt.clouddn.com/encounter/6.png)

交易员主界面

![交易员主界面](http://otmfpj0s2.bkt.clouddn.com/encounter/7.png)

