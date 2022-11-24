package com.Quiz6;

// This is the node class
public class Node
{
    private int data;
    private Node rightChild;
    private Node leftChild;

    public void insert(int value)
    {
        if  (value == data)
        {
            return;
        }

        // This is the left subtree
        if(value < data)
        {
            if (leftChild == null)
            {
                leftChild = new Node(value);
            }

            else
            {
                leftChild.insert(value);
            }
        }

        // This is the right subtree
        else
        {
            if  (rightChild == null)
            {
                rightChild = new Node(value);
            }

            else
            {
                rightChild.insert(value);
            }
        }
    }

    // This is the left subtree
    public void traverseInOrder()
    {
        if (leftChild!= null)
        {
            leftChild.traverseInOrder();
        }

        // This prints the current node (root or subtree)
        System.out.println("Data: " + data);

        // This is the right subtree
        if (rightChild != null)
        {
            rightChild.traverseInOrder();
        }
    }

    public Node get(int value)
    {
        if  (value == data)
        {
            return this;
        }

        if  (value < data)
        {
            if (leftChild != null)
            {
                return leftChild.get(value);
            }
        }

        else
        {
            if (rightChild != null)
            {
                return rightChild.get(value);
            }
        }
        return null;
    }

    public Node getMin()
    {
        if  (leftChild != null)
        {
            return leftChild.getMin();
        }

        else
        {
            return this;
        }
    }

    public Node getMax()
    {
        if  (rightChild != null)
        {
            return rightChild.getMax();
        }

        else
        {
            return this;
        }
    }

    public void traverseInDescendingOrder()
    {
        if (rightChild != null)
        {
            rightChild.traverseInDescendingOrder();
        }

        System.out.println("Data: " + data);

        if (leftChild!= null)
        {
            leftChild.traverseInDescendingOrder();
        }
    }

    public Node(int _data){
        this.data = _data;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public Node getRightChild()
    {
        return rightChild;
    }

    public void setRightChild(Node rightChild)
    {
        this.rightChild = rightChild;
    }

    public Node getLeftChild()
    {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    @Override
    public String toString()
    {
        return "Node{" +
                "data=" + data +
                '}';
    }
}