package Chair;

public class Client {
    Chair chair;

    public void sit(){
        System.out.println("Сесть на " + Chair.class.getName());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
