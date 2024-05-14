package fr.drarka.systems;

import java.util.List;

public class Role {

    private String id;
    private String name;
    private int level;
    private List<Permission> perms;

    public Role(String id, String name, int level, List<Permission> perms) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.perms = perms;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    public List<Permission> getPermissions() {
        return this.perms;
    }


}