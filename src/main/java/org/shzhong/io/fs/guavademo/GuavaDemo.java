package org.shzhong.io.fs.guavademo;

import com.google.common.base.Charsets;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@Slf4j
public class GuavaDemo {
    private void log(String crunchifyText) {
        System.out.println(crunchifyText);

    }


    @Test
    public void testCopyFile() throws IOException {
        File original = new File("/Users/zhongshaohan/tmp/test.txt");
        File copy = new File("/Users/zhongshaohan/tmp/test2.txt");
        Files.copy(original, copy);
    }
    @Test
    public void testMoveFile() throws IOException {
        File original = new File("/Users/zhongshaohan/tmp/test.txt");
        File newFile = new File("/Users/zhongshaohan/tmp/test2.txt");
        Files.move(original, newFile);
    }
    @Test
    public void testFilesHashing() throws Exception{
        File file = new File("/Users/zhongshaohan/tmp/test2.txt");
        HashCode hashCode = Files.hash(file, Hashing.md5());
        System.out.println(hashCode);
    }
    @Test
    public void appendingWritingToFileTest() throws IOException {
        File file = new File("/Users/zhongshaohan/tmp/test2.txt");
        file.deleteOnExit();
        String hamletQuoteStart = "To be, or not to be";
        Files.write(hamletQuoteStart, file, Charsets.UTF_8);
        assertThat(Files.toString(file, Charsets.UTF_8), is(hamletQuoteStart));
        String hamletQuoteEnd = ",that is the question";
        Files.append(hamletQuoteEnd, file, Charsets.UTF_8);
        assertThat(Files.toString(file, Charsets.UTF_8), is(hamletQuoteStart + hamletQuoteEnd));
        String overwrite = "Overwriting the file";
        Files.write(overwrite, file, Charsets.UTF_8);
        assertThat(Files.toString(file, Charsets.UTF_8), is(overwrite));
    }
}
