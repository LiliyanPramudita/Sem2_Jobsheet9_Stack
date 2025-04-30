public class StackKonversi15 {
    int[] stack;
    int size;
    int top;

    public StackKonversi15(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int value) {
        if (!isFull()) {
            stack[++top] = value;
        } else {
            System.out.println("Stack konversi penuh!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack konversi kosong!");
            return -1;
        }
    }
}

