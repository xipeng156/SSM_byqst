package collection.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端：向服务器发送连接
 * 1、创建客户端socket
 * 2、getoutputstream获取输出流对象
 * 3、使用write给服务器发送数据
 * 4、使用getinputstream获取网络字节输入流对象
 * 5、使用read读取服务器回显数据
 * 6、关闭资源
 */
public class TCPClient {
    public static void main(String[] args) {
        try {
//          1、创建客户端socket
            Socket socket = new Socket("localhost",8888);
//          2、getoutputstream获取输出流对象
            OutputStream outputStream = socket.getOutputStream();
//          3、使用write给服务器发送数据
            outputStream.write("你好服务器".getBytes());
//            4、使用getinputstream获取网络字节输入流对象
            InputStream inputStream = socket.getInputStream();
//            5、使用read读取服务器回显数据
            byte[] bytes = new byte[1024];
            int i = inputStream.read(bytes);
            System.out.println("服务器回显："+new String(bytes,0,i));
//            6、关闭资源
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
