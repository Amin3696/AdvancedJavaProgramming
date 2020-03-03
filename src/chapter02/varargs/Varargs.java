package chapter02.varargs;

/**
 * @author Amin Shahimian
 */
public class Varargs {
    public static void main(String[] args) {
        String item1 = "apple";
        String item2 = "bread";
        String item3 = "milk";
        String item4 = "orange";
        String[] shoppingList = {"koskos", "homus", "kornspitz", "yoguhrt"};
        printShoppingList(item1, item2, item3, item4);
        printShoppingList(item1, item2);
        printShoppingList(shoppingList);

    }

    //St may need to write a method which should be executable with different number of arguments
    //we use Variable length arguments (chapter02.varargs) and write one method instead of
    //overwrite the several methods with different number of args

    private static void printShoppingList(String... item) {
        System.out.println("Shopping list:");
        /*for (String item : item) {
            System.out.println(item);
*/
        for (int i = 0; i < item.length; i++) {
            System.out.println(i + 1 + ":" + item[i]);
        }
    }
}



