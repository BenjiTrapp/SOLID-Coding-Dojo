package open_closed.good;

import open_closed.good.personalities.DefaultPersonality;
import open_closed.good.personalities.Personality;

public class Greeter {
    private Personality personality;

    public Greeter(Personality personality) {
        this.personality = personality == null ? new DefaultPersonality() : personality;
    }

    public void changePersonality(Personality personality) { this.personality = personality; }

    public String greet() {
        return this.personality.greet();
    }
}
