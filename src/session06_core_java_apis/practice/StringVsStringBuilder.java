package session06_core_java_apis.practice;

public class StringVsStringBuilder {

    public static void main(String[] args) {
        //using String
        String str = "";
        for (int index = 0; index < 10; index++) {
            str += "world" + index + " ";
        }
        System.out.println("Final string using String: " + str);

        //using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            stringBuilder.append("world").append(index).append(" ");
        }
        System.out.println("Final stringBuilder using StringBuilder: " + stringBuilder);
        System.out.println(stringBuilder.reverse());

        String name = "John";
        name.replace('O', 'a');
        System.out.println(name);
    }
}
