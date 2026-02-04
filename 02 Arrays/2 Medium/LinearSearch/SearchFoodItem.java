public class SearchFoodItem{
    
    public static int searchItem(String items[], String name){
        for(int i=0; i<items.length; i++){
            if(name == items[i]){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String items[] = { "Dosa", "Pizza", "Burger", "Noodles", "Pastry"};
        String name = "Noodles";
        int res = searchItem(items, name);
        if(res == -1){
            System.out.println("Not Found!");
        } else{
            System.out.println("Item found at index: " + res);
        }
    }
}