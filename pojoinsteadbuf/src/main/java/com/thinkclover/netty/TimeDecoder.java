package com.thinkclover.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * @program: netty-guide-code
 * @description: 消息解码器
 * @author: Mr.Hwang
 * @create: 2019-01-08 14:30
 **/
public class TimeDecoder extends ByteToMessageDecoder {

    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        if (in.readableBytes() < 4){
            return;
        }
        out.add(new UnixTime(in.readUnsignedInt()));
    }
}
