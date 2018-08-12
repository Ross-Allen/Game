import java.util.ArrayList;
/**
 *
 * @author ross
 */
public class Hand extends GroupOfCards{
    
   /**
    * Hand Constructor
    */
    public Hand(){
         group = new ArrayList<>();
    }
    
    /**
     * Override toString method
     * @return 
     */
    @Override
    public String toString(){
        String fullString = "";
        for(Card element: group){
            fullString += element.number + " of " + element.suit + ", ";
        }
        return fullString;
    }
}


