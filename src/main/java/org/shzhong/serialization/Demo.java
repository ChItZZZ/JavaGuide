package org.shzhong.serialization;

import lombok.Data;

import java.io.Serializable;

@Data
public class Demo implements Serializable {

    //idea auto generate
    private static final long serialVersionUID = -7567023525809235312L;
    public String name;
    public Integer age;


}
