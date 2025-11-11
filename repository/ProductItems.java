package repository;
import java.util.ArrayList;
import entity.*;
public class ProductItems {
    ArrayList<Product> productsList = new ArrayList<>();
    public void addProduct(Product product){
        productsList.add(product);
    }
    public boolean removeProduct(Product product,int prodid){
        for(int i=0;i<productsList.size();i++){
            if(product.pid == prodid){
                productsList.remove(product);
                return true;
            }
        }
        return false;
    }
    public void displayProducts(){
        if(productsList.size()==0){
            System.out.println("No Products added yet");
            return;
        }
        for(int i=0;i<productsList.size();i++){
            Product product = productsList.get(i);
            System.out.println(product.pid+" "+product.name +" " +product.price);
            System.out.println(product.quantity+ " " +product.inStock);
        }
    }
}
