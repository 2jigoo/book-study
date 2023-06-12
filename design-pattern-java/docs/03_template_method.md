# Chapter 3. Template Method

```java
public abstract class TemplateClass {
    
    public abstract doSomething();
    public abstract doSomethingElse();
    
    public final void doIt() {
        // ... common logic
        doSomething();
        // ... common logic
        doSomethingElse();
        // ... common logic
    }
}
```

- 처리의 큰 흐름은 상위 클래스에서 결정
- 구체적인 내용(구현)은 하위 클래스에서 결정


- 로직 공통화
  - 상위 클래스의 템플릿 메서드에 알고리즘 기술, 하위 클래스에 알고리즘 기술 X
  - 템플릿 메소드에 오류가 있다면 템플릿 메소드만 수정하면 됨

- 상위 클래스와 하위 클래스의 연계
  - 상위 클래스에서 선언된 추상 메소드를 하위 클래스에 구현할 때는, 그 메소드가 어느 타이밍에서 호출되는 지 이해해야 함

- 리스코프 치환 원칙 (LSP, Liskov Substitution Principle)
  - 서브 타입은 언제나 기반 타입으로 교체될 수 있다.
  - 상위 클래스형의 변수에 하위 클래스의 어떠한 인스턴스를 대입해도 제대로 작동할 수 있도록 한다.
