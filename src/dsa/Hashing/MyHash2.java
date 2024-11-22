package dsa.Hashing;

public class MyHash2 {

    int arr[];
    int cap;
    int size;

    MyHash2(int c){
        cap = c;
        size =0;
        arr = new int[cap];
        for(int i =0;i< cap;i++)
            arr[i] = -1;

    }

    int hashKey(int key){
        return  key % cap;
    }

    boolean search(int key){
        int h = hashKey(key);
        int i =h;

        while (arr[i] !=-1){
            if(arr[i] == key)
                return true;
            i = (i + 1) % cap;
            if(i==h)
                return false;
        }
        return false;
    }

    boolean insert(int key){
        if(size==cap)
           return false;

        int i = hashKey(key);

        while (arr[i] !=-1 && arr[i] !=-2 && arr[i] != key)
            i = (i+1)%cap;

        if(arr[i]==key)
            return false;
        else {
            arr[i]=key;
            size++;
            return true;
        }
     }

     boolean remove(int key){
         int h = hashKey(key);
         int i =h;

         while (arr[i] !=-1){
             if(arr[i] == key) {
                 arr[i] = -2;
                 return true;
             }
             i = (i + 1) % cap;
             if(i==h)
                 return false;
         }
         return false;

     }

     void getAll(){
       //  int index = 0;
         for(int i =0;i<cap;i++)
             if(arr[i]!=-1 && arr[i]!=-2)
                    System.out.println(arr[i]);


     }


    public static void main(String[] args)
    {
        MyHash2 mh = new MyHash2(7);
        mh.insert(49);
        mh.insert(56);
        mh.insert(72);
        if(mh.search(56)==true)
            System.out.println("Yes");
        else
            System.out.println("No");
        mh.getAll();
        mh.remove(56);
        if(mh.search(56)==true)
            System.out.println("Yes");
        else
            System.out.println("No");

       // mh.getAll();

    }
}
