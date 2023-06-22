package lessons.oop.textanalyzer;

import java.util.Arrays;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    public abstract String[] getKeywords();

    public abstract Label getLabel();

    public Label processText(String text){
        return Arrays.stream(getKeywords()).anyMatch(text::contains) ? getLabel() : Label.OK;
    }
}
