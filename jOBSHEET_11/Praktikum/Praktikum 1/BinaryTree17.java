public class BinaryTree17 {
    Node17 root;
    public BinaryTree17() {
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(int data) {
        if (isEmpty()) {
            root = new Node17(data);
        } else {
            Node17 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node17(data);
                        break;
                    } 
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node17(data);
                        break;
                    } 
                } else {
                    break; 
                }
            }
        }
    }

    public boolean find(int data) {
        boolean found = false;
        Node17 current = root;
        while (current != null) {
            if (current.data == data) {
                found = true;
                break;
            } else if (current.data > data) {
                current = current.left;            
             } else {
                 current = current.right;
            }
        } 
        return found;
    }

    public void traversePreOrder(Node17 node18) {
        if (node18 != null) {
            System.out.print(" "+ node18.data);
            traversePreOrder(node18.left);
            traversePreOrder(node18.right);
        }
    }

    public void traversePostOrder(Node17 node18) {
        if (node18 != null) {
            traversePostOrder(node18.left);
            traversePostOrder(node18.right);
            System.out.print(" " + node18.data);
        }
    }

    public void traverseInOrder(Node17 node18){
        if (node18 != null) {
            traverseInOrder(node18.left);
            System.out.print(" " + node18.data);
            traverseInOrder(node18.right);
        }
    }

    public Node17 getSuccesor(Node17 del) {
        Node17 successor = del.right;
        Node17 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        } 
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree masih kosong!");
            return;
        }
        Node17 parent = root;
        Node17 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (current.data > data) {
                parent = current;
                current = current.left;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root =null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                // Jika tidak ada child kanan
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node17 successor = getSuccesor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}
