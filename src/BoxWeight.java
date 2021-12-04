public class BoxWeight extends Box {
    private int weight;


    public BoxWeight(double width, double height, double length, int weight){
        super(width,height,length);
        this.weight=weight;
    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(weight);
    }

}
