package com.heima.network;

import java.io.*;
import java.net.Socket;

public class GreetingClient {
    public static void main(String[] args) throws Exception{
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try{
            System.out.println("���ӵ�������"+serverName+"���˿ں�:"+port);
            Socket client = new Socket(serverName,port);
            System.out.println("Զ��������ַ�� "+client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            out.writeUTF("Hello from"+client.getLocalSocketAddress());

            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("��������Ӧ��"+in.readUTF());
            client.close();
        }catch(Exception e ){
            e.printStackTrace();
        }
    }
}
