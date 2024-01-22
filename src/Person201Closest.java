public class Person201Closest {
    public static void main(String[] args) throws Exception {
        String file = "p0-person201-main/data/large.txt";

        double min = Double.MAX_VALUE;
        Person201 a = null;
        Person201 b = null;
        // TODO: finish this method 
        Person201[] people = Person201Utilities.readFile(file);
        for (Person201 p : people) {
            double d = a.distanceFrom(p);
           
            if (d < min && d!= 0) {
                min = d;
                b = p;
            }
        }
        System.out.printf("closest distance is %3.2f between %s and %s\n",min,a.getName(),b.getName());
    }

}
