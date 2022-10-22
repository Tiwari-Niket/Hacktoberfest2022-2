import java.lang.Math;
class maxSubArrayIII{
    public static void maxSubArray(int number[]){
         int ms=Integer.MIN_VALUE;
         int cs=0;

          for(int i=0; i<number.length; i++){
              cs = cs + number[i];
              if(cs<0){
                  cs=0;
              }
              ms = Math.max(ms, cs);
          }       
        System.out.println("our max subarray sum =" + ms);
    }

    public static void main(String[] args) {
        int number[] = {-1, -5, -27, -5, -63, -9};

        maxSubArray(number);
    }
}
