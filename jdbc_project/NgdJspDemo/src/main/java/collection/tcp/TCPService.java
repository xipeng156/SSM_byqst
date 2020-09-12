package collection.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器
 * 接受客户端的请求并回显数据
 * 通过accept方法获取客户端socket对象
 * 1、创建servicesocket对象
 * 2、使用accept获取到请求的客户端对象socket
 * 3、使用getinputstream获取字节输入流
 * 4、使用read方法读取客户端的数据
 * 5、使用getoutputstream获取网络字节输出流
 * 6、使用write写入回写数据
 * 7、关闭资源
 */
public class TCPService {
    public static void main(String[] args) {
        try {
//          1、创建servicesocket对象
            ServerSocket socket = new ServerSocket(8888);
//          2、使用accept获取到请求的客户端对象socket
            Socket accept = socket.accept();
//         3、使用getinputstream获取字节输入流
            InputStream is = accept.getInputStream();
//        * 4、使用read方法读取客户端的数据
            byte[] bytes = new byte[1024];
            int i = is.read(bytes);
            System.out.println("客户端发送："+new String(bytes,0,i));
//        * 5、使用getoutputstream获取网络字节输出流
            OutputStream outputStream = accept.getOutputStream();
//        * 6、使用write写入回写数据
            outputStream.write("你好客户端".getBytes());
//        * 7、关闭资源
            outputStream.close();
            is.close();
            accept.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
