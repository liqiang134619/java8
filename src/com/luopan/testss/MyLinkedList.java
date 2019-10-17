package com.luopan.testss;

/**
 * @author Liq
 * @date 2019/7/16
 */
public class MyLinkedList<T> {

    /**
     * 头结点
     */
    private Node<T> head;


    /**
     * 链表的大小
     */
    private int size;




    /**
     * 初始化链表
     */
    public MyLinkedList() {
        head = new Node<T>();
    }

    public int size() {
        return size;
    }

    /**
     * 返回指定索引出的对象
     */
    public Node<T> getObjectById(int index) {
        Node<T> node = head.getNext();
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }

    /**
     * 获取指定索引的数据
     * @param index
     * @return
     */
    public T getElementById(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }
        Node<T> node = getObjectById(index);
        return node.getData();
    }

    /**
     * 添加节点,不允许添加重复元素
     * @param t 待添加节点
     */
    public void addElement(T t) {
        Node<T> node = new Node<>();
        node.setData(t);

        Node<T> headNext = head.getNext();

        if (headNext == null) {
            head.setNext(node);
            size ++;
            return;
        }

        while (headNext.getNext() !=null) {
            if(headNext.getNext().getData().equals(t)) {
                return;
            }
            headNext = headNext.getNext();
        }
        headNext.setNext(node);
        node.setNext(null);
        size ++;


    }

    /**
     * 删除指定节点，并返回删除的元素
     * @param index
     * @return
     */
    public T deleteById(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }

        if (index == 0) {
            Node<T> headNext = head.getNext();
            head.setNext(headNext.getNext());
            size --;
            return headNext.getData();
        }

        // 删除中间节点

        // 获取删除的下一个节点
        Node<T> next = getObjectById(index).getNext();

        // 待删除节点

        Node<T> objectById = getObjectById(index);

        Node<T> preNode = getObjectById(index - 1);

        preNode.setNext(next);

        objectById.setNext(null);

        size --;
        return objectById.getData();

    }

}
