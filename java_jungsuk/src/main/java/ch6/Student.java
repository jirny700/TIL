package ch6;

public class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name,int ban,int no,int kor,int eng,int math){
        this.name=name;
        this.ban=ban;
        this.no=no;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }
    public Student(){

    }

    int getTotal() {
        return (kor + eng + math);
    }

    float getAverage() {
        return (kor + eng + math) / 3;
    }
    String info(){
        return (name+","+ban+","+no+","+kor+","+eng+","+math);
    }
    String info(int a){
        return (name+","+ban+","+no+","+kor+","+eng+","+math);
    }


}