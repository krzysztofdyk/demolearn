package strings;


import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;

public class StringsMethods {

    public static void use1_strip() {
        String clearName = "Kris";
        System.out.println(clearName);
        String result1 = clearName.strip();
        System.out.println(result1);

        String nameWithWhiteSpace = " Anna ";
        System.out.println(nameWithWhiteSpace);
        String result2 = nameWithWhiteSpace.strip();
        System.out.println(result2);
    }

    public static void use2_length() {
        String clearName = "Kris";
        System.out.println(clearName);
        int result = clearName.length();
        System.out.println(result);
    }

    public static void use3_concat() {
        String clearName = "Kris";
        System.out.println(clearName);
        String result = clearName.concat(" Kros");
        System.out.println(result);
    }

    public static void use4_join() {
        List<String> namesList = List.of("Kasia", "Zosia", "Asia", "Bartek");
        List<String> uniqueNames = namesList.stream().distinct().toList();
        String allInOne2 = String.join(", ", namesList);
    }

    public static void use5_substring() {
        String name = "Krzysztof";
        String newName = name.substring(1, name.length() - 1);
        System.out.println(name);
        System.out.println(newName);
    }

    public static void use6_format() {
        final SecureRandom secureRandom = new SecureRandom();
        final int generated = secureRandom.nextInt(9999);
        final String otp = String.format("%06d", generated);
    }

    public static void use7_asii(){
        String data = "Java";
        int result = 0;
        for (int x = 0; x < data.length(); x++) {
            result += data.toLowerCase(Locale.ROOT).charAt(0);
        }
        System.out.println(result);
    }


}
