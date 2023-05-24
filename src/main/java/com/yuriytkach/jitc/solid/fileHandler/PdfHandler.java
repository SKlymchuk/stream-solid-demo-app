package com.yuriytkach.jitc.solid.fileHandler;

import com.yuriytkach.jitc.solid.fileHandler.FileHandler;

public class PdfHandler implements FileHandler {
    @Override
    public boolean isApplicable(String filePath) {
        return filePath.endsWith(".pdf");
    }

    @Override
    public String handle(String filePath)
    {
//        Do some pdf magic
        return null;
    }
}
