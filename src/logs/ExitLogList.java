package logs;

public class ExitLogList {
    private static class Node {
        String plate;
        double fee;
        Node next;

        Node(String plate, double fee) {
            this.plate = plate;
            this.fee = fee;
            this.next = null;
        }
    }

    private Node head;

    public void addRecord(String plate, double fee) {
        Node newNode = new Node(plate, fee);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void printLogs() {
        if (head == null) {
            System.out.println("No completed exits yet.");
            return;
        }

        Node current = head;
        int idx = 1;

        while (current != null) {
            System.out.println(idx + ". Plate: " + current.plate + " | Fee Paid: Rs. " + current.fee);
            current = current.next;
            idx++;
        }
    }
}