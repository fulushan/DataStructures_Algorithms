package com.fulushan.dsa.links.main;

import com.fulushan.dsa.links.bean.Node;

/**
 * <链表测试类>
 * Author fulushan
 * Created on 2017/7/12.
 * 链表的典型运算包括：
     初始化：
     其作用是建立一个空表　L=null，即建立链表的 “表构架”，但不包含任何数据元素。
     求表长：
     求链表的长度，即有几个节点。
     读链表节点：
     若1≤i≤链表的长度,其结果是链表的第i个节点；
     定位：按值查找节点。
     插入：插入一个新节点。
     删除：删除指定的节点。
 */
public class Link {


    Node head;

    /**
     * 初始化链表
     */
    public  Link(){
        head = new Node();
        head.next = null;
    }

    /**
     * 新增节点
     * @param data  节点值
     */
    public void addNode(String data){
        //在最后新增  从表头开始遍历找到最后一个节点。
        //把新增的接口放到最后一个元素后面
        Node p = head;
        while(p.next!=null){//判断不为空
            p = p.next;
        }
        Node newNode = new Node(data);
        p.next =newNode;
    }

    /**
     * 根据名字删除节点
     * @param data
     */
    public void delNode(String data){
        Node p = head;
        if(p.next==null){
            return;
        }
        while(p.next!=null){//判断不为空
            if(p.next.name.equals(data)){
                 p.next= p.next.next;
                 break;
            }else{
                p = p.next;
            }
        }
    }

    /**
     * 遍历Node
     */
    public void display(){
        Node p = head;
        while (p.next!=null){
            System.out.println(p.next.name);
            p = p.next;
        }
    }

    /**
     * 查找节点
     * @param data
     */
    public void findNode(String data){
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
     * 插入节点
     * @param nodeData
     * @param newData
     */
    public void insertNode(String nodeData,String newData){
        Node p = head;
        if(p.next==null){
            return;
        }
        while(p.next!=null){//判断不为空
            if(p.next.name.equals(nodeData)){
                Node insertNode = new Node(newData);
                insertNode.next = p.next.next;
                p.next.next = insertNode;
                break;
            }else{
                p = p.next;
            }
        }
    }

    /**
     * 返回节点大小
     * @return
     */
    public int size(){
        Node p = head;
        int size = 0;
        while (p.next!=null){
            System.out.println(p.next.name);
            p = p.next;
            size++;
        }

        return size;
    }

    public static void main(String[] args) {
        // write your code here
        Link link = new Link();
        link.addNode("张三");
        link.addNode("李四");
        link.addNode("王麻子");
        link.display();
        System.out.println("----------------------");
        link.delNode("李四");
        link.display();
        System.out.println("----------------------");
        link.insertNode("张三","王老五");
        link.display();
    }


}
