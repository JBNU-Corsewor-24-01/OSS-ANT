package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void testSingleton() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        assertSame(instance1, instance2);
        assertEquals("Hello from Singleton", instance1.getMessage());
    }
}
