class MovieQueue {

    constructor() {
        this.queue = [];
    }

    enqueue(item) {
        return this.queue.unshift(item);
    }

    dequeue() {
        return this.queue.pop();
    }

    peek() {
        return this.queue[this.queue.length - 1];
    }

    get length() {
        return this.queue.length;
    }

    isEmpty() {
        return this.queue.length == 0;
    }

}

const movieQueue = new MovieQueue();
movieQueue.enqueue("he Shawshank Redemption");
movieQueue.enqueue("Farewell My Concubine");
movieQueue.enqueue("Léon");
movieQueue.enqueue("Forrest Gump");
movieQueue.enqueue("La vita è bella");
console.log(movieQueue.queue);
console.log(movieQueue.length);
while (!movieQueue.isEmpty()) {
    console.log(movieQueue.peek());
    movieQueue.dequeue();
}
movieQueue.enqueue("Titanic");
console.log(movieQueue.queue);
console.log(movieQueue.length);
