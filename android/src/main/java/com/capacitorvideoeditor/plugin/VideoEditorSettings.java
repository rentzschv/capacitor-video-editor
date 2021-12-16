package com.capacitorvideoeditor.plugin;

public class VideoEditorSettings {
    public static final int DEFAULT_QUALITY = 90;
    public static final boolean DEFAULT_SAVE_IMAGE_TO_GALLERY = false;
    public static final boolean DEFAULT_CORRECT_ORIENTATION = true;

    private int quality = DEFAULT_QUALITY;
    private boolean shouldResize = false;
    private boolean shouldCorrectOrientation = DEFAULT_CORRECT_ORIENTATION;
    private boolean saveToGallery = DEFAULT_SAVE_IMAGE_TO_GALLERY;
    private boolean allowEditing = false;
    private int width = 0;
    private int height = 0;

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public boolean isShouldResize() {
        return shouldResize;
    }

    public void setShouldResize(boolean shouldResize) {
        this.shouldResize = shouldResize;
    }

    public boolean isShouldCorrectOrientation() {
        return shouldCorrectOrientation;
    }

    public void setShouldCorrectOrientation(boolean shouldCorrectOrientation) {
        this.shouldCorrectOrientation = shouldCorrectOrientation;
    }

    public boolean isSaveToGallery() {
        return saveToGallery;
    }

    public void setSaveToGallery(boolean saveToGallery) {
        this.saveToGallery = saveToGallery;
    }

    public boolean isAllowEditing() {
        return allowEditing;
    }

    public void setAllowEditing(boolean allowEditing) {
        this.allowEditing = allowEditing;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}