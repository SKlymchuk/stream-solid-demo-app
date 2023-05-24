package com.yuriytkach.jitc.solid;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class FileProcessor {

  private final FileFinder fileFinder;

  private final FileDownloader fileDownloader;

  private final TextFileAnalyzer textFileAnalyzer;

  public long processLatestTextFile(final String wordToCount) {
    final List<String> latestFileKey = fileFinder.findLatestTextFile();
    final String latestFileContent = fileDownloader.downloadFileContent(latestFileKey);
    return textFileAnalyzer.countWordOccurrences(latestFileContent, wordToCount);
  }

}
