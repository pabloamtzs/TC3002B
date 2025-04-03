import java.util.LinkedList;

// Stack (LIFO) Implementation
class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();
    
    public void push(T value) {
        list.addFirst(value);
    }
    
    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return list.removeFirst();
    }
    
    public T peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return list.getFirst();
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
}

// Queue (FIFO) Implementation
class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();
    
    public void enqueue(T value) {
        list.addLast(value);
    }
    
    public T dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return list.removeFirst();
    }
    
    public T peek() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return list.getFirst();
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
}

// Hash Table / Dictionary Implementation
class HashTable<K, V> {
    private java.util.HashMap<K, V> map = new java.util.HashMap<>();
    
    public void put(K key, V value) {
        map.put(key, value);
    }
    
    public V get(K key) {
        return map.get(key);
    }
    
    public void remove(K key) {
        map.remove(key);
    }
    
    public boolean containsKey(K key) {
        return map.containsKey(key);
    }
}

public class DataStructuresTest {
    public static void main(String[] args) {
        // Test de Stack
        System.out.println("===== STACK TEST =====");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack peek (esperado 30): " + stack.peek());
        System.out.println("Stack pop (esperado 30): " + stack.pop());
        System.out.println("Stack pop (esperado 20): " + stack.pop());
        System.out.println("Stack pop (esperado 10): " + stack.pop());
        try { stack.pop(); } catch (RuntimeException e) { System.out.println("Error esperado: " + e.getMessage()); }

        // Test de Queue
        System.out.println("===== QUEUE TEST =====");
        Queue<String> queue = new Queue<>();
        queue.enqueue("Hola");
        queue.enqueue("Mundo");
        queue.enqueue("Java");
        System.out.println("Queue peek (esperado 'Hola'): " + queue.peek());
        System.out.println("Queue dequeue (esperado 'Hola'): " + queue.dequeue());
        System.out.println("Queue dequeue (esperado 'Mundo'): " + queue.dequeue());
        System.out.println("Queue dequeue (esperado 'Java'): " + queue.dequeue());
        try { queue.dequeue(); } catch (RuntimeException e) { System.out.println("Error esperado: " + e.getMessage()); }

        // Test de HashTable
        System.out.println("===== HASHTABLE TEST =====");
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.put("A", 1);
        hashTable.put("B", 2);
        hashTable.put("C", 3);
        System.out.println("HashTable get('A') (esperado 1): " + hashTable.get("A"));
        System.out.println("HashTable get('B') (esperado 2): " + hashTable.get("B"));
        System.out.println("HashTable contiene 'C' (esperado true): " + hashTable.containsKey("C"));
        hashTable.remove("C");
        System.out.println("HashTable contiene 'C' después de eliminar (esperado false): " + hashTable.containsKey("C"));
        System.out.println("HashTable get('D') (esperado null): " + hashTable.get("D"));
    }
}

