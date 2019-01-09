package com.thinkclover.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @program: netty-guide-code
 * @description:
 * @author: Mr.Hwang
 * @create: 2019-01-09 14:48
 **/
public class SimpleChatClientHandler extends SimpleChannelInboundHandler<String> {

    protected void channelRead0(ChannelHandlerContext channelHandlerContext, String s) throws Exception {
        System.out.println(s);
    }
}
