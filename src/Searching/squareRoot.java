package Searching;

public class squareRoot {
    public static void main(String[] args) {
        System.out.println(sR(100));
        System.out.println(sR2(4 ));
    }
    //O(root x)
    static int sR(int x){
        for(int i =1;i<=x;i++){
            if(i*i==x){
                return i;
            }
            else if(i*i>x){
                return i-1;
            }
        }
        return -1;
    }
    //O(root x)
    static int sR2(int x){
        int i = 1;
        while(i*i<=x){
            i++;
        }
        return i-1;
    }

    int sqRootFloor(int x){
        int low = 1,high = x,ans =-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int mSq = mid*mid;
            if(mSq==x){
                return mid;
            }
            else if(mSq>x){
                high = mid-1;
            }
            else{
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }


}
