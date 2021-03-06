package jchan.calabash.formation;

import jchan.calabash.creatures.Creature;

public class Henge extends Formation {    private int x;
    private int y;
    private int z;
    public Henge(int x,int y,int z,int number){
        super(x,y,z,number);
    }
    public Henge(int x,int y,int number){
        this(x,y,0,number);
    }
    @Override
    public void sort(Creature[] creatures, int i){
        x = x0 + (int)Math.pow(-1,(creatures[i].getRange() + 1)) * (creatures[i].getRange() + 1) / 2;
        y = y0 + (int)(Math.pow(-1,(creatures[i].getRange() + 3) / 2) * 0.5 + 0.5);;
        z = z0;
        creatures[i].exchange(x,y,z);
    }
}
