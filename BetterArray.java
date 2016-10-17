public class BetterArray{
    private int[] arr;
    private int size = 0;
    public static void main(String[] args){
        BetterArray test = new BetterArray();
        test.add(1);
        test.add(4);
        test.add(9);
        System.out.print(test);
        System.out.println("Length: " + test.getSize());
        System.out.println("Should be 9 "  + test.get(2));
        test.clear();
        System.out.println("Should be zero for fail... " + test.get(2));
    }
    public BetterArray(){
        //Make default length 10
        arr = new int[10];
    }
    public void add(int a){
        if (size == arr.length){
            int[] tmp = arr;
            System.out.println("Resizing to size " + arr.length);
            arr = new int[arr.length*2];

        }
        arr[size] = a;
        size+=1;
    }
    public void clear(){
        arr = new int[10];
        size = 0;
    }
    public int getSize(){
        return size;
    }
    public int get(int index){
        if(index <= size && index >= 0){
            return arr[index];
        }
        System.err.println("Invalid Index");
        return 0;
    }
    public void set(int index, int num){
    //set sepecific values whithn the array
        if (index <= size && index >= 0){
            System.err.print("ERROR: Index invalid");
        }
        else{
            arr[index] = num;
        }
    }
    //METHODS THAT ARE YET TO BE DONE
    /*
    public void remove(int index){
    //removes a value AND shrink arry size aka NO INTERNAL BLANKS
    }
    public Boolean contains(int num){
        //returns boolean of weher or not it is contained
    }
    //Xtra Methods?
    public int avg(){
        //returns average
    }
    */
    public String toString(){
        String ans = "[";
        for(int i = 0; i < size; i++){
            ans += (arr[i] + " " );
        }
        ans +=  ("]");
        return ans;
    }

}
