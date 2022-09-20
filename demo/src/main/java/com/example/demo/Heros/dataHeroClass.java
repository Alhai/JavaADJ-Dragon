package com.example.demo.Heros;

public class dataHeroClass  {
    private int Id;
    private String Name;
    private String Type;
    private int Hp;

   public  dataHeroClass(int pId, String pName, String pType, int pHp){
        this.Id = pId;
        this.Name = pName;
        this.Type = pType;
        this.Hp = pHp;

    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getType() {
        return Type;
    }

    public int getHp() {
        return Hp;
    }
}

