package com.example.futuretaskdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {


    @Test
    void getTotal() {
        Task task = new Task();
        assertEquals(6,task.getTotal());
    }
}