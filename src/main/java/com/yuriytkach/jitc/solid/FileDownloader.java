package com.yuriytkach.jitc.solid;

import com.yuriytkach.jitc.solid.fileHandler.FileHandler;
import com.yuriytkach.jitc.solid.fileHandler.PdfHandler;
import com.yuriytkach.jitc.solid.fileHandler.TxtHandler;
import com.yuriytkach.jitc.solid.fileHandler.WordHandler;

import java.util.List;

public class FileDownloader {

    //  DI
    private final List<FileHandler> handlers = List.of(new PdfHandler(), new TxtHandler(), new WordHandler());

    public String downloadFileContent(final List<String> filePath) {
        for (String path : filePath) {
            for (FileHandler fileHandler : handlers) {
                if (fileHandler.isApplicable(path)) {
                    return fileHandler.handle(path);
                }
            }
        }

        throw new IllegalArgumentException("Cannot read any file : " + filePath);
    }

}
