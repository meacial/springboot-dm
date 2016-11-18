package com.meacial.io.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @see http://javapapers.com/java/java-nio-channel/
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/17 0017 下午 4:37
 */
public class ChannelExample {
    public static void main(String[] args) throws IOException {

        RandomAccessFile file = new RandomAccessFile("rdmf.txt", "r");

        FileChannel channel = file.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(512);

        while (channel.read(byteBuffer) > 0) {
            byteBuffer.flip(); // flip the buffer to prepare for get operation
            while (byteBuffer.hasRemaining()) {
                System.out.println((char) byteBuffer.get());
            }
            // clear the buffer ready for next sequence of read
            byteBuffer.clear();
        }

    }
}
