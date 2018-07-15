简介：
---

本项目的主要内容是开发一个新闻客户端APP，具有通用新闻客户端APP的常用功能。拟开发出一个Web APP，采用前后端分离的思想，后端只提供接口，前端通过Ajax的方式请求相应数据，并进行展现，新闻数据通过爬虫从相应网站爬取用做测试。且应用既能在IOS上运行，也能在Android上运行。

> IDE：Hbuilder + IDEA 
> 前端：国产的MUI框架    
> 后端：Spring Boot + Spring data JPA

## 运行
项目分2部分，一个web端，一个server端。 
> 1.将server端的代码导入IDEA，在properties文件中配置好数据库信息。由于使用Spring data JPA，创建好数据库后，运行项目会自动建表。 

> 2.将web端的代码导入Hbuilder，运行指南见官方文档：http://dev.dcloud.net.cn/mui/getting-started/ 。

> 3.运行server端代码，运行web端代码。

效果
--

详情见 https://blog.csdn.net/fciasth/article/details/80154860

