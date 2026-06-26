package thirdTen;

// Find result after alternate add_sub on N
// Example 1: N = 6, opt = 1({Result}=6-5+4-3+2-1={3})
// Example 2: N = 6, opt = 2({Result}=6+5-4+3-2+1={9})

//opt = 1 => start the 1th index with minus
//opt = 2 => start the 1th index with plus

public class AlternateAddSon {

    public static int alternateAddSub(int n,int OPT) {

        int res = n;
        
        boolean isPlus;
        if(OPT==2) isPlus = true;
        else isPlus = false;


        for(int i=n-1;i>=1;i--) {

            if(isPlus) res+=i;
            else res-=i;

            isPlus = !isPlus; //+,-...or -,+...
        }
        return res;
    

    }




    public static void main(String[] args){

        int N =6;
        int opt =2;
        System.out.println(alternateAddSub(N,opt));
    }
}
