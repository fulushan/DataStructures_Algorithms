package com.fulushan.dsa.stack.main;

import com.fulushan.dsa.links.bean.TwoWayNode;
import com.fulushan.dsa.stack.bean.Node;

/**
 * /**
 * <堆栈数据结构>
 * Author fulushan
 * Created on 2017/7/15.
 堆栈数据结构只允许数据自有序列表（前端）作输入、输出操作。
 最后被输入的数据项会最先被取出来
 具有先进后出FILO（First In Last Out）的特性
 堆栈的存取顺序就像手枪的弹夹一样，最先压进去的子弹会被最后打出来。
 */
public class MyStack {

    Node head = null;

    public MyStack(){
        head = new Node();
        head.next = null;
    }

    /**
     * 新增节点
     * @param name
     */
    public void push(String name){
        Node p = head;

        Node newNode = new Node(name);
        newNode.next = p.next;
        head.next = newNode;
    }

    /**
     * 判断堆栈是否为空
     * @return
     */
    public boolean isEmpty(){
        if(head.next==null){
            return true;
        }
        return false;
    }

    /**
     * 出栈操作
     * @return
     */
    public Node pop(){

        if(isEmpty()){
            System.out.print("堆栈为空");
            return null;
        }

        Node p = head;
        p.next =  p.next.next;
        return p.next;
    }

    /**
     * 返回堆栈大小
     * @return
     */
    public int size(){
        int size = 0;
        Node p = head;
        while (p.next!=null){
            size++;
            p = p.next;
        }
        return  size;
    }
    /**
     * 查找节点
     * @param data
     */
    public void find(String data){
        Node p = head;
        if(p.next==null){
            return;
        }
        while(p.next!=null){//判断不为空
            if(p.next.name.equals(data)){
                System.out.println("存在节点"+p.next.name);
                break;
            }else{
                p = p.next;
            }
        }
    }

    /**
     * 取出栈顶元素
     * @return
     */
    public String peek(){
        if(isEmpty()){
            return "";
        }
        return head.next.name;
    }
    public static void main(String[] args) {
        //堆栈没有遍历了
        MyStack myStack = new MyStack();
        myStack.push("lv3");
        myStack.push("lv2");
        myStack.push("lv1");

        System.out.println("栈顶元素-------->"+myStack.peek());
        System.out.println("栈顶元素Size-------->"+myStack.size());

        myStack.pop();

        System.out.println("栈顶元素-------->"+myStack.peek());
        System.out.println("栈顶元素Size-------->"+myStack.size());
    }
}
