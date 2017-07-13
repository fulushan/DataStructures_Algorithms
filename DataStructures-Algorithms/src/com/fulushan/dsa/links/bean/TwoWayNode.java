package com.fulushan.dsa.links.bean;

/**
 * <双向链表Node类>
 * Author fulushan
 * Created on 2017/7/13.
 */
public class TwoWayNode {
    public String name;
    //自应用  节点地址
    public TwoWayNode next;
    public TwoWayNode pre;

    public TwoWayNode(String name) {
        this.name = name;
        next = null;
        pre = null;
    }

    public TwoWayNode() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TwoWayNode getNext() {
        return next;
    }

    public void setNext(TwoWayNode next) {
        this.next = next;
    }
}
