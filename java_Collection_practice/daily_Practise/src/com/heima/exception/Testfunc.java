package com.heima.exception;

public class Testfunc {
    /** ��test��smallT��������ӵ����н���п��Է��֣�try�е�return�����õĺ�������finally�е��õĺ���ִ�У�Ҳ����˵return�����ִ�У�finally����ִ�С�Return�������ú������Ϸ��أ�����return���ִ�к󣬽��ѷ��ؽ�����ý�����ջ�У���ʱ�������������Ϸ��أ���Ҫִ��finally�����������ʼ���ء�
     * ��finally�е�returnΪ׼*/
    public static void main(String[] args) {
        System.out.println((new Testfunc()).test());
    }
    int test(){
        try {
            return func1();
        }finally {
            return func2();
        }
    }
    int func1(){
        System.out.println("func1");
        return 1;
    }
    int func2(){
        System.out.println("func2");
        return 2;
    }
}
