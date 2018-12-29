package org.shzhong.enumdemo;

public enum ErrCode {

    PARAMS_ERR(100), SERVER_ERR(200), SUCCESS(300);

    private int name;

    ErrCode(int name) {
        this.name = name;
    }
    int showCode(){
        return name;
    }
}
