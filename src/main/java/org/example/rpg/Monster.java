package org.example.rpg;

public abstract class Monster {
    //name => String, hitPoints => int, damage => double
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double attack() {
        double totalDamage = getDamage();
        if (this instanceof Bleedable) {
            totalDamage += ((Bleedable) this).bleed();
        }
        if (this instanceof Poisonable) {
            totalDamage += ((Poisonable) this).poison();
        }
        return totalDamage;
    }
}





