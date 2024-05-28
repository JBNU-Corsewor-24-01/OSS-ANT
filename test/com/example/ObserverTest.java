package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class ObserverTest {
    @Test
    public void testObserver() {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver("Observer1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setMessage("Hello Observers");

        assertEquals("Hello Observers", observer1.getMessage());
        assertEquals("Hello Observers", observer2.getMessage());

        subject.removeObserver(observer1);
        subject.setMessage("New Message");

        assertEquals("Hello Observers", observer1.getMessage());
        assertEquals("New Message", observer2.getMessage());
    }
}
