public class Inclass_9_20binSearch {
    public static void main(String[] args) {
        //int [] myList={2,4,6,8,10,12,14}; //binary search to work it needs to be sorted in order
        int [] myList={4,2,9,1,3,14};

        int tok = 16;
        boolean gotIt=linearSearch(myList,tok);
        System.out.printf("Found=%s ctr:%s",gotIt,counter.ctr);
        counter.ctr=0;
        int result=binarySearch(myList,tok);
        System.out.printf("Found=%s ctr:%s",result,counter.ctr);
    }

    private static int binarySearch(int[] myList, int tok) {//this is to set your high and low numbers
        int low=0;
        int high=myList.length-1;
        int result= recursiveBinSearch(myList,tok,low,high);
        return result;
    }

    private static int recursiveBinSearch(int[] myList, int tok, int low, int high) {
        counter.ctr += 1;
        if (low>high)return -1;//Escape clause (You have a lower number higher than your highest number, cant check anything else
        int mid=(low+high)/2;//gets halfway point
        if(tok< myList[mid]){
            return recursiveBinSearch(myList, tok, low, mid-1);
        }else if(tok==myList[mid]){
            return mid;
        }
        else{
            return recursiveBinSearch(myList, tok, mid+1, high);
        }
    }

    private static boolean linearSearch(int[] myList, int tok) {
        boolean gotIt= false;
        for (int item:myList){
            counter.ctr+=1;//global variable to find the increments it takes to get it
            if (item== tok){
                gotIt=true;
                break;
            }
        }
        return gotIt;
    }
    public class counter{
        public static int ctr=0;
    }
}
