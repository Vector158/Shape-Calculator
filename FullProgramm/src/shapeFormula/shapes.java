package shapeFormula;

public abstract class shapes {
    double perimeter, area;

    public abstract void perimeter();
    public abstract void area();


    public void getPerimeter(double perimeter) {
        if (perimeter <= 0) {
            System.out.println("Invalid value. Perimeter cannot be 0 or below 0.");
            return;
        }
        this.perimeter = perimeter;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setArea(double area) {
        if (area <= 0) {
            System.out.println("Invalid value. Area cannot be 0 or below 0.");
            return;
        }
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}
