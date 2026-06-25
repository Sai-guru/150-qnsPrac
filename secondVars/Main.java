//ip = "I love India";
//op = "India love I"

public class Main {
    public static void main(String[] args) {

        String str = "I love India";
        String res = "",word = "";

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)!=' ') word+=str.charAt(i);

            else {
                res = word+" "+res;
                // System.out.println(res);
                word = "";
            }
        }
          res = word+" "+res; //last time for last word
        System.out.println(res);

    }
}