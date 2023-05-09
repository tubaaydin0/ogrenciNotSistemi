import javax.sound.midi.Soundbank;

public class Teacher {
    //Nitelikler : name,mpno,branch
    String ogretmen;
    String telNo;
    String brans;
    //Metotlar : Teacher()
    public Teacher(String ogretmen,String brans, String telNo){
        this.ogretmen=ogretmen;
        this.brans=brans;
        this.telNo=telNo;


    }
    void print(){
        System.out.println("Adı: "+this.ogretmen);
        System.out.println("Branşı: "+this.brans);
        System.out.println("Telefonu: "+this.telNo);

    }
}
