package TaskCodewars;

public class CamelCaseMethod {
    public static void main(String[] args) {
        System.out.println(camelCase("Ghjhbvd hdcasb jdscJ"));
    }
    public static String camelCase(String str) {
        // your code here
        if(str.equals("")){
            return str;
        }
        String[] arr = str.trim().toLowerCase().replaceAll("\\s+", " ").split(" ");
        String res = "";
        for(int i = 0; i < arr.length; i ++){
            String temp = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
            res += temp;
        }
        return res.trim();
    }
}
