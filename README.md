# Hafu-Project
基于ssh框架的“饿死了么”项目网站

- **MainPage**
 ![Alt text](./.1504456001811.png)
- **QuickStart**
将/hafu_project/src/jdbc.properties中的
``` 
jdbc.url = jdbc:mysql:///hafu_db
jdbc.user = root
jdbc.password = qwer123
```
以及/hafu_project/src/hibernate.cfg.xml中的
``` xml
<property name="hibernate.connection.url">
	jdbc:mysql:///hafu_db
</property>
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">qwer123</property>
```
改为自己的数据库
数据库配置 见/hafu_project/database.md

- **功能说明**
现在已实现的功能有：注册登录、主页展示、获取德克士商店的商品内容、查看商品详细信息、添加至购物车并保存至后台、下单付款等操作
尚未实现的功能有：主页推荐算法、搜索模块、个人信息管理、各个商店内容获取、添加购物车时的异步刷新方式、订单以及付款信息的动态化

- **开发人员**
hafu小组
