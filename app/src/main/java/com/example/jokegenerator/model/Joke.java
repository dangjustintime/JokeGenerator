package com.example.jokegenerator.model;

/**
 * Created by Justin Dang on 9/1/2017.
 */

public class Joke {


    private int id;
    private String setup;
    private String punchLine;

    public Joke(int id, String setup, String punchLine) {
        this.id = id;
        this.setup = setup;
        this.punchLine = punchLine;
    }

    //getters and setters
    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchLine() {
        return punchLine;
    }

    public void setPunchLine(String punchLine) {
        this.punchLine = punchLine;
    }
}
