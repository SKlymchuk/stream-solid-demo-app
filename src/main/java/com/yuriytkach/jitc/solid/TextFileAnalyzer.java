package com.yuriytkach.jitc.solid;

import java.util.stream.Stream;

public class TextFileAnalyzer {

  public long countWordOccurrences(final String fileContent, final String wordToCount) {
    return Stream.of(fileContent.split("\\s+"))
      .filter(wordToCount::equalsIgnoreCase)
      .count();
  }
}
