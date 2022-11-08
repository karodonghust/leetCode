package IntegerToRoman;

public class IntegerToRoman {


    public static void main(String[] args) {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        System.out.println(integerToRoman.intToRoman(1994));
    }


    public String intToRoman(int num) {
        int[] number = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] label = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length; i++) {
            int temp = num / number[number.length - 1 - i];
            for (int j = 0; j < temp; j++) {
                sb.append(label[number.length - 1 - i]);
            }
            num = num % number[number.length - 1 - i];
        }

        return sb.toString();
    }
}
