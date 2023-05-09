import java.util.Scanner;
public class Student {
    //Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
    Course c1;
    Course c2;
    Course c3;
    String ogrAd;
    String ogrNo;
    int sinif;

    double ortalama;
    boolean isPass;

    //Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
    Student(String ogrAd, int sinif, String ogrNo, Course c1, Course c2, Course c3) {
        this.ogrAd = ogrAd;
        this.sinif = sinif;
        this.ogrNo = ogrNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;
        this.ortalama = 0.0;
    }

    void sinavNotuEkle(int not1,  int not2,int not3,int s) {

        if (not1 >= 0 && not1 <= 100) {
            c1.note = not1;
            if(s>=0 && s<=100){
            c1.sozlu=s;
            }
        }

        if (not2 >= 0 && not2 <= 100) {
            c2.note = not2;
            if(s>=0 && s<=100){
                c2.sozlu=s;
            }
        }

        if (not3 >= 0 && not3 <= 100) {
            c3.note = not3;
            if(s>=0 && s<=100){
                c3.sozlu=s;
            }
        }
    }
    void isPass(){
        this.ortalama= (((c1.note*0.80)+(c1.sozlu*0.20))+((c2.note*0.80)+(c2.sozlu*0.20))+((c3.note*0.80)+(c3.sozlu*0.20)))/3;
        if(this.ortalama>55){
            System.out.println("Tebrikler "+this.ogrAd+" Sınıfı başarılı şekilde geçtiniz!");
            System.out.println("Ortalamanız: "+this.ortalama);
            this.isPass=true;
        }else{
            System.out.println(this.ogrAd+" Kaldınız...");
            this.isPass=false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(c1.dersAdi+" notu: "+c1.note);
        System.out.println(c2.dersAdi+" notu: "+c2.note);
        System.out.println(c3.dersAdi+" notu: "+c3.note);
    }
}
