/* Class BTNode */
class BTNode2<E> {
    BTNode2<E> left, right; // Tambahkan tipe parameter E pada BTNode2

    E data;

    /* Constructor */
    public BTNode2() {
        left = null;
        right = null;
        data = null;
    }

    /* Constructor */
    public BTNode2(E item) {
        left = null;
        right = null;
        data = item;
    }

    /* Function to set left node */
    public void setLeft(BTNode2<E> n) { // Tambahkan tipe parameter E pada BTNode2
        left = n;
    }

    /* Function to set right node */
    public void setRight(BTNode2<E> n) { // Tambahkan tipe parameter E pada BTNode2
        right = n;
    }

    /* Function to get left node */
    public BTNode2<E> getLeft() { // Tambahkan tipe parameter E pada BTNode2
        return left;
    }

    /* Function to get right node */
    public BTNode2<E> getRight() { // Tambahkan tipe parameter E pada BTNode2
        return right;
    }

    /* Function to set data to node */
    public void setData(E d) {
        data = d;
    }

    /* Function to get data from node */
    public E getData() {
        return data;
    }
}


