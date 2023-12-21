package org.homework.tackWithLiamda.referenses;

// Напишіть програму, в якій є клас з закритим текстовим полем і два відкритих
//методи: один дозволяє присвоїти значення полю, інший результатом повертає
//значення цього поля. Створіть два функціональних інтерфейси, абстрактні методи
//в яких відповідають описанню методів у класі. Створіть об’єкт класу. Для кожного
//з інтерфейсів створіть інтерфейсну змінну і значенням присвойте посилання на
//відповідний метод об’єкта

class Functional2 {
    public Functional2(String text) {
        this.text = text;
    }

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

interface TextGetter {
    String textGet();
}

interface TextSetter {
    void texSet(String text);

}

class Tester {
    public static void main(String[] args) {

        Functional2 f = new Functional2("uno");
        System.out.println("Object has been created!");
        TextGetter textGetter = f::getText;
        TextSetter textSetter = f::setText;
        System.out.println(textGetter.textGet());
        textSetter.texSet("kvanto");
        System.out.println(textGetter.textGet());

    }
}
