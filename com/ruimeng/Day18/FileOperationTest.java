package com.ruimeng.Day18;

import java.io.File;
import java.io.IOException;

public class FileOperationTest {

    public static void main(String[] args) throws IOException {

        File f = new File("resource\\day18.txt");
        File d = new File("resource\\day18d");

        System.out.println("文件 day18.txt 存在：" + f.exists());
        System.out.println("目录 day18d 存在：" + d.exists());

        System.out.println("创建文件 day18.txt 和 目录 day18d。");

        f.createNewFile();
        d.mkdir();

        System.out.println("文件 day18.txt 存在：" + f.exists());
        System.out.println("目录 day18d 存在：" + d.exists());

        System.out.println("文件 day18.txt 的文件名为：" + f.getName());
        System.out.println("目录 day18d 的文件名为：" + d.getName());

        System.out.println("文件 day18.txt 的绝对路径为：" + f.getAbsolutePath());
        System.out.println("目录 day18d 的绝对路径为：" + d.getAbsolutePath());

        System.out.println("文件 day18.txt 的相对路径为：" + f.getPath());
        System.out.println("目录 day18d 的相对路径为：" + d.getPath());

        System.out.println("文件 day18.txt 是目录：" + f.isDirectory());
        System.out.println("目录 day18d 是目录：" + d.isDirectory());

        System.out.println("文件 day18.txt 是文件：" + f.isFile());
        System.out.println("目录 day18d 是文件：" + d.isFile());

        System.out.println("删除文件 day18.txt 和 目录 day18d。");
        f.delete();
        d.delete();

        System.out.println("文件 day18.txt 存在：" + f.exists());
        System.out.println("目录 day18d 存在：" + d.exists());
    }
}
