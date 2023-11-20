package org.homework.secondTasks.node;

// Напишіть програму з класом, в якому є два поля:
//цілочислове і посилання на об'єкт того ж класу. Опишіть
//статичний метод, який створює замкнений ланцюжок
//об'єктів даного класу (кожен об'єкт посилається на
//наступний, а останній посилається на перший).
//Результатом метод повертає посилання на перший об'єкт
//у ланцюжку. Значення цілочислових полів об'єктів -
//натуральні числа (1, 2, 3 і так далі). Опишіть статичний
//метод, якому аргументом передається об'єкт даного
//класу. Метод відображає значення цілочислових полів
//всіх об'єктів у ланцюжку

public class Node {

    int number;

    Node nextNode;

    static Node createNodes(int count) {

        Node node = new Node();

        node.number = 5;

        Node next = node; // посилання на наступний обьект

        for (int i = 0; i < count; i++) {
            next.nextNode = new Node();
            next.nextNode.number = next.number * 2;
            next = next.nextNode;
        }

        next.nextNode = node;

        return node;
    }

    static void show(Node node) {

        Node not = node;
        do {
            not = not.nextNode;
            if (not.number != 5) {
                System.out.print("|" + not.number);
            }

        } while (not.number != 5);
    }

    public static void main(String[] args) {
        Node node1 = createNodes(10);
        Node node2 = createNodes(15);
        show(node1);
        System.out.println();
        show(node2);

    }
}
