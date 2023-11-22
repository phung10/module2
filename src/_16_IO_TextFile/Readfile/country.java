package _16_IO_TextFile.Readfile;

public class country {
    private int ID;
    private String Code;
    private String Name;

    public country() {
    }

    public country(int ID, String code, String name) {
        this.ID = ID;
        this.Code = code;
        this.Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Coutry: " + "ID=" + ID + ", Code= " + Code  + ", Name= " + Name  ;
    }
}
