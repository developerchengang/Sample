class BookStack {
    constructor() {
        this.stack = [];
    }

    push(item) {
        return this.stack.push(item);
    }

    pop() {
        return this.stack.pop();
    }

    peek() {
        return this.stack[this.length - 1];
    }

    get length() {
        return this.stack.length;
    }

    isEmpty() {
        return this.stack.length == 0;
    }
}

let bookStack = new BookStack();
bookStack.push("Code Complete");
bookStack.push("Refactoring: Improving the Design of Existing Code");
bookStack.push("he Mythical Man-Month: Essays on Software Engineering");
bookStack.push("Computer Systems: A Programmer's Perspective");
bookStack.push("Introduction to Algorithms");

console.log(bookStack.stack);
console.log(bookStack.length);
while (!bookStack.isEmpty()) {
    console.log(bookStack.peek());
    bookStack.pop();
}
bookStack.push("Programming Pearls Second Edition");
console.log(bookStack.stack);
console.log(bookStack.length);