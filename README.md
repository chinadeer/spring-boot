简单实用的 spring-boot demo
====
# 1.springboot-session-redis
       spring boot session共享demo ,使用redis作为内存数据库<br>
       首先要安装redis<br>
           [redis windows安装url](https://github.com/ServiceStack/redis-windows "悬停显示")<br>
           客户端：可以使用redis-desktop-manager.exe<br>
# 2.springboot-dubbo-demo
       包含springboot-dubbo-provider  和 springboot-dubbo-consumer 两个工程
	   首先要安装[zookeeper](http://www.apache.org/dyn/closer.cgi/zookeeper/  "悬停显示"),
	   本例是在windows下安装的，直接修改zoo.cfg文件，启动 zkServer.exe即可；
	   eclipse可以安装zk的插件，查看zk的所有节点
	   
	   启动 ProviderApplication、ConsumerApplication，请求http://localhost:8090/user/ss<br>
	      请求体：{"name":"deer","id":"123"}
		  响应：success==>Hello deer!1234
       spring boot session共享demo ,使用redis作为内存数据库
