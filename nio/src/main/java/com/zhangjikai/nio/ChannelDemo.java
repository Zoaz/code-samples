package com.zhangjikai.nio;

import com.zhangjikai.util.Path;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Jikai Zhang on 2017/5/8.
 */
public class ChannelDemo {

    public static void main(String[] args) {
        //System.out.println(Path.fullPath("nio.txt"));
        String filePath = Path.fullPath("nio.txt");
        int bufferSize = 48;
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw")) {
            FileChannel fileChannel = randomAccessFile.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(48);
            int byteRead = fileChannel.read(buf);
            while (byteRead != -1) {
                System.out.println("Read: " + byteRead);
                buf.flip();
                while (buf.hasRemaining()) {
                    //System.out.println(buf.getChar());
                }
                //System.out.println(buf.getChar());
                buf.clear();
                byteRead = fileChannel.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
