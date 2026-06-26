package com.avltreeproject.avltree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AvlTreeTest {
    AvlTree test;

    @BeforeEach
    public void setUp() {
        test = new AvlTree();
    }

    @Test
    public void testInsertWithLeftLeftRebalance() {
        this.test.insert(30);
        this.test.insert(20);
        this.test.insert(10);

        verifyInsertRebalanceWithThreeNodes();
    }

    @Test
    public void testInsertWithLeftRightRebalance() {
        this.test.insert(30);
        this.test.insert(10);
        this.test.insert(20);

        verifyInsertRebalanceWithThreeNodes();
    }

    @Test
    public void testInsertWithRightLeftRebalance() {
        this.test.insert(10);
        this.test.insert(30);
        this.test.insert(20);

        verifyInsertRebalanceWithThreeNodes();
    }

    @Test
    public void testInsertWithRightRightRebalance() {
        this.test.insert(10);
        this.test.insert(20);
        this.test.insert(30);

        verifyInsertRebalanceWithThreeNodes();
    }

    private void verifyInsertRebalanceWithThreeNodes() {
        //TODO implement node traversal with avl
//        assertEquals(20, this.test.getRootNode().getValue());
//        assertEquals(10, this.test.getRootNode().getLeft().getValue());
//        assertEquals(30, this.test.getRootNode().getRight().getValue());
    }
}