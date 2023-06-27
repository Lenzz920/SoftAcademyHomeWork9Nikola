public class Main {

    public static void main(String[] args) {

        Lamp roomLamp = new RoomLamp("black", "green", "Ikea", 20);
        Lamp deskLamp = new DeskLamp("yellow", "purple", "Ikea", 50);
        ClapLamp clapLamp = new ClapLamp("blue", "RGB", "Ikea", 80);

        roomLamp.checkStatus();
        deskLamp.checkStatus();
        clapLamp.checkStatus();

        System.out.println();

        roomLamp.turnLampOff();
        deskLamp.turnLampOff();
        clapLamp.clapYourHands();

        System.out.println();

        roomLamp.checkStatus();
        deskLamp.checkStatus();
        clapLamp.checkStatus();

        System.out.println();

        roomLamp.turnLampOn();
        deskLamp.turnLampOn();
        clapLamp.clapYourHands();

        System.out.println();

        roomLamp.checkStatus();
        deskLamp.checkStatus();
        clapLamp.checkStatus();

        System.out.println();

        roomLamp.turnLampOn();
        deskLamp.turnLampOn();
        clapLamp.clapYourHands();

        System.out.println();

        roomLamp.checkStatus();
        deskLamp.checkStatus();
        clapLamp.checkStatus();

    }

}