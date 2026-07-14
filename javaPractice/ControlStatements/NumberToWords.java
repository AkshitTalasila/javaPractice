public class NumberToWords {
    public static void numberToWords(int num) {
        int no = reverse(num);
        String numInWords = "";

        if (num < 0) {
            System.out.println("Invalid Value");
        } else if (num == 0) {
            numInWords += "Zero";
        } else {
            while (no > 0) {
                switch (no % 10) {
                    case 0 -> numInWords += "Zero ";
                    case 1 -> numInWords += "One ";
                    case 2 -> numInWords += "Two ";
                    case 3 -> numInWords += "Three ";
                    case 4 -> numInWords += "Four ";
                    case 5 -> numInWords += "Five ";
                    case 6 -> numInWords += "Six ";
                    case 7 -> numInWords += "Seven ";
                    case 8 -> numInWords += "Eight ";
                    case 9 -> numInWords += "Nine ";
                    default -> numInWords = numInWords;
                };
                no = no / 10;
            }

            if ((getDigitCount(num) - (getDigitCount(reverse(num)))) > 0) {
                int i = (getDigitCount(num) - (getDigitCount(reverse(num))));
                while (i > 0) {
                    numInWords += "Zero ";
                    i--;
                }
            }
        }

        System.out.println(numInWords);
    }

    public static int reverse(int num) {
        int rev = 0;
        int no = 0;

        if (num < 0) {
            no = num * -1;
            for (int i = no; i > 0; i = i) {
                rev = rev * 10;
                rev += i % 10;
                i = i / 10;
            }
            return rev * -1;
        } else {
            for (int i = num; i > 0; i = i) {
                rev = rev * 10;
                rev += i % 10;
                i = i / 10;
            }
            return rev;
        }
    }

    public static int getDigitCount(int num) {
        int count = 0;

        if (num < 0) {
            return -1;
        } else if ((num / 10 == 0) && (num >= 0)) {
            return 1;
        } else {
            while (num > 0) {
                if ((num) > 0) {
                    count++;
                }
                num = num / 10;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        numberToWords(11212);
    }
}
