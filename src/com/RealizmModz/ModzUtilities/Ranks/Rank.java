package com.RealizmModz.ModzUtilities.Ranks;

public class Rank {
    public String rankName;
    public String color;
    public String permissionGroup;
    public int weight;

    public Rank(String name, String color, String permission, int weight) {
        this.rankName = name;
        this.color = color;
        this.permissionGroup = permission;
        this.weight = weight;
    }
}
