public class Food
{
        //Declare instance variables
        private String name;
        private int calories;
        
        //Create Food Constructor
        public Food(String tmp,int tmp2){
            name=tmp;
            calories=tmp2;
        }
        
        //Add getter and setter methods for calories
        public String getName(){
            return name;
        }
        public int getCalories(){
            return calories;
        }
        public void setName(String tmp){
            name=tmp;
        }
        public void setCalories(int tmp){
            calories=tmp;
        }
        
        //Add getter and setter methods for name
        
        
        //Add toString method
        public String toString(){
            return name+" have "+calories+" calories.";
        }
    
}