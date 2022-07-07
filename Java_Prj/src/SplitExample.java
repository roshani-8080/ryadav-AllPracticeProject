//public class SplitExample {
    public class SplitExample {
        public static void main(String[] args)
        {
            String str = "I love Java Technology";
            String[ ] s;
            s = str.split(" ");
            int length = str.length();
            //int length = s.length;

            for(int i = 0;  i < length; i++) {
                System.out.println(s[i]);
            }
        }
    }

