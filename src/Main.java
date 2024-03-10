public class Main {
    public static void main(String[] args) throws Exception {
        
        List<String> list = new List<>(5);

        for(int a=0; a<5; a++){

            list.add(a + "");

        }

        list.print();

        System.out.println("");

        list.set(4, "2");

        String[] f = {"1", "2", "2", "2"};

        list.change(f);

        list.print();

        System.out.println("");

        // System.out.println(list.getSize());

        for(int i : list.getIndex("2")){
            System.out.println(i);
        }

        System.out.println("");

        list.clear();

        list.print();

        String[] g = {"1", "2", "2", "2"};

        System.out.println("");

        list.change(g);

        list.print();

        System.out.println("");

        for(String i : list.takeArray()){
            System.out.println(i);
        }

        list.isContains("2");

        list.numberOfContains("2");
        
        for(int h = 0; h<list.subArray(1, 3).length; h++){
            System.out.println(list.subArray(1, 3)[h]); 
        }
    
    }
}
