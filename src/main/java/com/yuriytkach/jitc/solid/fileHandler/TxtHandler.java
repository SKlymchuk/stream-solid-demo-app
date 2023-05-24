package com.yuriytkach.jitc.solid.fileHandler;

import com.yuriytkach.jitc.solid.fileHandler.FileHandler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TxtHandler implements FileHandler {
    @Override
    public boolean isApplicable(String filePath) {
        return filePath.endsWith(".txt");
    }

    @Override
    public String handle(String filePath) {
        try {
            return new String(Files.readAllBytes(Path.of(filePath)));
        } catch (IOException ex) {
            throw new IllegalArgumentException("Cannot read file " + filePath + ": " + ex.getMessage(), ex);
        }
    }
}
