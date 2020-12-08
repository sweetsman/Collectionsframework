//使用链表和映射存放多个图书信息，遍历并输出。
//其中商品属性：编号，名称，单价，出版社；使用商品编号作为映射中的key。
package work.w1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
public class test {
    public static void main(String[] args) {
        //new几个Books对象
        Books books1 = new Books(01, "bookA", 01.00, "A出版社");
        Books books2 = new Books(02, "bookB", 02.00, "B出版社");
        Books books3 = new Books(03, "bookC", 03.00, "C出版社");
        Books books4 = new Books(04, "bookD", 04.00, "D出版社");
        Books books5 = new Books(05, "bookE", 05.00, "E出版社");

        HashMap<Integer, Books> booksHashMap = new HashMap<>();
        booksHashMap.put(books1.getNum(), books1);
        booksHashMap.put(books2.getNum(), books2);
        booksHashMap.put(books3.getNum(), books3);
        booksHashMap.put(books4.getNum(), books4);
        booksHashMap.put(books5.getNum(), books5);

        List<HashMap<Integer, Books>> booksList = new ArrayList<>();
        booksList.add(booksHashMap);

        System.out.println("编号\t名称\t单价\t出版社");
        System.out.println("----------------------------------");
        for (HashMap<Integer, Books> h : booksList) {
            //获取key
            Set<Integer> key = h.keySet();
            for (Integer i : key) {
                //再通过key找value
                System.out.println(i
                        + "\t\t" + h.get(i).getName()
                        + "\t" + h.get(i).getPrice()
                        + "\t\t" + h.get(i).getPress());
            }
        }
    }
}
