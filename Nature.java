

public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();
    

        Eagle eyeCherry = new Eagle("Eagle");
        eyeCherry.takeOff();
        eyeCherry.ascend(120);
        eyeCherry.ascend(150);
        eyeCherry.glide();
        eyeCherry.descend(10);
        eyeCherry.land();
        eyeCherry.descend(1);
        eyeCherry.land();
    }
}
