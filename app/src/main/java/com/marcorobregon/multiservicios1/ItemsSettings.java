package com.marcorobregon.multiservicios1;

public class ItemsSettings {
    String name;
    int icon;
    int nextIcon;

    public ItemsSettings(String name, int icon, int nextIcon) {
        this.name = name;
        this.icon = icon;
        this.nextIcon = nextIcon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getNextIcon() {
        return nextIcon;
    }

    public void setNextIcon(int nextIcon) {
        this.nextIcon = nextIcon;
    }
}
