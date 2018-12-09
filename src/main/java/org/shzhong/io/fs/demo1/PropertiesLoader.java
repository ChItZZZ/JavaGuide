package org.shzhong.io.fs.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 */
public abstract class PropertiesLoader {

    public static void main( String[] args ) throws IOException {

        //1.读取resources目录下文件
        String path = "/config.properties";
        Properties props = PropertiesLoader.readFile(path);
        System.out.println("path: "+ path + ", props: " + props);

        //2. 读取resources/data
        path = "/data/db.properties";
        props = PropertiesLoader.readFile(path);
        System.out.println("path: "+ path + ", props: " + props);

        System.out.println("=====================================");

        //3.读取类路径下(src) 资源文件
        path = "cfg/app.properties";
        props = PropertiesLoader.readFile(path);
        System.out.println("path: "+ path + ", props: " + props);

        //4.使用绝对路径读取资源文件
        path = "/com/mindflow/demo/cfg/app.properties";
        props = PropertiesLoader.readFile(path);
        System.out.println("path: "+ path + ", props: " + props);

    }

    public static Properties readFile(String path) throws IOException {
        InputStream in = PropertiesLoader.class.getResourceAsStream(path);
        Properties props = load(in);
        return props;
    }

    public static Properties load(InputStream in) throws IOException {
        Properties props = new Properties();
        props.load(in);
        return props;
    }
}
