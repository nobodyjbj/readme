package me.nobody.classdiagram.dependency;

public class Service {
    private final me.nobody.classdiagram.dependency.Logger logger; // Logger 클래스에 의존성

    public Service(Logger logger) {
        this.logger = logger;
    }

    public void doSomething() {
        logger.log("Service operation executed."); // Logger 클래스의 log 메서드 호출
    }
}
