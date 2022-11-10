package com.bootcamp.patterns.command.util;

import com.bootcamp.patterns.command.UnixFileSystem;
import com.bootcamp.patterns.command.WindowsFileSystem;
import com.bootcamp.patterns.command.interfaces.FileSystem;

public class FileSystemUtil {
    public static FileSystem getUnderlyingFileSystem() {
        final String operatingSystemName = System.getProperty("os.name");
        System.out.println(String.format("OS: " + operatingSystemName));
        if (operatingSystemName.contains("Windows")) {
            return new WindowsFileSystem();
        }
        return new UnixFileSystem();
    }
}
