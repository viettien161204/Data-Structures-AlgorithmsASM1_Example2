import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class EncapsulationExample {
    public class BankAccount {
        private double balance; // private field

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }

        public double getBalance() {
            return balance; // controlled access
        }
    }

    public class Queue {
        private LinkedList<Object> elements = new LinkedList<>();

        public void enqueue(Object item) {
            elements.addLast(item);
        }

        public Object dequeue() {
            return elements.removeFirst();
        }

        public boolean isEmpty() {
            return elements.isEmpty();
        }
    }

    public class Stack {
        private ArrayList<Object> elements = new ArrayList<>();

        public void push(Object item) {
            elements.add(item);
        }

        public Object pop() {
            return elements.remove(elements.size() - 1);
        }
    }

    public class Student {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name; // controlled setter
        }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age; // validation
            }
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }



    public class Date {
        private int day;
        private int month;
        private int year;

        public Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public String toString() {
            return day + "/" + month + "/" + year;
        }
    }





}
