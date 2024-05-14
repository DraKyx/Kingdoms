package fr.drarka.systems;

import java.util.UUID;

public class Permission {

    private String id;
    private String name;

    public Permission(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean hasPermission(UUID player) {

        return false;
        
    }

}