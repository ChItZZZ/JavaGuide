package org.shzhong.serialization;

import org.junit.Test;

import java.io.*;

public class Person implements Serializable {
//    private static final long serialVersionUID = 1L;
    private static final long serialVersionUID = 2L;
    public String name;
    public String email;


    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SerializaDemo{" +
                "name='" + name + '\'' +
                '}';
    }



}
