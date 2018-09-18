/**
 *
 * InputStream
 * FileInputStream
 *
 * OutputStream
 * FileOutputStream
 *
 * --------------------------------
 * Reader
 * InputStreamReader BufferedReader
 * FileRead
 *
 * Writer
 * OutputStreamWrite BufferedWriter
 * FileWrite
 *
 * --------------------------------
 * 文件操作的时候鼓励使用的一组类是
 *
 * FileInputStream BufferedReader FileRead
 * FileOutputStream BufferedWriter FileWrite
 *
 * 由于 C 盘访问权限的问题，在管理员运行的 CMD 下执行该程序
 * java -cp . com.ruimeng.Day19.FileReadAndWrite
 *
 */

package com.ruimeng.Day19;

import java.io.*;

public class FileReadAndWrite {

    public static void main(String[] args) {

        // 创建初始三个文件
        char[] ind = {'1', '2', '3'};
        for (char cur : ind) {

            File f = new File("C:\\我的青春谁做主" + cur + ".txt");

            try {
                if (!f.createNewFile()) {
                    System.out.println("文件 " + f.getPath() + " 已经存在了。");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                FileOutputStream fWrite = new FileOutputStream(f);
//                fWrite.write("abcdefgabcdefgabcdefg\n".getBytes());
//                fWrite.write("abcdefgabcdefgabcdefg\n".getBytes());
//                fWrite.write("abcdefgabcdefgabcdefg\n".getBytes());
                fWrite.write("可惜我的青春期已经过去了！\n".getBytes());
                fWrite.write("可惜我的青春期已经过去了！\n".getBytes());
                fWrite.write("可惜我的青春期已经过去了！\n".getBytes());
                fWrite.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        File fIn, fOut;
        // FileInputStream FileOutputStream 文件复制
        fIn = new File("C:\\我的青春谁做主1.txt");
        fOut = new File("C:\\myFile\\我的青春谁做主1.txt");

        try {
            FileInputStream fInput = new FileInputStream(fIn);
            File parentFile = fOut.getParentFile();
            if(!parentFile.exists()) {
                parentFile.mkdirs();
            }
            if(!fOut.createNewFile()) {
                System.out.println("文件 " + fOut.getPath() + " 已经存在了，最好将其清理。");
            }
            FileOutputStream fOutput = new FileOutputStream(fOut);

            // 这样处理的效率应该比较低吧
//            int c;
//            while((c=fInput.read())!=-1) {
//                fOutput.write(c);
//            }

            // 这种写法相比于下面那一块的代码在写中文的时候没有乱码。
            byte[] bytesBuffer = new byte[20];
            int bytesRead = 0;
            while (true){
                bytesRead = fInput.read(bytesBuffer);
                if (-1 == bytesRead) {
                    break;
                }
                fOutput.write(bytesBuffer, 0, bytesRead);
            }

            // 下面的这个方法这样搞会有中文字符串文件末尾的字符串有乱码的问题
            // 英文貌似没有，原因还没定位到
//            byte[] bytesBuffer = new byte[20];
//            while (fInput.read(bytesBuffer) != -1) {
//                fOutput.write(bytesBuffer);
//            }
            fInput.close();
            fOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // BufferedReader BufferedWriter 文件复制
        // FileRead FileWrite
    }
}
