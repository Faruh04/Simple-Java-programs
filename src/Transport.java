public class Transport {

    public float speed;
    public int weight;
    public String color;
    public byte[] coordinate;


    //конструктор
    public Transport(
            float speed,
            int weight,
            String color,
            byte[] coordinate
    ){
        // Join to DB
        System.out.println("Object created");
        setValues(speed, weight, color, coordinate);
        System.out.println(getValues());
    }
    //конструктор
    public Transport(int weight, byte[] coordinate){
        System.out.println("Object created");
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println(getValues());

    }
    //Method
    public void setValues(
            float speed,
            int weight,
            String color,
            byte[] coordinate
    ){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

        //Method
    public String getValues(){

        String info = "Object speed: " + this.speed + "\nWeight: " + this.weight + "\nColor: " + this.color;
        String infoCoordinates = "\nCoordinates:\n";
        for(int i = 0; i < this.coordinate.length; i++)
            infoCoordinates += this.coordinate[i] + "\n";


        return info + infoCoordinates;



    }

}












