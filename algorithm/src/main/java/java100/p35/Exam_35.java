package java100.p35;

public class Exam_35 {
    public static void main(String[] args) {
        //[1]: String 1차원 배열-->3개의 문자열을 담을 수 있는 배열 생성하기
        //String 타입의 참조변수 3개를 저장하기 위한 공간 생성-->이때 참조형 변수 각 요소는 기본값-->String은 null로 초기화.
        String[] province = new String[3];
        System.out.println(province[0]);//-null값 출력
        System.out.println(province[1]);
        System.out.println(province[2]);

        //[2] String 배열 초기화-->직접입력
        province[0] = "강원도";
        province[1] = "전라도";
        province[2] = "경상도";
        System.out.println(province[1]);

        //[3]String배열 초기화-->배열 선언 및 생성시{}로 동시에 초기화
        String[] nation = new String[]{"한국", "중국", "미국"};
        System.out.println(nation[1]);

        String[] flower = new String[]{"무궁화", "해바라기", "개나리"};
        System.out.println(flower[1]);

        //[4]: 반복문을 사용하여 배열 값 모두 출력
        for (int i = 0; i < flower.length; i++) {
            System.out.println(flower[i]);
        }

        //[5]: 향상된 for문으로 배열 요소 출력
        for (String aaa : flower) {
            System.out.println(aaa);
        }

        //[6]String 2차원 배열 만들기-->2*3
        //아시아-->동북아시아(한국,중국,일본),동남아시아(태국,필리핀,베트남)
        String [][] asiaNations = {{"한국","중국","일본"},{"태국","베트남","필리핀"}};
        System.out.println(asiaNations[0]);//참조값이 출력됨
        System.out.println(asiaNations[0][1]);//중국: 실제 요소의 값 출력

        System.out.println(asiaNations.length);//2
        System.out.println(asiaNations[0].length);//3
        System.out.println(asiaNations[1].length);//3

        //[7]: 반복문을 사용한 String 2차원 배열 값 출력
        for (int i = 0; i < asiaNations.length; i++) {
            for (int j = 0; j < asiaNations[i].length; j++) {
                System.out.println(asiaNations[i][j]);
            }
        }

        //[8]charAt()메서드 사용-->해당 인덱스에 있는 값을 반환-->단어를 char배열에 한글자씩 저장할 수 있음.
        String[] strAr={"hong","kim","park"};
        System.out.println(strAr[0].charAt(2));

        //[9]: 반복문에서 charAt()메서드사용 
        //[9-1]잘못된 예 //->h i r 출력
        for (int  i = 0;  i < strAr.length;  i++) {
            System.out.println(strAr[i].charAt(i));
        }
        //[9-2]잘못된 예 //->hon kim par 출력
        for (int i = 0; i < strAr.length; i++) {
            for (int j = 0; j < strAr.length; j++) {
                System.out.println(strAr[i].charAt(j));
            }
        }
        //[9-3]
        System.out.println(strAr.length);//3
        //System.out.println(strAr[0].length());//err/ 이중배열이 아니기 때문에
        System.out.println(strAr[0].length());//4
        for (int i = 0; i < strAr.length; i++) {
            for (int j = 0; j < strAr[i].length(); j++) {
                System.out.println(strAr[i].charAt(j));
            }
        }

        //[10]length vs length()
        int[] aaa= new int[10];
        System.out.println(aaa.length);//10

        String bbb="Welcome to Seoul";
        System.out.println(bbb.length());//16
    }
}
