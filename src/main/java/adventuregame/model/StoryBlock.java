package adventuregame.model;

public class StoryBlock {

    private String label = null;
    private String storyText = null;

    public StoryBlock(String label, String storyText) {
        this.label = label;
        this.storyText = storyText;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getStoryText() {
        return storyText;
    }

    public void setStoryText(String storyText) {
        this.storyText = storyText;
    }
}
