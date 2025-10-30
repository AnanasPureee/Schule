import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rover extends Actor
{
    private Display anzeige;
    
    public void Labarinth() {
        while (!gesteinVorhanden()) {
            fahre();
            if (huegelVorhanden("links") && huegelVorhanden("vorne")){
                drehe("rechts");
            }if (huegelVorhanden("rechts") && huegelVorhanden("vorne")){
                drehe("links");
            }
        }
        analysiereGestein();
        }
    
    
    public void gesteinkette(){
          int schritte = 0; 
            while(!markeVorhanden()){
                fahre();
                schritte++;
                if (gesteinVorhanden() && huegelVorhanden("links")){
                    analysiereGestein();
            }
        }
        drehe("links");
        drehe("links");
        for(int i=schritte; i>0; i--){
            fahre();
            schritte++;
        }
        drehe("rechts");
        drehe("rechts");
    }
    
    public void folgeMarker(){
        while(markeVorhanden() && !huegelVorhanden("vorne")){
            fahre();
        }
        drehe("links");
        folgeMarker();
    }
    
    public void findeGestein(){
        if (!gesteinVorhanden()){
        while(!huegelVorhanden("vorne")){
            fahre();
        }
        drehe("links");
        int entfernung = 0;
        for (int i=0; i<2; i++){
        while(huegelVorhanden("rechts")){
            fahre();
            if (i == 0){
                entfernung++;
            }
        }
        drehe("rechts");
        fahre();
        }
        
        for(int i=entfernung -1; i>0; i--){
            fahre();
        }
        drehe("links");
        findeGestein();
        }else {
            analysiereGestein();
        }
    }

    
    public void meinProgramm()
    {
        setzeMarke();
        fahre();
        fahre();
        fahre();
        fahre();
        drehe("links");
        fahre();
        fahre();
        fahre();
        fahre();
        meinProgramm();
    }
    
    
    
    public void Schleife()
    {
        int schritte = 0;
        
        while(!gesteinVorhanden())
        {
            fahre();
            schritte++;
        }
        for(int i=5; i>0; i--)
        {
            analysiereGestein();
            fahre();
            schritte++;
        }
        drehe("rechts");
        drehe("rechts");
        for(int i=0; i<schritte; i++)
        {
            fahre();
        }
    }
    public void Aufgabe6()
    {
        while(huegelVorhanden("vorne"))
        {
            drehe("rechts");
        }
        
        do
        {
            drehe("rechts");
        }
        while(huegelVorhanden("vorne"));
        
        while(!gesteinVorhanden())
        {
            fahre();
        }
        
        do
        {
            fahre();
        }
        while(!huegelVorhanden("rechts"));
    }
    
    public void Aufgabe7()
    {
        while(!huegelVorhanden("vorne"))
        {
            fahre();
        }
        while(!gesteinVorhanden())
        {
            fahre();
        }
        analysiereGestein();
    
    }
    
    
    
    public void test()
   {
       while(!markeVorhanden())
       {
           setzeMarke();
           fahre();
       }
   }
    
   public void act3()
   {
       while(!markeVorhanden())
       {
           while(huegelVorhanden("rechts"))
           {
               if(!huegelVorhanden("vorne"))
               {
                  fahre();
                }
               else
               {
                   //Ausweichmanöver
                   drehe("links");
                   fahre();
                   //drehe("rechts");
                   //fahre();
               }
           }
           drehe("rechts");
           fahre();
           
       }
 }
   
   
   
    public void act2()
    {
        
          fahre();
          fahre();
          fahre();
          fahre();
          fahre();
          setzeMarke();
          fahre();
          
        
        
        
        
    }
    
    public void act() 
    {
          fahre();
          fahre();
          fahre();
          fahre();
          fahre();
          entferneMarke();
          fahre();
          
          
    } 


    /**
     * Der Rover bewegt sich ein Feld in Fahrtrichtung weiter.
     * Sollte sich in Fahrtrichtung ein Objekt der Klasse Huegel befinden oder er sich an der Grenze der Welt befinden,
     * dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public void fahre()
    {
        int posX = getX();
        int posY = getY();

        if(huegelVorhanden("vorne"))
        {
            nachricht("Zu steil!");
        }
        else if(getRotation()==270 && getY()==1)
        {
            nachricht("Ich kann mich nicht bewegen");
        }
        else
        {
            move(1);
            Greenfoot.delay(1);
        }

        if(posX==getX()&&posY==getY()&&!huegelVorhanden("vorne"))
        {
            nachricht("Ich kann mich nicht bewegen");
        }
    }

    /**
     * Der Rover dreht sich um 90 Grad in die Richtung, die mit richtung („links“ oder „rechts“) übergeben wurde.
     * Sollte ein anderer Text (String) als "rechts" oder "links" übergeben werden, dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public void drehe(String richtung)
    {
        if(richtung=="rechts")
        {
            setRotation(getRotation()+90);
        }
        else if (richtung=="links")
        {
            setRotation(getRotation()-90);
        }
        else
        {
            nachricht("Befehl nicht korrekt!");
        }
    }

    /**
     * Der Rover gibt durch einen Wahrheitswert (true oder false )zurück, ob sich auf seiner Position ein Objekt der Klasse Gestein befindet.
     * Eine entsprechende Meldung erscheint auch auf dem Display.
     */
    public boolean gesteinVorhanden()
    {
        if(getOneIntersectingObject(Gestein.class)!=null)
        {
            nachricht("Gestein gefunden!");
            return true;

        }

        return false;
    }

    /**
     * Der Rover überprüft, ob sich in richtung ("rechts", "links", oder "vorne") ein Objekt der Klasse Huegel befindet.
     * Das Ergebnis wird auf dem Display angezeigt.
     * Sollte ein anderer Text (String) als "rechts", "links" oder "vorne" übergeben werden, dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public boolean huegelVorhanden(String richtung)
    {
        int rot = getRotation();

        if (richtung=="vorne" && rot==0 || richtung=="rechts" && rot==270 || richtung=="links" && rot==90)
        {
            if(getOneObjectAtOffset(1,0,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(1,0,Huegel.class)).getSteigung() >30)
            {
                return true;
            }
        }

        if (richtung=="vorne" && rot==180 || richtung=="rechts" && rot==90 || richtung=="links" && rot==270)
        {
            if(getOneObjectAtOffset(-1,0,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(-1,0,Huegel.class)).getSteigung() >30)
            {
                return true;
            }
        }

        if (richtung=="vorne" && rot==90 || richtung=="rechts" && rot==0 || richtung=="links" && rot==180)
        {
            if(getOneObjectAtOffset(0,1,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(0,1,Huegel.class)).getSteigung() >30)
            {
                return true;
            }

        }

        if (richtung=="vorne" && rot==270 || richtung=="rechts" && rot==180 || richtung=="links" && rot==0)
        {
            if(getOneObjectAtOffset(0,-1,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(0,-1,Huegel.class)).getSteigung() >30)
            {
                return true;
            }

        }

        if(richtung!="vorne" && richtung!="links" && richtung!="rechts")
        {
            nachricht("Befehl nicht korrekt!");
        }

        return false;
    }

    /**
     * Der Rover ermittelt den Wassergehalt des Gesteins auf seiner Position und gibt diesen auf dem Display aus.
     * Sollte kein Objekt der Klasse Gestein vorhanden sein, dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public void analysiereGestein()
    {
        if(gesteinVorhanden())
        {
            nachricht("Gestein untersucht! Wassergehalt ist " + ((Gestein)getOneIntersectingObject(Gestein.class)).getWassergehalt()+"%.");
            Greenfoot.delay(1);
            removeTouching(Gestein.class);
        }
        else 
        {
            nachricht("Hier ist kein Gestein");
        }
    }

    /**
     * Der Rover erzeugt ein Objekt der Klasse „Markierung“ auf seiner Position.
     */
    public void setzeMarke()
    {
        getWorld().addObject(new Marke(), getX(), getY());
    }

    /**
     * *Der Rover gibt durch einen Wahrheitswert (true oder false )zurück, ob sich auf seiner Position ein Objekt der Marke befindet.
     * Eine entsprechende Meldung erscheint auch auf dem Display.
     */
    public boolean markeVorhanden()
    {
        if(getOneIntersectingObject(Marke.class)!=null)
        {
            return true;
        }

        return false;
    }

    public void entferneMarke()
    {
        if(markeVorhanden())
        {
            removeTouching(Marke.class);
        }
    }

    private void nachricht(String pText)
    {
        if(anzeige!=null)
        {
            anzeige.anzeigen(pText);
            Greenfoot.delay(1);
            anzeige.loeschen();
        }
    }

    private void displayAusschalten()
    {
        getWorld().removeObject(anzeige);

    }

    protected void addedToWorld(World world)
    {

        setImage("images/rover.png");
        world = getWorld();
        anzeige = new Display();
        anzeige.setImage("images/nachricht.png");
        world.addObject(anzeige, 7, 0);
        if(getY()==0)
        {
            setLocation(getX(),1);
        }
        anzeige.anzeigen("Ich bin bereit");

    }

    class Display extends Actor
    {
        GreenfootImage bild; 

        public Display()
        {
          bild = getImage();
        }

        public void act() 
        {

        }  

        public void anzeigen(String pText)
        {
           loeschen();
           getImage().drawImage(new GreenfootImage(pText, 25, Color.BLACK, new Color(0, 0, 0, 0)),10,10);

        }

        public void loeschen()
        {
            getImage().clear();
            setImage("images/nachricht.png");
        }

    }
}
