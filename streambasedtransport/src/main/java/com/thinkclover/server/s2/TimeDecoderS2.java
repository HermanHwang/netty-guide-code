package com.thinkclover.server.s2;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * @program: netty-guide-code
 * @description:
 * @author: Mr.Hwang
 * @create: 2019-01-08 11:55
 **/
public class TimeDecoderS2 extends ByteToMessageDecoder {

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        if (byteBuf.readableBytes() < 4){
            return;
        }
        list.add(byteBuf.readBytes(4));
    }
}
