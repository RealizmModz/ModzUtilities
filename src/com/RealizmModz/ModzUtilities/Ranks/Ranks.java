package com.RealizmModz.ModzUtilities.Ranks;

import java.util.ArrayList;
import java.util.Arrays;

public class Ranks {
    public static final Rank OWNER = new Rank("Owner", "§5", "group.owner", 100);
    public static final Rank ADMIN = new Rank("Admin", "§4", "group.admin", 90);
    public static final Rank DEVELOPER = new Rank("Developer", "§d", "group.dev", 80);
    public static final Rank BUILDER = new Rank("Builder", "§6", "group.builder", 70);
    public static final Rank MOD = new Rank("Mod", "§a", "group.mod", 60);
    public static final Rank HELPER = new Rank("Helper", "§b", "group.helper", 50);
    public static final Rank NONE = new Rank("", "", "group.default", 0);
    public static final ArrayList<Rank> rankList = new ArrayList<Rank>(Arrays.asList(OWNER, ADMIN, DEVELOPER, BUILDER, MOD, HELPER, NONE));
}