package com.yuriytkach.jitc.solid.fileHandler;

public interface FileHandler {
    boolean isApplicable(String filePath);
    String handle(String filePath);
}
