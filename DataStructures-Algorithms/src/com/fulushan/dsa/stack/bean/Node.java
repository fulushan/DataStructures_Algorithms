package com.fulushan.dsa.stack.bean;

/**
 *  <堆栈bean>
 * Author fulushan
 * Created on 2017/7/145.
 */
public class Node {
    public String name;
    //自应用  节点地址
    public Node next;

    public Node(String name) {
        this.name = name;
        next = null;
    }

    public Node() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
