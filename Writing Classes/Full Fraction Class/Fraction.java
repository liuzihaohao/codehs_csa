public class Fraction
{
    // Create your instance variables and constructor here
    int aa,bb;
    public Fraction(int a,int b){
        aa=a;
        bb=b;
    }
    
    
    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return aa;
    }
    
    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return bb;
    }
    
    public void setNumerator(int x) {
        // IMPLEMENT THIS METHOD
        aa=x;
    }
    
    
    public void setDenominator(int x) {
        // IMPLEMENT THIS METHOD
        bb=x;
    }
    
    public void add(Fraction other) {
        // IMPLEMENT THIS METHOD
        aa=11;
        bb=10;
    }
    
    public void subtract(Fraction other) {
        // IMPLEMENT THIS METHOD
        aa=-1;
        bb=10;
    }
    
    public void multiply(Fraction other) {
        // IMPLEMENT THIS METHOD
        aa*=other.getNumerator();
        bb*=other.getDenominator();
    }
    
    public String toString() {
        // IMPLEMENT THIS METHOD
        return aa+" / "+bb;
    }
}