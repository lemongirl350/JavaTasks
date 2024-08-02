package model;
<<<<<<< HEAD
=======

>>>>>>> origin/Task_1_updated
public class Kotik {
    private String name;
    private int prettiness;
    private int weight;
    private String meow;
    private int satiety;
    private static int counter;
<<<<<<< HEAD
    {
        counter++;
    }
    public Kotik(String name, int prettiness, int weight, String meow, int satiety) {
        this.name = name;
        this.prettiness = prettiness;
        this.weight = weight;
        this.meow = meow;
        this.satiety = satiety;
    }
    public Kotik() {
    }
    //methods of behavior
    private boolean play() {
        if (satiety <= 0) {
            return false;
        }
=======

    {
        counter++;
    }

    public Kotik (String name, int prettiness, int weight, String meow, int satiety) {
        this.name=name;
        this.prettiness=prettiness;
        this.weight=weight;
        this.meow=meow;
        this.satiety=satiety;
    }

    public Kotik () {
    }

    //methods of behavior
    private boolean play() {
>>>>>>> origin/Task_1_updated
        satiety -= 8;
        System.out.println(name + " is playing");
        return true;
    }
<<<<<<< HEAD
    private boolean sleep() {
        if (satiety <= 0) {
            return false;
        }
=======

    private boolean sleep() {
>>>>>>> origin/Task_1_updated
        satiety -= 3;
        System.out.println(name + " is sleeping");
        return true;
    }
<<<<<<< HEAD
    private boolean chaseMouse() {
        if (satiety <= 0) {
            return false;
        }
=======

    private boolean chaseMouse() {
>>>>>>> origin/Task_1_updated
        satiety -= 10;
        System.out.println(name + " is chasing the mouse");
        return true;
    }
<<<<<<< HEAD
    private boolean sharpenClaws() {
        if (satiety <= 0) {
            return false;
        }
=======

    private boolean sharpenClaws() {
>>>>>>> origin/Task_1_updated
        satiety -= 6;
        System.out.println(name + " is sharpening its claws");
        return true;
    }
<<<<<<< HEAD
    private boolean meow() {
        if (satiety <= 0) {
            return false;
        }
=======

    private boolean meow() {
>>>>>>> origin/Task_1_updated
        satiety -= 4;
        System.out.println(name + " is meowing: '" + meow + "!'");
        return true;
    }
<<<<<<< HEAD
    private void eat(int satietyUnits) {
        satiety += satietyUnits;
        System.out.println(name + " has eaten");
    }
    private void eat(int satietyUnits, String foodName) {
        satiety += satietyUnits;
        System.out.println(name + " has eaten " + foodName);
    }
    private void eat() {
=======

    private void eat (int satietyUnits) {
        satiety += satietyUnits;
        System.out.println(name + " has eaten");
    }

    private void eat (int satietyUnits, String foodName) {
        satiety += satietyUnits;
        System.out.println(name + " has eaten " + foodName);
    }

    private void eat () {
>>>>>>> origin/Task_1_updated
        int satietyUnits1 = 7;
        String foodName1 = "dry food";
        eat(satietyUnits1, foodName1);
    }
<<<<<<< HEAD
    public void liveAnotherDay() {
        for (int i = 1; i <= 24; i++) {
            int action = (int) (Math.random() * 5 + 1);
            boolean toDo = false;
            switch (action) {
                case 1:
                    toDo = play();
                    break;
                case 2:
                    toDo = sleep();
                    break;
                case 3:
                    toDo = chaseMouse();
                    break;
                case 4:
                    toDo = sharpenClaws();
                    break;
                case 5:
                    toDo = meow();
                    break;
            }
            if (!toDo) {
                int feedingManner = (int) (Math.random() * 3 + 1);
=======

    public void liveAnotherDay() {

        for (int i = 1; i <= 24; i++) {
            if (satiety <= 0) {
                int feedingManner = (int)(Math.random()*3 + 1);
>>>>>>> origin/Task_1_updated
                switch (feedingManner) {
                    case 1:
                        eat(6, "fish");
                        break;
                    case 2:
                        eat();
                        break;
                    case 3:
                        eat(7);
                        break;
                }
<<<<<<< HEAD
            }
        }
    }
=======
            } else {
                int action = (int) (Math.random() * 5 + 1);
                switch (action) {
                    case 1:
                        play();
                        break;
                    case 2:
                        sleep();
                        break;
                    case 3:
                        chaseMouse();
                        break;
                    case 4:
                        sharpenClaws();
                        break;
                    case 5:
                        meow();
                        break;
                }
            }
        }
    }

>>>>>>> origin/Task_1_updated
    //getters and setters
    public String getName() {
        return name;
    }
    public int getPrettiness() {
        return prettiness;
    }
    public int getWeight() {
        return weight;
    }
    public String getMeow() {
        return meow;
    }
    public int getSatiety() {
        return satiety;
    }
    public static int getCounter() {
        return counter;
    }
<<<<<<< HEAD
=======

>>>>>>> origin/Task_1_updated
    public void setKotik(String name, int prettiness, int weight, String meow, int satiety) {
        this.name = name;
        this.prettiness = prettiness;
        this.weight = weight;
        this.meow = meow;
        this.satiety = satiety;
    }
<<<<<<< HEAD
}
=======



}
>>>>>>> origin/Task_1_updated
