import java.util.ArrayList;

class CircularQueue {
    int number;

    CircularQueue(int number) {
        this.number = number;
    }
}

class Buffer {
    ArrayList<CircularQueue> queues = new ArrayList<CircularQueue>();
    int currentIndex = 0;
    int size;

    Buffer(int size) {
        this.size = size;
    }

    void add(int n) {
        
        queues.add(currentIndex, new CircularQueue(n));
    }

    void remove() {
        queues.remove(currentIndex);
    }

    void printList() {
        for (int i = 0; i < queues.size(); i++) {
            System.out.println("Item in index " + i + " : " + queues.get(i).number);
        }
    }
}

public class CircularBuffer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(3);

        buffer.add(90);
        buffer.add(30);
        buffer.add(50);
        buffer.add(60);
        buffer.remove();
        buffer.add(60);

        buffer.printList();
    }    
}
