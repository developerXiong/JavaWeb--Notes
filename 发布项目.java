///////////////////////////////////////
案例2-通过eclipse发布自己的项目。
技术分析：
	eclipse：ide
	tomcat：服务器
	项目：web项目
///////////////////////////////////////
服务器：
	硬件服务器和软件服务器
web服务器：
	提供资源供访问
web：
	网页，资源。
web资源分类：
	动态的web资源：内容有可能发生改变的。
	静态的web资源：内容是一成不变的。（几乎看不到）
web开发技术：
	动态的web开发技术：servlet jsp php .net
	静态的webweb开发技术：html css ....
什么叫javaweb
	通过java语音编写的网页称之为javaweb
web通信机制：
	基于请求响应机制。
	一次请求一次响应，先有请求后有响应
常见的web服务器：
	服务器每次	厂商			特点
	weblogic	orcale		大型的收费的支持javaee所有规范的服务器
	webspere	IBM			大型的收费的支持javaee所有规范的服务器
	tomcat      apache组织	中小型的免费的支持servlet和jsp规范的服务器
///////////////////////////////////////////////
tomcat：
	下载：
		.tar .tar.gz: linux系统使用

	安装：
	启动：sudo sh ./startup.sh
	退出：sh ./shutdown.sh
	常见问题（配置）：
		1. 端口冲突问题：
			修改tomcat端口号。
				打开目录 tomcat/conf/server.xml
				<Connector port="8080" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" />
            修改port后面的值,注意1024以下的端口号留给系统用的
            80端口是留给http协议用的，我们可以使用这个端口号
	tomcat目录结构：(了解)
		bin: 存放可执行程序
		conf: 配置文件
		lib: 存放tomcat和项目运行时需要的jar
		logs: 日志 catalina
		temp: 临时文件
		★★webapps: 存放项目的目录
		★work: 存放jsp文件在运行时产生的java和class文件
//////////////////////////////////////////////////
★★★★★★★ web项目的目录结构：★★★★★★★
	myweb（项目名称） web2.5版本标准的目录结构
		|
		|---- html css js image 等目录或者文件
		|
		|---- WEB-INF（特点：通过浏览器直接访问不到 目录）
		|		|
		|		|--- lib（项目的第三方jar包）
		|		|--- classes（存放自定义的java文件生产的.class文件）
		|		|--- web.xml（当前项目的核心配置文件）
		|		|

	访问路径：
		http://主机:端口号/项目名称/资源路径

	//////////////////////////////////////////
	常用的项目发布方式：(虚拟目录映射)
		★★★方式1：将项目放到tomcat/webapps目录下
		（了解）方式2：修改 tomcat/conf/server.xml
			130行:
				在host标签下 添加如下代码：
					<context path="/项目名称" docBase="项目的磁盘目录"/>
		（了解）方式3：
			tomcat/conf/引擎目录/主机 目录下新建一个xml文件
				文件的名称就是项目名 文件的内容如下：
					<context docBase="文件磁盘目录"/>
    //////////////////////////////
    eclipse和tomcat的整合★★★★★★

    通过eclipse发布项目
    	1. 创建一个项目（动态的web项目）
    	2. 选择版本为 2.5



























