package collection.wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {
    private static int maxSize=1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();

        //1 将字符串以行的结构输入,存入列表
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        //2.将列表内的数据拆分为多重列表
        List<List<String>> lists = getList(list);
        //3 输入到新的列表
        int size = (lists.size()+1)*(maxSize+1);
        String[] st = new String[size];
        for (int i = 0; i < lists.size(); i++) {
            for (int i1 = 0; i1 < lists.get(i).size(); i1++) {
                st[(i+1)*(i1+1)]+=lists.get(i).get(i1);
            }
        }
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);
        }
    }
    static List<List<String>> getList(List<String> list){

        //多条数据转化结果
        List<List<String>> lists = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            maxSize=list.size()>maxSize?list.size():maxSize;
            ArrayList<String> strings = new ArrayList<>();
            String s = list.get(i);
            String[] ss = s.split(" ");
            for (int i1 = 0; i1 < ss.length; i1++) {
                strings.add(ss[i]);
            }
            lists.add(strings);
        }
        return lists;
    }
}
