package Praktikum09;

public class LinkedList01 {
    Node01 head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi Linked List: ");
            Node01 currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }

            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int data) {
        Node01 newNode = new Node01(data, head);
        head = newNode;
    }

    public void insertAfter(int key, int input) {
        Node01 newNode = new Node01(input, null);

        if (!isEmpty()) {
            Node01 currentNode = head;

            while (currentNode != null) {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }

                currentNode = currentNode.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public int getData(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return -1; // Mengembalikan nilai default jika linked list kosong
        }

        Node01 currentNode = head;

        // Traverse hingga node ke-(index) atau hingga akhir linked list
        for (int i = 0; i < index; i++) {
            if (currentNode.next == null) {
                System.out.println("Indeks melebihi jumlah node dalam linked list");
                return -1; // Mengembalikan nilai default jika indeks melebihi jumlah node
            }
            currentNode = currentNode.next;
        }

        return currentNode.data;
    }

    public int indexOf(int key) {
        Node01 currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }

        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            Node01 currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node01 currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    // Method insertBefore untuk menambahkan node sebelum keyword yang diinginkan
    public void insertBefore(int key, int input) {
        Node01 newNode = new Node01(input, null);

        if (!isEmpty()) {
            if (head.data == key) {
                newNode.next = head;
                head = newNode;
            } else {
                Node01 currentNode = head;

                while (currentNode.next != null) {
                    if (currentNode.next.data == key) {
                        newNode.next = currentNode.next;
                        currentNode.next = newNode;
                        break;
                    }
                    currentNode = currentNode.next;
                }
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    // Method insertAt untuk menambahkan node pada index tertentu
    public void insertAt(int index, int input) {
        Node01 newNode = new Node01(input, null);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node01 currentNode = head;
            int currentIndex = 0;

            while (currentNode != null && currentIndex < index - 1) {
                currentNode = currentNode.next;
                currentIndex++;
            }

            if (currentNode != null) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            } else {
                System.out.println("Indeks melebihi jumlah node dalam linked list");
            }
        }
    }

    // Method removeAt untuk menghapus node pada index tertentu
    public void removeAt(int index) {
        if (!isEmpty()) {
            if (index == 0) {
                head = head.next;
            } else {
                Node01 currentNode = head;
                int currentIndex = 0;

                while (currentNode != null && currentIndex < index - 1) {
                    currentNode = currentNode.next;
                    currentIndex++;
                }

                if (currentNode != null && currentNode.next != null) {
                    currentNode.next = currentNode.next.next;
                } else {
                    System.out.println("Indeks melebihi jumlah node dalam linked list");
                }
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }
}
