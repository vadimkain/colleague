package com.kain;

// ДИКІ
abstract class Wild implements Animal {
    private String name;
    private Boolean isGregarious;

    public Wild(String name, Boolean isGregarious) {
        this.name = name;
        this.isGregarious = isGregarious;
    }

    public Boolean getGregarious() {
        return isGregarious;
    }

    public void setGregarious(Boolean gregarious) {
        isGregarious = gregarious;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

// ХИЖАК
class Carnivorous extends Wild {
    private boolean hunting;

    public Carnivorous(String name, Boolean isGregarious, Boolean hunting) {
        super(name, isGregarious);
        this.hunting = hunting;
    }

    public boolean isHunting() {
        return hunting;
    }

    public void setHunting(boolean hunting) {
        this.hunting = hunting;
    }

    @Override
    public String move() {
        return "Moving quickly and stealthily.";
    }

    @Override
    public String communicate() {
        return "Using vocalizations, body language, and scent to communicate with other animals.";
    }

    @Override
    public String eat() {
        if (hunting) {
            return "Hunting for prey.";
        } else {
            return "Scavenging for carrion.";
        }
    }

    @Override
    public void information() {
        System.out.println("""
                Name : %s
                Eat : %s
                Communicate : %s
                Move : %s
                """.formatted(getName(), eat(), communicate(), move()));
    }


}

// ТРАВОЇДНІ
class Herbivorous extends Wild {
    private Boolean plantType;

    public Herbivorous(String name, Boolean isGregarious, Boolean plantType) {
        super(name, isGregarious);
        this.plantType = plantType;
    }

    public Boolean getPlantType() {
        return plantType;
    }

    public void setPlantType(Boolean plantType) {
        this.plantType = plantType;
    }

    @Override
    public String move() {
        return "Moving slowly and grazing or browsing as they go.";
    }

    @Override
    public String communicate() {
        return "Using vocalizations, body language, and scent to communicate with other animals.";
    }

    @Override
    public String eat() {
        if (plantType) {
            return "Browsing on leaves and twigs.";
        } else {
            return "Grazing on grass and other plants.";
        }
    }

    @Override
    public void information() {
        System.out.println("""
                Name : %s
                Eat : %s
                Communicate : %s
                Move : %s
                """.formatted(getName(), eat(), communicate(), move()));
    }

}
