import java.util.Scanner;

class vowels {
    public static void main(String args[]) {
        String str;
        int count=0;
        char[] vowels = new char[] {'a','e','i','o','u'};
        Scanner get = new Scanner(System.in);
        System.out.println("Enter a String:");
        str = get.nextLine().toLowerCase();
        for(int i=0;i<str.length();i++) {
            for(int j=0;j<5;j++) {
                if((str.charAt(i)) == vowels[j]) {
                    count++;
                }
            }
        }
        if(count>1) {
            System.out.println("Number of Vowels present in the given String: "+count);
        }
        else {
            System.out.println("There are no vowels present in the given String!");
        }
    }
}