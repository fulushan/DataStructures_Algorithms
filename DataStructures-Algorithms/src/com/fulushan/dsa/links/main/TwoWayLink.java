package com.fulushan.dsa.links.main;

import com.fulushan.dsa.links.bean.TwoWayNode;

/**
 * <双向链表测试类>
 * Author fulushan
 * Created on 2017/7/13.
 *在单链表中，每个节点所含的链域指向其后继节点，故从任一节点找其后继很方便；但要找前趋节点则比较困难。
 在每个节点中增加一个链域，所含引用所指向前趋节点
 */
public class TwoWayLink {



    TwoWayNode head;

    /**
     * 初始化链表
     */
    public  TwoWayLink(){
        head = new TwoWayNode();
        head.next = null;
        head.pre = null;
    }

    /**
     * 新增节点
     * @param data  节点值
     */
    public void addTwoWayNode(String data){
        //在最后新增  从表头开始遍历找到最后一个节点。
        //把新增的接口放到最后一个元素后面
        TwoWayNode p = head;
        while(p.next!=null){//判断不为空
            p = p.next;
        }
        TwoWayNode newTwoWayNode = new TwoWayNode(data);
        p.next =newTwoWayNode;
        newTwoWayNode.pre = p;
    }

    /**
     * 根据名字删除节点
     * @param data
     */
    public void delTwoWayNode(String data){
        TwoWayNode p = head;
        if(p.next==null){
            return;
        }
        while(p.next!=null){//判断不为空
            if(p.next.name.equals(data)){
                //顺序不能换
                p.next.next.pre = p.next.pre;
                p.next= p.next.next;
                break;
            }else{
                p = p.next;
            }
        }
    }

    /**
     * 遍历TwoWayNode
     */
    public void displayFromB2E(){
        TwoWayNode p = head;
        while (p.next!=null){
            System.out.println(p.next.name);
            p = p.next;
        }
    }
    public void displayFromE2B(){
        TwoWayNode p = head;
        while (p.pre!=null){
            System.out.println(p.pre.name);
            p = p.next;
        }
    }


    /**
     * 查找节点
     * @param data
     */
    public void findTwoWayNode(String data){
        TwoWayNode p = head;
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
     * @param TwoWayNodeData
     * @param newData
     */
    public void insertTwoWayNode(String TwoWayNodeData,String newData){
        TwoWayNode p = head;
        if(p.next==null){
            return;
        }
        while(p.next!=null){//判断不为空
            if(p.next.name.equals(TwoWayNodeData)){//先安排后面的节点  再安排前面的节点
                TwoWayNode insertTwoWayNode = new TwoWayNode(newData);
                //两根线晚完成
                p.next.next.pre =insertTwoWayNode;
                insertTwoWayNode.next = p.next.next;


                insertTwoWayNode.pre = p.next;
                p.next.next = insertTwoWayNode;
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
        TwoWayNode p = head;
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
        TwoWayLink TwoWayLink = new TwoWayLink();
        TwoWayLink.addTwoWayNode("张三");
        TwoWayLink.addTwoWayNode("李四");
        TwoWayLink.addTwoWayNode("王麻子");
        TwoWayLink.displayFromB2E();
        System.out.println("----------------------");
        TwoWayLink.displayFromE2B();
//        TwoWayLink.delTwoWayNode("李四");
//        TwoWayLink.display();
//        System.out.println("----------------------");
//        TwoWayLink.insertTwoWayNode("张三","王老五");
//        TwoWayLink.display();
    }




}
