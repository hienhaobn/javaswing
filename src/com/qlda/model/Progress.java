
package com.qlda.model;

/**
 *
 * @author hienh
 */
public class Progress {
    private int progress_id;
    private String progress_name;

    public int getProgress_id() {
        return progress_id;
    }

    public void setProgress_id(int progress_id) {
        this.progress_id = progress_id;
    }

    public String getProgress_name() {
        return progress_name;
    }

    public void setProgress_name(String progress_name) {
        this.progress_name = progress_name;
    }

    @Override
    public String toString() {
        return "Progress{" + "progress_id=" + progress_id + ", progress_name=" + progress_name + '}';
    }
    
}
