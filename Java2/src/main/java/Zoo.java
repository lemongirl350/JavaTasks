import animals.*;
import food.*;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Herb herb1 = new Herb("bunch of fresh grass");
        Seaweed seaweed1 = new Seaweed("juicy kelp");
        Leaves leaves1 = new Leaves("tasty birch leaves");
        Shrimp shrimp1 = new Shrimp("crispy shrimp");
        Mouse mouse1 = new Mouse("tiny mouse");
        Rabbit rabbit1 = new Rabbit("fluffy rabbit");
        Duck duck1 = new Duck("little gray duck");
        Cow cow1 = new Cow("brown sad cow");
        Lama lama1 = new Lama("melancholic lama");
        Fish fish1 = new Fish("piranha");
        Eagle eagle1 = new Eagle("bold eagle");
        Wolf wolf1 = new Wolf("hungry big wolf");
        Worker worker1 = new Worker();
        worker1.feed(duck1, herb1);
        worker1.getVoice(duck1);
        worker1.feed(cow1, shrimp1);
        worker1.getVoice(cow1);
        worker1.feed(lama1, shrimp1);
        worker1.getVoice(lama1);
        worker1.feed(fish1, shrimp1);
        //worker1.getVoice(fish1);
        worker1.feed(eagle1, seaweed1);
        worker1.getVoice(eagle1);
        worker1.feed(wolf1, rabbit1);
        worker1.getVoice(wolf1);
        ArrayList<Swim> pond = new ArrayList<>();
        pond.add(new Duck("duckInPond_0"));
        pond.add(new Duck("duckInPond_1"));
        pond.add(new Duck("duckInPond_2"));
        pond.add(new Fish("fishInPond_0"));
        pond.add(new Fish("fishInPond_1"));
        pond.add(new Fish("fishInPond_2"));
        for (Swim animal : pond) {
            animal.swim();
        }
    }
}
