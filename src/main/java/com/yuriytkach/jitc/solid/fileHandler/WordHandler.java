package com.yuriytkach.jitc.solid.fileHandler;

import com.yuriytkach.jitc.solid.fileHandler.FileHandler;

public class WordHandler implements FileHandler {
    @Override
    public boolean isApplicable(String filePath) {
        return filePath.endsWith(".doc");
    }

    @Override
    public String handle(String filePath) {
//        word magic
        return null;
    }
}
