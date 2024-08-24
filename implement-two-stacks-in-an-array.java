class twoStacks {
    int[] arr;
    int size;
    int top1, top2;

    // Constructor to initialize the data structures and variables
    twoStacks() {
        size = 100; // Default size
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    // Function to push an integer into the first stack
    void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Function to push an integer into the second stack
    void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Function to remove an element from the top of the first stack
    int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            return -1; // Stack Underflow
        }
    }

    // Function to remove an element from the top of the second stack
    int pop2() {
        if (top2 < size) {
            return arr[top2++];
        } else {
            return -1; // Stack Underflow
        }
    }

   
}
