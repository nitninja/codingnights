package com.codingnights;

public class Phone {
    private String name;
    private int screensize;
    private int memoryram;
    private int camera;

    public Phone(String name, int screensize, int memoryram, int camera) {
        this.name = name;
        this.screensize = screensize;
        this.memoryram = memoryram;
        this.camera = camera;
    }

    public Phone(String name, int camera) {
        this.name = name;
        this.camera = camera;
    }

    public void music(String trackname){
       System.out.println("playing "+ trackname);
   }
   public void setName(String newname){
       this.name = newname;
       System.out.println(name);
   }
   public String getName(){
       return this.name;
   }

    public int getScreensize() {
        return screensize;
    }

    public void setScreensize(int screensize) {
        this.screensize = screensize;
    }

    public int getMemoryram() {
        return memoryram;
    }

    public void setMemoryram(int memoryram) {
        this.memoryram = memoryram;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}
