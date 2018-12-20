package org.shzhong.thread.demo4;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.List;

/**
 * author:zhongshaohan
 * date:2018/12/17
 * description:业务处理
 */
public class ConCallable implements Callable {
    private List<String> list;

    @Override
    public Object call() throws Exception {
        List<String> listRe = new ArrayList<>();
        for (String aList : list) {
            //含有‘4599’的字符串都返回
            if (aList.contains("4599")) {
                listRe.add(aList);
            }
        }
        return listRe;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
 
