import java.util.Scanner;

class Student {
    private int no;
    private String name;
    private String major;
    private int tel;

    public void setNo(int no) {
        this.no = no;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getNo() {
        return no;
    }
    public String getName() {
        return name;
    }
    public String getMajor() {
        return major;
    }
    public int getTel() {
        return tel;
    }
    }

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] student = new Student[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하시오: ");

            int no = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            int tel = sc.nextInt();

            student[i] = new Student();

            student[i].setNo(no);
            student[i].setName(name);
            student[i].setMajor(major);
            student[i].setTel(tel);

            String phone = Integer.toString(student[i].getTel());
            String middle = phone.substring(2, 6);
            String last = phone.substring(6, 10);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        System.out.println("1번째 학생: " + student[0].getNo() + " " + student[0].getName() + " " + student[0].getMajor());
        System.out.println("2번째 학생: " + student[1].getNo() + " " + student[1].getName() + " " + student[1].getMajor());
        System.out.println("3번째 학생: " + student[2].getNo() + " " + student[2].getName() + " " + student[2].getMajor());
    }
}