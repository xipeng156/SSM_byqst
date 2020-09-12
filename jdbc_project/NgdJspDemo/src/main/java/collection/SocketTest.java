package collection;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) {
//        if (args.length>0)
//        else
        client();
        server();
    }
    public static void server(){
        System.out.println("======server=======");
        ServerSocket socket = null;
        try {
            socket = new ServerSocket(9999);
            Socket accept = socket.accept();
            InputStream stream = accept.getInputStream();
            byte[] bytes = new byte[1024];
            int i = stream.read(bytes);
            System.out.println("client"+new String(bytes,0,i));
            OutputStream outputStream = accept.getOutputStream();
            outputStream.write("How are you".getBytes());
            outputStream.close();
            stream.close();
            accept.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void client(){
        System.out.println("========client===========");
        try {
            Socket socket = new Socket("localhost", 9999);
            OutputStream os = socket.getOutputStream();
            os.write("Hello ".getBytes());
            InputStream is = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int i = is.read(bytes);
            System.out.println("server:"+new String(bytes,0,i));
            is.close();
            os.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
