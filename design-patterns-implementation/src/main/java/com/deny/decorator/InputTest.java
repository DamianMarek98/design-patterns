package com.deny.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        System.getProperty("user.dir");
        try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\zmddd\\Desktop\\Nauka\\Training\\design-patterns\\design-patterns-implementation\\src\\main\\java\\com\\deny\\decorator\\test.txt")))) {
            while((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        }

    }
}
