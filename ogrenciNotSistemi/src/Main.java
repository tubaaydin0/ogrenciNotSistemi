import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Teacher t1=new Teacher("Tuğçe Çoban","Mat","555");
       Teacher t2=new Teacher("Ahmet Yılmaz","Trh","554");
       Teacher t3=new Teacher("Sude Erbaş","Ing","553");
       Course course1=new Course("Matematik","101","Mat");
       Course course2=new Course("Tarih","102","Trh");
       Course course3= new Course("İngilizce","103","Ing");
       Student s1=new Student("Elçin Yaşar",10,"123",course1,course2,course3);
       Student s2=new Student("Yakup Koçer",9,"456",course1,course2,course3);
       Student s3=new Student("Sıla Koşar",11,"789",course1,course2,course3);
       s1.sinavNotuEkle(100,100,100,100);
       s1.isPass();



    }
}