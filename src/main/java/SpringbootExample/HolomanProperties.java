package SpringbootExample;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("holoman")
public class HolomanProperties {
    private String name;
    private int HowLong;

    public int getHowLong() {
        return HowLong;
    }

    public void setHowLong(int howLong) {
        HowLong = howLong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
