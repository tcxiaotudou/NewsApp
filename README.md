简介：
---

本项目的主要内容是开发一个新闻客户端APP，具有通用新闻客户端APP的常用功能。拟开发出一个Web APP，采用前后端分离的思想，后端只提供接口，前端通过Ajax的方式请求相应数据，并进行展现，新闻数据通过爬虫从相应网站爬取用做测试。

> 前端：国产的MUI框架    
> 后端：Spring Boot + Spring data JPA

## 运行
项目分2部分，一个web端，一个server端。 
> 1.将server端的代码导入IDEA，在properties文件中配置好数据库信息。由于使用Spring data JPA，创建好数据库后，运行项目会自动建表。 

> 2.将web端的代码导入Hbuilder，运行指南见官方文档：http://dev.dcloud.net.cn/mui/getting-started/ 。

> 3.运行server端代码，运行web端代码。

效果
--

首页：

![img](https://github.com/tcxiaotudou/NewsApp/blob/master/Web/imgs/%E9%A6%96%E9%A1%B5.PNG)

新闻分类：

![img](https://github.com/tcxiaotudou/NewsApp/blob/master/Web/imgs/%E6%96%B0%E9%97%BB%E5%88%86%E7%B1%BB.PNG)

新闻详情：

![img](https://github.com/tcxiaotudou/NewsApp/blob/master/Web/imgs/%E6%96%B0%E9%97%BB%E8%AF%A6%E6%83%85.PNG)

评论：

![img](https://github.com/tcxiaotudou/NewsApp/blob/master/Web/imgs/%E8%AF%84%E8%AE%BA.PNG)

发现：

![img](https://github.com/tcxiaotudou/NewsApp/blob/master/Web/imgs/%E5%8F%91%E7%8E%B0.PNG)


登录注册：

![img](https://github.com/tcxiaotudou/NewsApp/blob/master/Web/imgs/%E7%99%BB%E5%BD%95.PNG)
