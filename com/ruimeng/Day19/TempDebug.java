package com.ruimeng.Day19;

public class TempDebug {

    public static void main(String[] args) {

        System.out.println("good");

        // 文件复制我得从文件的二进制层面去考察复制的效果，如果从文本的显示层面考察，可能会由于文件编码格式导致一些问题发现不了。
        // byte 数组创建时候分配的初始值是多少？
        // InputStream.read(byte[] b) 读到数据量不足填充 b 会怎样。
        // OutputStream.write(byte[] c) 写入的细节，比如我写入一个未初始化过的 byte 数组会咋样。
        // 当然还涉及到文件编码的问题。
        // 既然用起来这么麻烦，应该有别的解决方案吧。

    }
}
