public class Animal {

    private String type;
    private String sound;
    
    public Animal (String type, String sound) {
        this.type = type;
        this.sound = sound;
    }
    
    public void speak(int number){
        for (int i = 0; i < number; i++)
        {
            System.out.println(sound);
        }
    }
}