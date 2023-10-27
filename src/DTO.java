public class DTO {
    public Integer Q1;
    public Integer Q2;
    public Integer Q3;
    public Integer Q4;
    public Integer angulo1;
    public Integer angulo2;
    public Integer angulo3;
    public Double longitud;
    public Double CA;
    public Double CO;
    public Double HIP;

    public DTO(Integer q1, Integer q2, Integer q3, Integer q4, Integer angulo1, Integer angulo2, Double longitud) {
        Q1 = q1;
        Q2 = q2;
        Q3 = q3;
        Q4 = q4;
        this.angulo1 = angulo1;
        this.angulo2 = angulo2;
        this.longitud = longitud;
    }

    public DTO(Integer q1, Integer q2, Integer q3, Integer angulo1, Integer angulo2, Integer angulo3, Double CA, Double CO, Double HIP) {
        Q1 = q1;
        Q2 = q2;
        Q3 = q3;
        this.angulo1 = angulo1;
        this.angulo2 = angulo2;
        this.angulo3 = angulo3;
        this.CA = CA;
        this.CO = CO;
        this.HIP = HIP;
    }

    public DTO() {

    }

    @Override
    public String toString() {
        return "DTO{" +
                "Q1=" + Q1 +
                ", Q2=" + Q2 +
                ", Q3=" + Q3 +
                ", Q4=" + Q4 +
                '}';
    }
}
