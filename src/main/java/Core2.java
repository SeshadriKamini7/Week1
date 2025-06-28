import java.util.Arrays;

public class Core2 {
    public static void main(String[] args){
        int[] marks = new int[4];
        marks[0]=94;
        marks[1]=45;
        marks[2]=65;
        marks[3]=86;
        System.out.println(marks.length);
        System.out.println(marks[2]);
        Arrays.sort(marks);
        System.out.println(marks[2]);
    }
}
