package com.thinkclover.netty.s1;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @program: netty-guide-code
 * @description: 时间客户端
 * @author: Mr.Hwang
 * @create: 2019-01-08 11:33
 **/
public class TimeClient {
    public static void main(String[] args) throws Exception{
        String host = "127.0.0.1";
        int port = 8083;
        EventLoopGroup workGroup = new NioEventLoopGroup();
        try{
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(workGroup);
            bootstrap.channel(NioSocketChannel.class);
            bootstrap.option(ChannelOption.SO_KEEPALIVE,true);
            bootstrap.handler(new ChannelInitializer<SocketChannel>() {
                @Override
                protected void initChannel(SocketChannel socketChannel) throws Exception {
                    socketChannel.pipeline().addLast(new TimeClientHandler());
                }
            });

            ChannelFuture channelFuture = bootstrap.connect(host,port).sync();

            channelFuture.channel().closeFuture().sync();

        } finally {
            workGroup.shutdownGracefully();
        }
    }

}
