import template_method.AbstractDisplay;
import template_method.CharDisplay;
import template_method.StringDisplay;

public class Main {

    public static void main(String[] args) {

        // Part 2. 하위 클래스에 위임하기

        // Chapter 3. 템플릿 메소드
        exTemplateMethod();

    }

    public static void exTemplateMethod() {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, World");
        AbstractDisplay d3 = new StringDisplay("안녕하세요");

        d1.display();
        d2.display();
        d3.display();
    }

}
