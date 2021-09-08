package oops;

public class Labrador extends Dog {
    
      private String color ;
      public Labrador(String name , String color) {
         super(name) ;
       this.setColor(color) ;
      }

      public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String speak(){
       return "Bhaw-Bhaw" ;
      }
    
}
