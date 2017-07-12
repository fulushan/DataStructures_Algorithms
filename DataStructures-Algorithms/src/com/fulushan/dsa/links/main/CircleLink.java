package com.fulushan.dsa.links.main;

import com.fulushan.dsa.links.bean.Node;

/**
 * <循环链表测试类>
 * Author fulushan
 * Created on 2017/7/12.
 * 循环链表与单链表的区别仅仅在于其尾节点的链域值不是null，而是一个指向头节点的引用
 * 循环链表的优点：
 从表中任一节点出发都能通过后移操作而扫描整个循环链表。
 */
public class CircleLink {


    Node head;

    /**
     * 初始化链表
     */
    public CircleLink(){
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
        if(p.next==null){
            Node temp = new Node(data);
            p.next = temp;
            temp.next = head.next;
            return;
        }
        p = p.next;//从第一个节点开始
        while (p.next!=head.next){//判断不为空
            p = p.next;
        }
        Node newNode = new Node(data);
        p.next =newNode;
        newNode.next = head.next;//尾节点的下一个节点是第一个节点
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
        while(p.next!=head.next){//判断不是尾节点
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
        Node p = head.next;
        while(p.next!=head.next){//判断不是尾节点
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
        while(p.next!=head.next){//判断不是尾节点
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
        while(p.next!=head.next){//判断不是尾节点
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
        while(p.next!=head.next){//判断不是尾节点
            System.out.println(p.next.name);
            p = p.next;
            size++;
        }

        return size;
    }

    public static void main(String[] args) {
        // write your code here
        CircleLink link = new CircleLink();
        link.addNode("张三");
        link.addNode("李四");
        link.addNode("王麻子");
        link.display();
        System.out.println("----------------------");
//        link.delNode("李四");
//        link.display();
//        System.out.println("----------------------");
//        link.insertNode("张三","王老五");
//        link.display();
    }


}
