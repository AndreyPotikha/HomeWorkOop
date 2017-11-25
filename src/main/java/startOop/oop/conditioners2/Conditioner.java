package startOop.oop.conditioners2;

public class Conditioner {

    private String status;
    private String name;

    public void getTurn(Conditioner conditioner) {
        System.out.println(conditioner);
    }
    public void getOff(Conditioner conditioner) {
        conditioner.setStatus("Off");
    }
    public void getOn(Conditioner conditioner) {
        conditioner.setStatus("On");
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Conditioner{" + "status='" + status + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
