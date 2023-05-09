public class Course {
//Nitelikler : name,code,prefix,note,Teacher
    Teacher teacher; // teacher sınıfına eriştik.
    String dersAdi;
    String code;
    String prefix;
    int note;
    int sozlu;
//Metotlar : Course() , addTeacher() , printTeacher()
    Course( String dersAdi,String code,String prefix){
        this.dersAdi=dersAdi;
        this.code=code;
        this.prefix=prefix;
        //this.teacher=teacher;
        int note=0;
        int sozlu=0;

    }
    void addTeacher(Teacher teacher){
        if(teacher.brans.equals(this.prefix)){
            this.teacher=teacher;}
        else{
            System.out.println("Öğretmen ve ders branşları uyuşmuyor.");

        }
    }
    void printTeacherInfo(){
        this.teacher.print();
    }

}





