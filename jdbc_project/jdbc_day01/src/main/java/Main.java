// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;

public class Main {
    public class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }
    public static void getS(Node n1,Node n2){
        while(n1 !=null && n2!=null){
            if(n1.value<n2.value){
                n1=n1.next;
            }else if(n1.value>n2.value){
                n2=n2.next;
            }else if(n1.value == n2.value){
                System.out.println(n1.value+" ");
                n1=n1.next;
                n2=n2.next;
            }
        }
    }
    public static void main(String[] args) {
        Node n11 = null;
        Node n22 = null;
        Node n1=n11.next;
        Node n2=n22.next;
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            n1.next.value = sc.nextInt();
            n1=n1.next;
        }
        int b=sc.nextInt();
        for(int i=0;i<b;i++){
            n2.next.value = sc.nextInt();
            n2=n2.next;
        }
        getS(n11,n22);
    }

}