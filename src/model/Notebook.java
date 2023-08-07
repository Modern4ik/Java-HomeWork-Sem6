package model;

public class Notebook {
    private String ram;
    private String diskCap;
    private String operSystem;
    private String color;

    public String getOperSystem(){
        return this.operSystem;
    }
    
    public String getColor(){
        return this.color;
    }

    public String getRam(){
        return this.ram;
    }

    public String getdiskCap(){
        return this.diskCap;
    }

    @Override
    public String toString(){
        return String.format("ОС: %s\n" + 
                             "Цвет: %s\n" +
                             "Объем RAM: %s\n" +
                             "Объем HDD: %s\n", this.operSystem,
                             this.color, this.ram, this.diskCap);
    }

    public Notebook() {}

    public Notebook(String bookRam, String bookDiskCap, String bookOperSys, String bookColor) {
        this.ram = bookRam;
        this.diskCap = bookDiskCap;
        this.operSystem = bookOperSys;
        this.color = bookColor;
    }

    
}