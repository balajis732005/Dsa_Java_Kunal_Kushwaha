package INBUILT_METHODS_AND_FUNCTIONS;

public class STRINGBUILDER_CLASS {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for(char i='a';i<='z';i++){
            sb.append(i);
        }
        StringBuilder hw=new StringBuilder();
        hw.append("balaji");
        hw.append("ecea");
        hw.append("coderjava");
        hw.append("ecea");
        System.out.println(sb.toString());
        sb.deleteCharAt(7);
        System.out.println(sb.toString());
        sb.delete(2,4);
        System.out.println(sb.toString());
        System.out.println(sb.compareTo(hw));
        System.out.println(sb.indexOf("fgh"));
        System.out.println(hw.indexOf("ecea",14));
        sb.delete(2,6);
        System.out.println(sb.toString());
        System.out.println(sb.length());
        System.out.println(sb.isEmpty());
        System.out.println(sb.charAt(0));
    }
}
