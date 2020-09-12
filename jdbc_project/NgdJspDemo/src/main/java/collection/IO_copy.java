package collection;

import java.io.*;

public class IO_copy {
    public static void main(String[] args) {
        if(copyFile("d://test2.txt","d://test.txt"))
            System.out.println("复制成功");
        else System.out.println("复制失败");
    }
    public static boolean copyFile(String newfile,String oldfile){
        /**
         * 1、获取fileinputstream和fileoutputstream字节流对象
         * 2、建立字节缓冲流用于存储临时数据
         * 3、从输入流中读取btyes个字节的对象，并写入到输出流中
         * 4、关闭流
         */
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(oldfile);
            os = new FileOutputStream(newfile);
//            缓冲存储
            byte[] bytes = new byte[1024];
            int len;
            while ((len=is.read(bytes))!=-1){
                os.write(bytes,0,len);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (os!=null){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (is!=null){
                    is.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return new File(newfile).exists();
    }
}
