package com.bootcamp.patterns.command;

import com.bootcamp.patterns.command.interfaces.FileSystem;

public class WindowsFileSystem implements FileSystem {

    @Override
    public void openFile() {
        System.out.println("Opening file in Windows OS.");

    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Windows OS.");

    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Windows OS.");

    }

}
