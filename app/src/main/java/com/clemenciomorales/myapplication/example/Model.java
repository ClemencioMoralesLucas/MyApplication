package com.clemenciomorales.myapplication.example;

public class Model {

    private int position;

    private String techniqueName;

    public Model(int position, String techniqueName) {
        this.setPosition(position);
        this.setTechniqueName(techniqueName);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    private boolean isChecked;

    public boolean getChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getTechniqueName() {
        return techniqueName;
    }

    public void setTechniqueName(String techniqueName) {
        this.techniqueName = techniqueName;
    }

    @Override
    public String toString() {
        return position + "." + techniqueName;
    }
}
