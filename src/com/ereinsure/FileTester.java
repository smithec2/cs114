package com.ereinsure;

import java.io.File;
import java.io.FileFilter;

public class FileTester {

    public static void main(String[] args) {

        FileFilter filter2 = (File file) -> file.getName().endsWith(".java");

        File dir = new File("c:\temp");
        File[] javaFile = dir.listFiles(filter2);
    }
}


