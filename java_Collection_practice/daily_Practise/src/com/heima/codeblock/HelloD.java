package com.heima.codeblock;

/**
 * @author created by qwb on 2018/10/7 17:49
 */
  class HelloC {
    public HelloC(){
        System.out.println("C�Ĺ��캯��");
    }
    {
        System.out.println("C�Ĺ�������");
    }
    static {
        System.out.println("C�ľ�̬�����");
    }
}
 public  class HelloD extends HelloC{
    public HelloD(){
        System.out.println("D �Ĺ��캯��");
    }
    {
        System.out.println("D�Ĺ�������");
    }
    static {
        System.out.println("D�ľ�̬�����");
    }

    public static void main(String[] args) {
        HelloD d = new HelloD();
    }
}
