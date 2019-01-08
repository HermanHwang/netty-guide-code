# netty-guide-code
学习官方netty4.x的源码

1、使用的netty版本的为4.0.54

2、目录

(1)、Writing a Discard Server 写个抛弃服务器
	discardserver

(2)、Looking into the Received Data 查看收到的数据
	receiveserver

(3)、echo 响应服务器
	echoserver

(4)、时间服务器
	TimeServerHandler
	
(5)、时间服务器之拆解包问题
	streambasedtransport
	
(6)、传输pojo对象，而非Bytebuf
	pojoinsteadbuf