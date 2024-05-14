package fr.drarka.systems;

import java.util.Map;
import java.util.UUID;

public class Kingdom {

    private String name;
    private Map<UUID, Integer> members;
    private int money;
    private UUID king;
    private int points;

    public Kingdom(String name, Map<UUID, Integer> members, int money, UUID king, int points) {

        this.name = name;
        this.members = members;
        this.money = money;
        this.king = king;
        this.points = points;
        
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int value) {
        this.money = value;
    }

    public Map<UUID, Integer> getMembers() {
        return members;
    }

    public void addMember(UUID id, Integer perm) {
        this.members.put(id, perm);
    }

    public void removeMember(UUID id) {
        this.members.remove(id);
    }

    public UUID getKing() {
        return king;
    }

    public void setKing(UUID id) {
        this.king = id;
    }


    public String getName() {
        return name;
    }


    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    // STORAGE //

    public void loadKingdoms() {

    }

    public void saveKingdoms() {

    }

}