//由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，当输入的内容为exit退出；
//将输入的学生信息分别封装到一个Student对象中，再将每个Student对象加入到一个集合中，要求集合中的元素按照年龄大小正序排序；
//最后遍历集合，将集合中学生信息写入到记事本，每个学生数据占单独一行。
package work.w2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        Set<Student> stuSet = saveStudentInfo();
        outputInfo(stuSet);
    }
    private static Set<Student> saveStudentInfo() {
        Scanner input = new Scanner(System.in);
        Set<Student> stuSet = new TreeSet<Student>();
        while (true){
            System.out.println("请输入学生信息（学号 姓名 年龄）");
            String inputData = input.nextLine();
            if ("exit".equals(inputData)){
                break;
            }
            String [] info = inputData.split(" ");
            Student stu = new Student(Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]));
            stuSet.add(stu);
        }
        return stuSet;
    }
    private static void outputInfo(Set<Student> stuSet){
        File file = new File("e:/student.txt");

        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            Iterator<Student> it = stuSet.iterator();
            fw.write("学  号\t姓  名\t年  龄\n");
            fw.write("------------------------------\n");
            while (it.hasNext()){
                String info = it.next().toString();

                fw.write(info);

                fw.write("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}