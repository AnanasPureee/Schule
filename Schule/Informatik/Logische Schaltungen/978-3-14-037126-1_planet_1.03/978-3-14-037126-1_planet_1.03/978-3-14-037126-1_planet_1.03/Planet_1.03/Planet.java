import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die einzigen aktiven Akteure in der Roboterwelt sind die Roboter.
 * Die Welt besteht aus 14 * 10 Feldern.
 */

public class Planet extends World
{
    private static int zellenGroesse = 50;

    /**
     * Erschaffe eine Welt mit 15 * 12 Zellen.
     */
    public Planet()
    {
        super(16, 12, zellenGroesse);
        setBackground("images/boden.png");
        setPaintOrder(String.class, Rover.class, Marke.class, Gestein.class, Huegel.class);
        Greenfoot.setSpeed(20); 

        prepare();
    }

    
    /**
     * Bereite die Welt für den Programmstart vor.
     * Das heißt: Erzeuge die Anfangs-Objekte und füge sie der Welt hinzu.
     */
    private void prepare()
    {

        Huegel huegel = new Huegel();
        addObject(huegel,4,5);
        Huegel huegel2 = new Huegel();
        addObject(huegel2,4,4);
        Huegel huegel3 = new Huegel();
        addObject(huegel3,4,3);
        Huegel huegel4 = new Huegel();
        addObject(huegel4,5,3);
        Huegel huegel5 = new Huegel();
        addObject(huegel5,8,5);
        Huegel huegel6 = new Huegel();
        addObject(huegel6,11,5);
        Gestein gestein = new Gestein();
        addObject(gestein,12,5);
        Rover rover = new Rover();
        addObject(rover,1,5);
        huegel3.setLocation(12,2);
        huegel4.setLocation(11,2);
        huegel5.setLocation(10,2);
        huegel6.setLocation(10,2);
        Huegel huegel7 = new Huegel();
        addObject(huegel7,6,2);
        Huegel huegel8 = new Huegel();
        addObject(huegel8,5,2);
        huegel3.setLocation(4,2);
        Huegel huegel9 = new Huegel();
        addObject(huegel9,11,3);
        Huegel huegel10 = new Huegel();
        addObject(huegel10,11,4);
        Huegel huegel11 = new Huegel();
        addObject(huegel11,11,5);
        Huegel huegel12 = new Huegel();
        addObject(huegel12,11,6);
        Huegel huegel13 = new Huegel();
        addObject(huegel13,11,7);
        Huegel huegel14 = new Huegel();
        addObject(huegel14,11,8);
        Huegel huegel15 = new Huegel();
        addObject(huegel15,11,9);
        Huegel huegel16 = new Huegel();
        addObject(huegel16,11,10);
        Huegel huegel17 = new Huegel();
        addObject(huegel17,11,11);
        Huegel huegel18 = new Huegel();
        addObject(huegel18,10,11);
        Huegel huegel19 = new Huegel();
        addObject(huegel19,9,11);
        Huegel huegel20 = new Huegel();
        addObject(huegel20,8,11);
        Huegel huegel21 = new Huegel();
        addObject(huegel21,7,11);
        Huegel huegel22 = new Huegel();
        addObject(huegel22,6,11);
        Huegel huegel23 = new Huegel();
        addObject(huegel23,5,11);
        Huegel huegel24 = new Huegel();
        addObject(huegel24,4,11);
        Huegel huegel25 = new Huegel();
        addObject(huegel25,4,10);
        Huegel huegel26 = new Huegel();
        addObject(huegel26,4,9);
        Huegel huegel27 = new Huegel();
        addObject(huegel27,4,8);
        Huegel huegel28 = new Huegel();
        addObject(huegel28,4,7);
        Huegel huegel29 = new Huegel();
        addObject(huegel29,4,6);
        Huegel huegel30 = new Huegel();
        addObject(huegel30,4,5);
        Huegel huegel31 = new Huegel();
        addObject(huegel31,4,4);
        Huegel huegel32 = new Huegel();
        addObject(huegel32,4,3);
        Huegel huegel33 = new Huegel();
        addObject(huegel33,6,4);
        Huegel huegel34 = new Huegel();
        addObject(huegel34,7,5);
        Huegel huegel35 = new Huegel();
        addObject(huegel35,7,6);
        Huegel huegel36 = new Huegel();
        addObject(huegel36,5,6);
        Huegel huegel37 = new Huegel();
        addObject(huegel37,7,7);
        Huegel huegel38 = new Huegel();
        addObject(huegel38,6,8);
        Huegel huegel39 = new Huegel();
        addObject(huegel39,6,9);
        Huegel huegel40 = new Huegel();
        addObject(huegel40,7,9);
        Huegel huegel41 = new Huegel();
        addObject(huegel41,8,9);
        Huegel huegel42 = new Huegel();
        addObject(huegel42,9,9);
        Huegel huegel43 = new Huegel();
        addObject(huegel43,7,8);
        Huegel huegel44 = new Huegel();
        addObject(huegel44,8,8);
        Huegel huegel45 = new Huegel();
        addObject(huegel45,8,7);
        Huegel huegel46 = new Huegel();
        addObject(huegel46,8,6);
        Huegel huegel47 = new Huegel();
        addObject(huegel47,8,5);
        Huegel huegel48 = new Huegel();
        addObject(huegel48,9,4);
        Huegel huegel49 = new Huegel();
        addObject(huegel49,8,4);
        Huegel huegel50 = new Huegel();
        addObject(huegel50,7,4);
        Huegel huegel51 = new Huegel();
        addObject(huegel51,10,6);
        Huegel huegel52 = new Huegel();
        addObject(huegel52,10,7);
        gestein.setLocation(5,5);
        Huegel huegel53 = new Huegel();
        addObject(huegel53,7,2);
        Huegel huegel54 = new Huegel();
        addObject(huegel54,8,2);
        Huegel huegel55 = new Huegel();
        addObject(huegel55,9,2);
    }
}