import java.util.Arrays;

public class List <T> {

    protected T[] array;

    public int lastInd = 0;

    public List(){// Constructor

        this.array = (T[]) new Object[10];

    }

    public List(int length){ // Overloaded constructor

        if(length < 0){
            System.out.println("List length can't be negative");
        }else{
            this.array = (T[]) new Object[length];
        }
        
    }

    public void change(T[] arra){

        this.array = arra;
        int tempInd = 0;
        for(int a=0; a<arra.length; a++){
            if(arra[a] != null){
                tempInd++;
            }
        }
        this.lastInd = tempInd;

    }

    public T[] takeArray(){

        return this.array;

    }

    public T[] subArray(int f, int l){// girilen indexler arasında bir alt dizi döndürür

        T[] sub = Arrays.copyOfRange(this.array, f, l + 1);
        
        return sub;

    }

    public int getSize(){// dizi eleman sayısını döndürür

        return this.lastInd;

    }

    public int getLength(){// dizi uzunluğunu döndürür

        return this.array.length;

    }

    public void add(T data){// dizinin sonuna eleman ekler

        if(this.lastInd == this.array.length){//dizi tam dolu ise fazladan bir index ekler
          
            plusLength(1);

        }

            this.array[this.lastInd++] = data;
        
    }

    public void print(){// toString işlevi görüyor

        for(T i : this.array){

            System.out.println(i);

        }

    }

    public T getData(int i){// i indexindeki elemanı döndürür

        return this.array[i];

    }

    public int[] getIndex(T data){

        int[] datas = new int[1];

        int sayac = 0;

        for(int a=0; a<this.array.length; a++){

            if(this.array[a].equals(data)){

                datas[sayac] = a;
                sayac++;
                int[] b = new int[datas.length+1];
                putCertain(datas, b);
                datas = new int[datas.length+1];
                datas = b;

            }

        }

        int[] k = new int[datas.length-1];

        for(int a=0; a<datas.length-1; a++){

            k[a] = datas[a];

        }        

        datas = k;


        return datas;

    }

    public void remove(int i){// i indexindeki elemanı siler

        if(i < 0 || i > this.array.length){
           
            System.out.println("null");
            
        }else{
        
            T[] b = (T[]) new Object[this.array.length-1];
            int bInd = 0;
            int a = 0;
            while(a < this.array.length){

                if(a != i){

                    b[bInd] = this.array[a];
                    bInd++;
                    a++;

                }else{
                    a++;
                }

            }

            this.array = b;
            lastInd--;

        }

    }

    public void set(int i, T data){

        try{
            this.array[i] = data;
        }catch(Exception e){
            System.out.println("null");
        }

    }

    public void plusLength(int plusLength){ // a dizisini plusLength kadar uzatır

        T[] b = (T[]) new Object[array.length+plusLength];
        put(this.array, b);
        this.array = (T[]) new Object[array.length+plusLength];
        this.array = b;

    }

    public void put(T[] a, T[] b){// a listesini b'nin içine koyar

        int i = 0;
        while(i < a.length){
            b[i] = a[i++];
        }

    }

    public void clear(){

        int a = 0;
        while(a < this.array.length){

            array[a] = null;
            a++;
        }

    }

    public boolean isContains(T data){

        boolean state = false;

        int sayac = 0;

        for(int a=0; a<this.array.length; a++){

            if(array[a] == data){

                state = true;
                sayac++;

            }

        }

        return state;

    }

    public int numberOfContains(T data){

        int sayac = 0;

        for(int a=0; a<this.array.length; a++){

            if(array[a] == data){

                sayac++;

            }

        }

        return sayac;

    }

    protected void plusLengthCertain(int[] a, int plusLength){ // a dizisini plusLength kadar uzatır

        int[] b = new int[a.length+plusLength];
        putCertain(a, b);
        a = new int[a.length+plusLength];
        a = b;

    }

    protected void putCertain(int[] a, int[] b){// a listesini b'nin içine koyar

        int i = 0;
        while(i < a.length){
            b[i] = a[i++];
        }

    }

    protected void removeCertain(int[] l, int i){// i indexindeki elemanı siler

        int[] k = new int[l.length-1];

        for(int a=0; a<l.length-i; a++){

            k[a] = l[a];

        }        

        l = k;

    }

}
