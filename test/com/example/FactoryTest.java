package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void testFactory() {
        Factory factory = new Factory();
        Product productA = factory.createProduct("A");
        Product productB = factory.createProduct("B");

        assertEquals("Product A", productA.getName());
        assertEquals("Product B", productB.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnknownProduct() {
        Factory factory = new Factory();
        factory.createProduct("C");
    }
}
