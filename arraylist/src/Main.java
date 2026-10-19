import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //перше завдання
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Violet");
        colors.add("Yellow");
        System.out.println(colors);
        //2
        for(int i=0; i<colors.size(); i++){
            System.out.println(colors.get(i));
        }
        //3
        colors.add(0, "Orange");
        System.out.println(colors);
        //4
        Scanner console = new Scanner(System.in);
        Integer K=console.nextInt();
        if(K<colors.size()){
            System.out.println(colors.get(K));

        }
        //5
        colors.set(4, "Pink");
        for(int i=0; i<colors.size(); i++) {


            System.out.print(colors.get(i)+" ");
        }
        //6
        colors.remove(3);
        System.out.println();
        System.out.println(colors);
        //7
        System.out.println(colors.contains("Blue"));
        String a=console.next();
        System.out.println(colors.contains(a));
        //8
        Collections.sort(colors);
        System.out.println(colors);
        //9
        ArrayList colors2=(ArrayList)colors.clone();

        colors2.add("White");
        System.out.println(colors);
        System.out.println(colors2);
        //10
        Collections.reverse(colors2);
        System.out.println(colors2);
        //11

        System.out.println(colors.equals(colors2));
        System.out.println(colors==colors2);
        //13
        System.out.println("Список порожній "+colors.isEmpty());
        //12
        colors.clear();
        System.out.println("Список порожній "+colors.isEmpty());
        //14
        colors.add("Black");
        colors.add("Gray");
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Violet");
        colors.add("Yellow");
        colors.trimToSize();
        System.out.println(colors);
        System.out.println(colors2);












    }

}