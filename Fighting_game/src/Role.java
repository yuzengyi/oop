import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    // define a fight measure
    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20)+1;     

        int remainBoold = role.getBlood()-hurt;
        remainBoold = remainBoold<0?0:remainBoold;
        role.setBlood(remainBoold);

        System.out.println(this.getName()+" fight "+role.getName()+" for "+hurt+" blood "+", "+role.getName()+" remain "+remainBoold+" blood.");

    }
}
