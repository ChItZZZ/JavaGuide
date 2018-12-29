package org.shzhong.enumdemo;

public class Demo {
    public static void main(String[] args) {
        for(ErrCode errCode:ErrCode.values()){
            System.out.println(errCode.showCode());
        }
        ErrCode paramsErr = ErrCode.PARAMS_ERR;
        System.out.println(paramsErr);
    }
}
