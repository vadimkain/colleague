package com.kain;

// ОДОМАШНЕНІ
abstract class Domesticated implements Animal {
    private String name;
    private Boolean vaccinated;

    public Domesticated(String name, Boolean vaccinated) {
        this.name = name;
        this.vaccinated = vaccinated;
    }

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
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

// ХУДОБА
class Livestock extends Domesticated {

    private Boolean factoryFeed;

    public Livestock(String name, Boolean vaccinated, Boolean factoryFeed) {
        super(name, vaccinated);
        this.factoryFeed = factoryFeed;
    }

    public Boolean getFactoryFeed() {
        return factoryFeed;
    }

    public void setFactoryFeed(Boolean factoryFeed) {
        this.factoryFeed = factoryFeed;
    }

    @Override
    public String move() {
        return "Moving slowly in the pasture.";
    }

    @Override
    public String communicate() {
        return "Making sounds to communicate with other livestock.";
    }

    @Override
    public String eat() {
        if (factoryFeed) {
            return "Eating factory feed.";
        } else {
            return "Eating forage feed.";
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

// ДОМАШНІ
class Pet extends Domesticated {

    private Boolean scheduledEating;

    private Boolean livesInAHome;

    public Pet(String name, Boolean vaccinated, Boolean scheduledEating, Boolean livesInAHome) {
        super(name, vaccinated);
        this.scheduledEating = scheduledEating;
        this.livesInAHome = livesInAHome;
    }

    public Boolean getLivesInAHome() {
        return livesInAHome;
    }

    public void setLivesInAHome(Boolean livesInAHome) {
        this.livesInAHome = livesInAHome;
    }

    public Boolean getScheduledEating() {
        return scheduledEating;
    }

    public void setScheduledEating(Boolean scheduledEating) {
        this.scheduledEating = scheduledEating;
    }

    @Override
    public String move() {
        return "Moving around the house or yard.";
    }

    @Override
    public String communicate() {
        return "Making sounds or body language to communicate with humans.";
    }

    @Override
    public String eat() {
        if (scheduledEating) {
            return "Eating on a schedule.";
        } else {
            return "Eating on a free choice.";
        }
    }

    @Override
    public void information() {
        System.out.println("""
                Name : %s 
                Eat : %s 
                Communicate : %s 
                Move : %s 
                Lives : %s
                """.formatted(getName(), eat(), communicate(), move(), livesInAHome ? "Lives at home" : "Lives in a barn"));
    }

}